package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import spiceJetproject.Baseclass;

public class signIn extends Baseclass {
	public  WebDriver driver;

	@FindBy (xpath="//div[text()='Login']")
	  WebElement signIn;
	
	@FindBy (xpath="//div[text()='Email']")
	  WebElement Email;
	
	@FindBy (xpath="//input[@type='email']")
	  WebElement Emailtext;
	
	@FindBy (xpath="//input[@type='password']")
	  WebElement Password;
	
	@FindBy (xpath="//div[@data-testid='login-cta']")
	  WebElement signInButton;
	
	
	
	public signIn(WebDriver driver) {
		this.driver=driver;
		  PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}
	

	
	public void signIn1()  {
		 this.signIn.click();
	  }
	
	public void email() {
		this.Email.click();
	}
	
	public void emailText(String Email) {
		this.Emailtext.click();
		this.Emailtext.sendKeys("niketa.khare@gmail.com");
		
	}
	public void password (String Password) {
		this.Password.click();
		this.Password.sendKeys("Niketa@90983");
		
	}
    
	public void signInbutton () {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
	    wait.until(ExpectedConditions.elementToBeClickable(signInButton));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", signInButton);
		this.signInButton.click();
		
		
	}
}
