package spiceJetproject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.seleniumspicejet.Utils;

public class Baseclass extends Utils {
	public static WebDriver driver;
	 
	
		  @BeforeMethod
	       public void startup() {
			  WebDriverManager.chromedriver().setup();
			  ChromeOptions options = new ChromeOptions();
			  options.addArguments("--remote-allow-origins=*");
			  driver = new ChromeDriver(options);
		        // driver = new ChromeDriver();
		            driver.get("https://www.spicejet.com/");
		            driver.manage().window().maximize();
		           driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		          //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			         
	     

	}
	             @AfterMethod
	                public void closeup() {
	            	
	                 }
	      
		
		
	}


