import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods {

	public static void main(String[] args) {
		//To invoke browser
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		//To get the URL
		driver.get("https://www.flipkart.com/");
		//To get the driver
		System.out.println(driver.getTitle());
		//To get currentURL
		System.out.println(driver.getCurrentUrl());
		//To close the current browser
		driver.close();
	
	}
}
