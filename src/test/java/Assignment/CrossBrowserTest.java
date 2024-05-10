package Assignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class CrossBrowserTest {
	WebDriver driver;

	@Parameters({ "bname" })
	@Test
	public void browserTest(String bname) throws MalformedURLException, InterruptedException {
		if (bname.equalsIgnoreCase("Chrome")) {
			ChromeOptions option = new ChromeOptions();
			Reporter.log("Test executing on Chrome", true);

			driver = new RemoteWebDriver(new URL("http://localhost:4444"), option);
			Reporter.log("Driver session established with server", true);

		} else if (bname.equalsIgnoreCase("Edge")) {
			EdgeOptions option = new EdgeOptions();
			Reporter.log("Test executing on Edge", true);

			driver = new RemoteWebDriver(new URL("http://localhost:4444"), option);
			Reporter.log("Driver session established with server", true);

		} else if (bname.equalsIgnoreCase("Firefox")) {
			FirefoxOptions option = new FirefoxOptions();
			Reporter.log("Test executing on Firefox", true);

			driver = new RemoteWebDriver(new URL("http://localhost:4444"), option);
			Reporter.log("Driver session established with server", true);

		}
		Thread.sleep(5000);
		driver.get("https://www.amazon.com");
		Thread.sleep(10000);
		Reporter.log("Test executing from amazon application", true);
		System.out.println("Title is =" + driver.getTitle());

		Reporter.log("Test execution completed", true);

		driver.quit();
	}
}