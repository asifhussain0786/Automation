import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		//To maximize window
	    driver.manage().window().maximize();
		//To get the URL
		driver.get("https://login.siteground.com/");
		//To click on the user name field and password of the Site Ground page 
		driver.findElement(By.name("username")).sendKeys("Duke");
		driver.findElement(By.name("fields.password.name")).sendKeys("Duke390");
		driver.findElement(By.className("sg-button")).click();
		
	}
	//sg-ripple-container
}
//class="sg-button-base sg-button-base--color-primary sg-button-base--type-contained sg-button sg-button--x-large"