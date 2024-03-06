package InstagramLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new 	EdgeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement e = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
		e.sendKeys("rahul");
		Thread.sleep(2000);
		
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
		e1.sendKeys("data");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
		Thread.sleep(2000);
	   driver.close();

	}
}
