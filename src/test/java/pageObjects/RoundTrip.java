package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import spiceJetproject.Baseclass;

public class RoundTrip extends Baseclass {
	
	 @FindBy (xpath="//div[contains(text(),'round trip')]")
	  WebElement RoundTripRadioButton;
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
	  WebElement  DepartureDate;
	  
	  @FindBy (xpath="//div[@data-testid='return-date-dropdown-label-test-id']")
	  WebElement ReturnDatecal;
	  
	  @FindBy (xpath="//div[@class='css-1dbjc4n r-1awozwy r-16ru68a r-1loqt21 r-eu3ka r-1otgn73 r-1aockid']//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'][normalize-space()='6']")
	  WebElement ReturningDate;
	 
	
	   @FindBy (xpath="//div[@data-testid='home-page-travellers']")
		  WebElement Travellers;
		  
		  @FindBy (xpath="//div[@data-testid='Adult-testID-plus-one-cta']")
		  WebElement Adultcount;
	 @FindBy (xpath="//div[5]/div[2]/div[1]/div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")
		  WebElement currency;
		  
		  @FindBy (xpath="//div[@class='css-1dbjc4n']//div//div[text()='INR']")
		  WebElement IndRupee;
		  @FindBy (xpath="//div[@data-testid='home-page-flight-cta']")
		  WebElement SearchFlights;
	   @FindBy (xpath=" //div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
		  WebElement continue;
	  

	      
	
	public RoundTrip(WebDriver driver) {
		this.driver=driver;
		  PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}
	
	public void roundTrip() {
		this.RoundTripRadioButton.click();
	}
	public void from() {
		 this.From.click();
		 Actions object = new Actions(driver);
		 object.moveToElement(Bhopal).build().perform();
		 this.Bhopal.click();
		// this.From.sendKeys("BHO");
		 
	  }
	public void to() {
		 this.To.click();
		 Actions object = new Actions(driver);
		 object.moveToElement(Chennai).build().perform();
		 this.Chennai.click();
	}
	public void dateOfDepart() {
		
		this.DepartDate.click();
			 String expectedDate = "26-April-2023";
			String emonth = expectedDate.split("-")[1];
			String eyear = expectedDate.split("-")[2];
			String edate = expectedDate.split("-")[0];
			System.out.println(emonth+"***"+eyear+"***"+edate);
		//	String DOD = edate+emonth+eyear;
			 WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
			  
			 //filling depart date
			  
			  WebElement dateBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='css-1dbjc4n r-18u37iz']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n']//*[name()='svg']")));
			  dateBtn.click();
			  String cmonthandyear=driver.findElement(By.xpath("//div[@data-testid='undefined-month-April-2023']")).getText().trim();
			 // String cyear=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'][normalize-space()='March 2023'][1]")).getText().trim();
			
			  WebElement next;
			  
			  System.out.println("passed");
			  while((!cmonthandyear.equals(emonth)) || (!cmonthandyear.equals(eyear))){
				  next=driver.findElement(By.xpath("//div[2]/div[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='circle'][1]"));
				  System.out.println("selected");
				  next.click();
				  System.out.println("clicked");
				  cmonthandyear=driver.findElement(By.xpath("//div[@data-testid='undefined-month-April-2023']")).getText().trim();
				 // cyear=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'][normalize-space()='March 2023'][1]")).getText().trim();
				  System.out.println(cmonthandyear);
				  
				  
				  		  
			  }
			  List<WebElement> dates = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz']"));
				
				for(WebElement e: dates) {
					if(e.getText().trim().equals(edate)){
						js.executeScript("arguments[0].click()",e)
						e.click();
						break;
			  
		}
		this.DepartureDate.click();
	}
	public void Returndate() throws Exception {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
		wait.until(ExpectedConditions.elementToBeClickable(ReturnDatecal));
		 String expectedDate = "28-May-2023";
			String emonth = expectedDate.split("-")[1];
			String eyear = expectedDate.split("-")[2];
			String edate = expectedDate.split("-")[0];
			System.out.println(emonth+"***"+eyear+"***"+edate);
		//	String DOD = edate+emonth+eyear;
			 WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
			  
			 //filling returndate
			  
			  WebElement dateBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='css-1dbjc4n r-18u37iz']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n']//*[name()='svg']")));
			  dateBtn.click();
			  String cmonthandyear=driver.findElement(By.xpath("//div[@data-testid='undefined-month-May-2023']")).getText().trim();
			
			
			  WebElement next;
			  
			  System.out.println("passed");
			  while((!cmonthandyear.equals(emonth)) || (!cmonthandyear.equals(eyear))){
				  next=driver.findElement(By.xpath("//div[2]/div[1]/*[name()='svg'][1]/*[name()='g'][1]/*[name()='circle'][1]"));
				  System.out.println("selected");
				  next.click();
				  System.out.println("clicked");
				  cmonthandyear=driver.findElement(By.xpath("//div[@data-testid='undefined-month-April-2023']")).getText().trim();
				 // cyear=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'][normalize-space()='March 2023'][1]")).getText().trim();
				  System.out.println(cmonthandyear);
				  
				  
				  		  
			  }
			  List<WebElement> dates = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz']"));
				
				for(WebElement e: dates) {
					if(e.getText().trim().equals(edate)){
						js.executeScript("arguments[0].click()",e)
						e.click();
						break;
			  
		}
		 this.Travellers.click();
			 Thread.sleep(3000);
			 this.Adultcount.click();
			 System.out.println("Adultcount");
			// object.scrollToElement(Done).build().perform();
			// wait.until(ExpectedConditions.visibilityOf(Done));
			 
			 this.Done.click();	
	
		Thread.sleep(3000);
		
				}
		public void search(){
			this.currency.click();
			this.IndRupee.click();
			//code for searching the flights for round trip 
			 SearchFlights.click();
			//clicks on continue to do final booking
			this.continue.click();
			//lands on booking form page
		}
		public void bookingForm(){
			System.out.println("booking page"+ driver.getTitle());
			//need to complete  this didnt get time to cover this 
                     
		
		
		
		
		
		
		
		
		}
	 
	  }
				 
}
