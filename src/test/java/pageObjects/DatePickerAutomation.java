package pageObjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import spiceJetproject.Baseclass;

public class DatePickerAutomation extends Baseclass{
	public static WebDriver driver;
	
	public DatePickerAutomation(WebDriver driver) {
		this.driver=driver;
		  PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}
	
	
	@Test
	public void testing(){
	
	
	
	{
	  String expectedDate = "26-December-2023";
		String emonth = expectedDate.split("-")[1];
		String eyear = expectedDate.split("-")[2];
		String edate = expectedDate.split("-")[0];
		System.out.println(emonth+"***"+eyear+"***"+edate);
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
		  
		 //filling depart date
		  
		  WebElement dateBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='css-1dbjc4n r-18u37iz']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n']//*[name()='svg']")));
		  dateBtn.click();
		  String cmonthandyear=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'][normalize-space()='March 2023'][1]")).getText().trim();
		 // String cyear=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'][normalize-space()='March 2023'][1]")).getText().trim();
		
		  WebElement next;
		  
		  System.out.println("passed");
		  while((!cmonthandyear.equals(emonth)) || (!cmonthandyear.equals(eyear))){
			  next=driver.findElement(By.xpath("//div[2]/div[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='circle'][1]"));
			  System.out.println("selected");
			  next.click();
			  System.out.println("clicked");
			  cmonthandyear=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'][normalize-space()='March 2023'][1]")).getText().trim();
			 // cyear=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'][normalize-space()='March 2023'][1]")).getText().trim();
			  System.out.println(cmonthandyear);
			  
			  
			  		  
		  }
		  List<WebElement> dates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
			
			for(WebElement e: dates) {
				if(e.getText().trim().equals(edate)){
					e.click();
					break;
		  
	}
	}
	}
}
