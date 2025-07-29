import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabs_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
				//To maximize window
			    driver.manage().window().maximize();
			  //To get the URL
				driver.get("https://www.saucedemo.com/v1/");
				//To click on the user name field and password of the Site Ground page
				//driver.findElement(By.name("username")).sendKeys("Duke");
				
				//To click on the user name field and password of the SwagLabs page by added 
				//extension in Chrome i.e. Selector hub
				driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
				//To click on password 
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
				//To click on Login page
				driver.findElement(By.xpath("//input[@id='login-button']")).click();
				
				
				
	}

}
