package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.id("file-upload")).sendKeys("Documents\\sample.txt");
		
		driver.findElement(By.id("file-submit")).click();

		Thread.sleep(2000);
		driver.close();

	}
}
