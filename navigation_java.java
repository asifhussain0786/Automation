import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_java {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		//To get the URL
		driver.get("https://chatgpt.com/");
		//To give time allocation
		Thread.sleep(2000);
		//To navigate the URL
		driver.navigate().to("https://www.flipkart.com/");
		//To give time allocation
		Thread.sleep(2000);
		//To navigate back to the first URL
		driver.navigate().back();
		//To give time allocation
		Thread.sleep(2000);
		//To navigate to second URL, we use the method i.e. forward()
		driver.navigate().forward();
		driver.close();
	}
}
