package utils.seleniumspicejet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import spiceJetproject.Actionsclass;

public class Utils extends Actionsclass {
public static WebDriver driver;
	
	public void browserlaunch(String browser) {
		 WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
            driver.get("https://www.spicejet.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            
            
		
	}


}
