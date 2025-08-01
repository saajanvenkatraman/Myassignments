package week4.marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {



	public static void main(String[] args) throws InterruptedException, IOException {
		
		// launch browser
		
		ChromeDriver driver = new ChromeDriver();
		
		// launch tata cliq
		
		driver.get("https://www.tatacliq.com");
		
		// max browser
		
		driver.manage().window().maximize();
		
		// imp wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Mouse over brands
		
		Actions act = new Actions (driver);
		
		 WebElement brandMouse = driver.findElement(By.xpath("//div[text()='Brands']"));
		 
		 act.moveToElement(brandMouse).perform();
		 
		 // mouse over to Watches & Accessories
		 
		 WebElement watchandAccess = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		
		 act.moveToElement(watchandAccess).perform();
		 
		 // select first option in featured brands
		 
		 driver.findElement(By.xpath("//div[text()='Casio']")).click();
		 
		 //sort by New arrivals
		 WebElement sortDropDown = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		 
		 Select options = new Select(sortDropDown);
		 
		 options.selectByValue("isProductNew");
		
		 //Choose men in filter
		 
		 driver.findElement(By.className("FilterDesktop__newFilCheckboxBlock")).click();
		 
		 // print all watch price
		 
		 Thread.sleep(5000);
		 
		 List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']//h3"));
		 String price1 = priceList.get(0).getText();
		 System.out.println("Price of The First Watch :" + price1);
		 
		 for (int i = 0; i < priceList.size(); i++) {
			 
			 String allPrice = priceList.get(i).getText();
			 
			 System.out.println("The Price of All Product is" + allPrice);
			
		}
		 // click on first watch
		 driver.findElement(By.className("ProductModule__dummyDiv")).click();
		 
		 Set<String> allAddress = driver.getWindowHandles();
		 
		 List<String> address = new ArrayList (allAddress);
		 
		 //switch to child window
		 
		 driver.switchTo().window(address.get(1));
		 
		 System.out.println(driver.getTitle());
		 
		 String text2 = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']")).getText();
		 
		 System.out.println(text2);
		 
		 // Compare Prices
		  if (text2.contains(price1)) {
			  
			  System.out.println("Product price same in child and parent window");
			
		} else {
			
			System.out.println("They are not the same");

		}
		  // add to bag and get count
		 driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		 
		 String count = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		 
		 System.out.println("Count of the items in Bag :"+ count);
		 
		 //Click on cart
		 
		 driver.findElement(By.className("DesktopHeader__myBagShow")).click();
		 Thread.sleep(5000);
		 //screenshot
		 File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		 
		 File desti = new File ("./ScreenShotData/cliq.png");
		 
		 FileUtils.copyFile(screenshotAs, desti);
		 
		 // close browser
		 
		 driver.close();
		 driver.switchTo().window(address.get(0));
		 driver.close();
		 
		 
		 
		 
	}
}
