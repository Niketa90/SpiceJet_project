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
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		 
		  
		  WebElement dateBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='css-1dbjc4n r-18u37iz']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n']//*[name()='svg']")));
		  dateBtn.click();
		  String cmonth=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'][normalize-space()='March 2023'][1]")).getText().trim();
		  String cyear=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'][normalize-space()='March 2023'][1]")).getText().trim();
		  WebElement next;
		  
		  while((!cmonth.equals(emonth)) || (!cyear.equals(eyear))){
			  next=driver.findElement(By.xpath("//div[@class='r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-1i6wzkk r-lrvibr r-184en5c css-1dbjc4n']//*[name()='svg']//*[name()='g' and contains(@fill,'none')]//*[name()='circle' and contains(@cx,'24.5')]"));
			  next.click();
			  cmonth=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'][normalize-space()='March 2023'][1]")).getText().trim();
			  cyear=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'][normalize-space()='March 2023'][1]")).getText().trim();
		  }
	}
	}
}
