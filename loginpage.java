import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		//To get the URL
		driver.get("https://chatgpt.com/");
		//To give time allocation
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/v1/");
		//To click on the user name field and password of the swag labs page 
		driver.findElement(By.id("user-name")).sendKeys("Duke");
		driver.findElement(By.id("password")).sendKeys("Duke390");
		driver.findElement(By.id("login-button")).click();
	}
	}

