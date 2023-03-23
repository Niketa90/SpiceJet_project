package pageObjects;

import spiceJetproject.Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	
	public class signUpPage extends Baseclass{
	


	

	public  WebDriver driver;

	
	@FindBy (xpath="//a[@to='https://spiceclub.spicejet.com/signup']//div[@class='css-76zvg2 r-jwli3a r-ubezar']")
	  WebElement signup;
	
	@FindBy (xpath="//select[@class='form-control form-select ']")
	WebElement Titlebox;
	  
	  @FindBy (xpath="//option[@value='MRS']")
	  WebElement title;
	  

	  @FindBy (xpath="//input[@id='first_name']")
	  WebElement firstname;
	  
	  @FindBy (xpath="//input[@id='last_name']")
	  WebElement lastname;

	  @FindBy (xpath="//select[@class='form-control form-select']")
	  WebElement country;

	  @FindBy (xpath="//input[@id='dobDate']")
	  WebElement dateofbirth;
	  
	  @FindBy (xpath="//input[@placeholder='+91 01234 56789']")
	  WebElement mobilenumber;
	  
	  @FindBy (xpath="//input[@id='email_id']")
	  WebElement email;
	  
	  @FindBy (xpath="//input[@id='new-password']")
	  WebElement password;
	  
	  @FindBy (xpath="//input[@id='c-password']")
	  WebElement confpassword;
	  
	  @FindBy (xpath="//input[@id='defaultCheck1']")
	  WebElement iAgree;
	  
	  @FindBy (xpath="//button[@type='button']")
	  WebElement submit;
	  
	 
		 
	  
	 

	public signUpPage(WebDriver driver) {
		this.driver=driver;
		  PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}



	public void SignUp() {
		
		 this.signup.click();
	  }
	
	public void Titlebox() {
		 this.Titlebox.click();
	  }
	
	  public void SelectTitle() {
		  this.title.click();
	  }
	  public void Firstname(String FirstName) {
		  this.firstname.sendKeys("Niketa");
	  }
	  public void Lastname(String Lastname) {
		  this.lastname.sendKeys("Khare");
	  }
	  public void EnterCountry(String Country) {
		  this.country.sendKeys("India");
	  }
	  public void DateOfBirth (String DOB){
		 this.dateofbirth.sendKeys("13/12/1990");
	  }
	  public void Mobilenumber(String MobileNumber) {
		  this.mobilenumber.sendKeys("9639822471");
	  }
	  public void Emailid(String Email) {
		  this.email.sendKeys("niketa.khare@gmail.com");
	  }
	  public void EnterPassword(String Password) {
		  this.password.sendKeys("Niketa@90983");
	  }
	  public void ConfirmPass(String Confirmpassword) {
		  this.confpassword.sendKeys("Niketa@90983");
	  }
	  public void iAgree() {
		  this.iAgree.click();
	  }
	  
	  public void submit() {
		  this.submit.click();
	  }
	  
	}


