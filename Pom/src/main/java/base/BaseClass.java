package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static ChromeDriver driver;
	@BeforeMethod
	public void preConditions() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		driver= new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		

	}
	@AfterMethod
	public void postConditon() {
		
		driver.close();
		

	}
		
	}

