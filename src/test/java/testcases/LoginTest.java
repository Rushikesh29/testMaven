package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver = null;

	@Test
	public void login() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("login is executed");
	}
}
