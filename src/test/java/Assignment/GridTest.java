package Assignment;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridTest {
	@Test
	public void testOnChrome() throws MalformedURLException, InterruptedException {
		ChromeOptions option = new ChromeOptions();
		Reporter.log("Test executing on Chrome", true);

		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), option);
		Reporter.log("Driver session established with server", true);
		Thread.sleep(5000);
		driver.get("https://www.amazon.com");
		Thread.sleep(10000);
		Reporter.log("Test executing from amazon application", true);
		System.out.println("Title is =" + driver.getTitle());

		Reporter.log("Test execution on Chrome completed", true);

		driver.quit();

	}
}
