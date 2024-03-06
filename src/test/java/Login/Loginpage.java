package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.name("user-name"));

		ele.sendKeys("standard_user");
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.name("password"));

		ele1.sendKeys("secret_sauce");

		Thread.sleep(2000);

		driver.findElement(By.name("login-button")).click();

		Thread.sleep(2000);

		String ExpectedUrl = "https://www.saucedemo.com/inventory.html";

		String ActualUrl = driver.getCurrentUrl();

		if (ExpectedUrl.equals(ActualUrl)) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Invalid Credentials");
		}
		Thread.sleep(2000);
		driver.close();

	}

}
