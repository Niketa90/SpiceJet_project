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
		this.DepartureDate.click();
	}
	public void Returndate() throws Exception {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
		wait.until(ExpectedConditions.elementToBeClickable(ReturnDatecal));
		this.ReturnDatecal.click();
		Thread.sleep(3000);
		this.ReturningDate.click();
		
		
		 
	  }
}
