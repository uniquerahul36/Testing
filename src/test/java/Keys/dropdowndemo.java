package Keys;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowndemo {
	public static void main(String[] args) throws Exception {

		ScreenRecorderUtil.startRecord("main");

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.name("fromPort"));

		Select slt = new Select(ele);

		slt.selectByValue("Portland");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.name("toPort"));

		Select slt1 = new Select(ele1);

		slt1.selectByValue("New York");

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(2000);
		// start program
		
		WebElement e = driver.findElement(By.id("inputName"));
		e.sendKeys("Rahul Singh");
		
		WebElement e1 = driver.findElement(By.id("address"));
		e1.sendKeys("Avenue");
		
		WebElement e2 = driver.findElement(By.id("city"));
		e2.sendKeys("Ghaziabad");
		
		WebElement e3 = driver.findElement(By.id("state"));
		e3.sendKeys("Uttar Pradesh");
		
		WebElement e4 = driver.findElement(By.id("zipCode"));
		e4.sendKeys("201009");
		
		WebElement e5 = driver.findElement(By.name("cardType"));
		Select s = new Select(e5);
		s.selectByValue("amex");
		
		WebElement e6 = driver.findElement(By.id("creditCardNumber"));
		e6.sendKeys("222200001010");
		
		WebElement e7 = driver.findElement(By.id("creditCardMonth"));
		e7.sendKeys("9");
		
		WebElement e8 = driver.findElement(By.id("creditCardYear"));
		e8.sendKeys("2020");
		
		WebElement e9 = driver.findElement(By.id("nameOnCard"));
		e9.sendKeys("Rahul Singh");
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		
		TakesScreenshot sc = ((TakesScreenshot) driver);
		File src = sc.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\ScreenshotCodes\\flight.png");
		FileUtils.copyFile(src, f2);

		driver.close();

		ScreenRecorderUtil.stopRecord();

	}

}
