package spiceJetproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsclass  {
	public static WebDriver driver;
	public void MouseHover() {
		
		 WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
		Actions object = new Actions(driver);
		
	}
}
