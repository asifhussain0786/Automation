import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RSacademy {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To invoke browser
				WebDriver driver = new ChromeDriver();
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
				//To maximize window
			    driver.manage().window().maximize();
				//To get the URL
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				//To click on the user name field and password of the Rohit Shetty Academy page by added 
				//extension in Chrome i.e. Selector hub
				driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("jugug");
				//To click on password 
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ihgj");
				//To click on Login page
				driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
				System.out.println(driver.findElement(By.cssSelector("p.error")).getText());	
				System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	}

}
