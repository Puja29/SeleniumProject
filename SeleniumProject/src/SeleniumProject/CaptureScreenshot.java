package SeleniumProject;

import java.io.File;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class CaptureScreenshot {
	
	@Test
	public static void captureScreenMethod() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Cucumber files\\Cucumber Jars\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
	
		//System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingmaterial.com/capture-screenshot-using-selenium-webdriver");
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotFile, new File("D:\\SoftwareTestingMaterial.png"));
		driver.close();
		driver.quit();		
	}
}