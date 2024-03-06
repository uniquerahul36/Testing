package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import Keys.ScreenRecorderUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class nopcommerce {

	public static void main(String[] args) throws Exception {
		
		ScreenRecorderUtil.startRecord("main");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/h2/a")).click();
		
		List<WebElement> chk = driver.findElements(By.xpath("//input[@type= 'checkbox']"));
		
		for (WebElement vl : chk) {
			Thread.sleep(2000);
			vl.click();
		}
				
		driver.close();
		ScreenRecorderUtil.stopRecord();
	}
}
