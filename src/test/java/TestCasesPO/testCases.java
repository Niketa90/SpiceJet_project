package TestCasesPO;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.DatePickerAutomation;
import pageObjects.OneWaytrip;
import pageObjects.RoundTrip;
import pageObjects.signIn;
import pageObjects.signUpPage;
import spiceJetproject.Baseclass;
import utils.seleniumspicejet.Utils;

public class testCases extends Baseclass {
	@Test
	public void signUpTC_001() throws Exception  {
	
		signUpPage obj = new signUpPage(driver);
		
		obj.SignUp();
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();
		while(I1.hasNext())
		{

		String child_window=I1.next();
		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());
		System.out.println("It s a child window");
		}
		}
		}
		
		
	
	
	@Test
	public void signUpTC_002() throws Exception {
		
		signUpPage obj = new signUpPage(driver);
		obj.SignUp();
		driver.switchTo().frame(0);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='form-control form-select ']")));
	   // Select drpdown = new Select(driver.findElement(By.xpath("[@class='form-control form-select ']")));
		obj.Titlebox();
		Select drpvalue = new Select(driver.findElement(By.xpath("//option[@value='MRS']")));
		obj.SelectTitle();
		obj.Firstname("Niketa");
		obj.Lastname("Khare");
		obj.EnterCountry("India");
		obj.DateOfBirth("13/12/1990");
		obj.Mobilenumber("9639822471");
		obj.Emailid("niketa.khare@gmail.com");
		obj.EnterPassword("Niketa@90983");
		obj.ConfirmPass("Niketa@90983");
		obj.iAgree();
		obj.submit();
		
		}
	@Test
	public void signInTC_003() throws Exception{
		signIn obj = new signIn(driver);
		obj.signIn1();
		obj.email();
		obj.emailText("niketa.khare@gmail.com");
		obj.password("Niketa@90983");
		Thread.sleep(3000);
		
		obj.signInbutton();
		
		
	}
	@Test
	public void oneWaytrip() throws Exception {
		OneWaytrip obj = new OneWaytrip(driver);
		obj.onewayRadio();
		obj.from();
		obj.To();
		Thread.sleep(5000);
		obj.Departuredate();
		obj.search();
		
		
		
	}   
	
	    @Test
		public void roundTrip() throws Exception {
			RoundTrip obj = new RoundTrip(driver);	
			obj.roundTrip();
			obj.from();
			obj.to();
			Thread.sleep(3000);
			obj.dateOfDepart();
			Thread.sleep(4000);
			obj.Returndate();
			
			
		}
	    @Test
		public void testingdatepicker() {
			DatePickerAutomation obj = new DatePickerAutomation(driver);
			obj.testing();
			
		}

		
}

