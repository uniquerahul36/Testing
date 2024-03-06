package windowhandledemo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();

//		String windowid = driver.getWindowHandle();
//
//		System.out.println("WindowID=:" + windowid);

		Set<String> windowid = driver.getWindowHandles();

		List<String> windowlist = new ArrayList<String>(windowid);

		String pwindow = windowlist.get(0);
		System.out.println("The Pwindowid=:" + pwindow);

		String cwindow = windowlist.get(1);
		System.out.println("The cwindow=:" + cwindow);
		Thread.sleep(4000);

		driver.switchTo().window(pwindow);
		Thread.sleep(2000);
		driver.switchTo().window(cwindow);

		Thread.sleep(2000);
		driver.quit();

	}
}
