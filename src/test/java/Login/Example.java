package Login;

import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	public static void main(String[] args) throws Exception {
		
		ScreenRecorderUtil.startRecord("main");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.id("cartur")).click();

		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();

		Thread.sleep(2000);
		// Start coding...
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        ele.sendKeys("Rahul Singh");
Thread.sleep(2000);

WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"country\"]"));
        ele1.sendKeys("India");
        Thread.sleep(2000);
        
        WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"city\"]"));
        ele2.sendKeys("Ghaziabad");
        Thread.sleep(2000);

        WebElement ele3 = driver.findElement(By.xpath("//*[@id=\"card\"]"));
        ele3.sendKeys("777700009999");
        Thread.sleep(2000);

        WebElement ele4 = driver.findElement(By.xpath("//*[@id=\"month\"]"));
        ele4.sendKeys("2");
        Thread.sleep(2000);

        WebElement ele5 = driver.findElement(By.xpath("//*[@id=\"year\"]"));
        ele5.sendKeys("2024");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
 
		Thread.sleep(2000);
		driver.close();
		
		ScreenRecorderUtil.stopRecord();
		
		

	}
}
