package pageObjects;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import spiceJetproject.Baseclass;

public class OneWaytrip extends Baseclass {
	 
		public  WebDriver driver;
		
		
		  @FindBy (xpath="//div[contains(text(),'one way')]")
		  WebElement onewayRadio;
		  
		  @FindBy (xpath="//div[contains(text(),'From')]")
		  WebElement From;
		  
		  @FindBy (xpath="//div[contains(text(),'Raja Bhoj Airport')]")
		  WebElement Bhopal;
		  
		  @FindBy (xpath="//div[@data-testid='to-testID-destination']")
		  WebElement To;
		  
		  @FindBy (xpath="(//div[contains(text(),'Chennai')])[1]")
		  WebElement Chennai;
		  
		  @FindBy (xpath="//div[contains(text(),'Departure Date')]")
		  WebElement DepartDate;
		  
		  @FindBy (xpath="//div[@data-testid='undefined-month-April-2023']//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n r-6koalj r-18u37iz r-d0pm55']//div[@data-testid='undefined-calendar-day-29']")
		  WebElement Date;
		  
		  @FindBy (xpath="//div[@data-testid='home-page-travellers']")
		  WebElement Travellers;
		  
		  @FindBy (xpath="//div[@data-testid='Adult-testID-plus-one-cta']")
		  WebElement Adultcount;
		  
		  @FindBy (xpath="//div[@data-testid='home-page-travellers-done-cta']")
		  WebElement Done;
		  @FindBy (xpath="//div[5]/div[2]/div[1]/div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")
		  WebElement currency;
		  
		  @FindBy (xpath="//select[text()='INR']")
		  WebElement IndRupee;
		  @FindBy (xpath="//div[@data-testid='home-page-flight-cta']")
		  WebElement SearchFlights;
		  
		  @FindBy (xpath="//div[@data-testid='undefined-month-March-2023']//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n r-6koalj r-18u37iz r-d0pm55']//div[@data-testid='undefined-calendar-day-24']")
		  WebElement DateofDeparture;
		  
		  
		
		public OneWaytrip(WebDriver driver) {
			this.driver=driver;
			  PageFactory.initElements(driver, this);
				// TODO Auto-generated constructor stub
			}

		public void onewayRadio() {
			 this.onewayRadio.click();
			 
		  }
		public void from() {
			 this.From.click();
			 Actions object = new Actions(driver);
			 object.moveToElement(Bhopal).build().perform();
			 this.Bhopal.click();
			// this.From.sendKeys("BHO");
			 
		  }
		public void To() {
			 this.To.click();
			 Actions object = new Actions(driver);
			 object.moveToElement(Chennai).build().perform();
			 this.Chennai.click();
			 
			// this.From.sendKeys("BHO");
			 
		  }
		public void Departuredate() throws Exception {
			//driver.switchTo().frame(4);
			Thread.sleep(4000);
			Actions object = new Actions(driver);
			 this.DepartDate.click();
			 
			 WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
			 this.Travellers.click();
			 Thread.sleep(3000);
			 this.Adultcount.click();
			 System.out.println("Adultcount");
			// object.scrollToElement(Done).build().perform();
			// wait.until(ExpectedConditions.visibilityOf(Done));
			 
			 this.Done.click();
//			 wait.until(ExpectedConditions.visibilityOf(Done));
//			 JavascriptExecutor js = (JavascriptExecutor)driver;
//			js.executeScript("arguments[0].click();", Done);

//			 JavascriptExecutor js = (JavascriptExecutor) driver;
//			 js.executeScript("arguments[0].click();",Date);
//			 clickElementByJS(driver,Date);
			 
		}
		
 			
		
		public void search() {
			 SearchFlights.click();
		}
		
			 
		  
		
		  }

