package Keys;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Keys {


	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Cetpa");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(org.openqa.selenium.Keys.ENTER).perform();

		Thread.sleep(2000);
		driver.close();

	}

}
