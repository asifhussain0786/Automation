import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix_CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		//To maximize window
	   //driver.manage().window().maximizes();
	  //To get the URL
		driver.get("https://www.netflix.com/in/login");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id=':r0:']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id=':r3:']")).sendKeys("12376");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		//System.out.println(driver.findElement(By.cssSelector("div.textWithTags")).getText());
		System.out.println(driver.findElement(By.cssSelector("div.e191g6e31")).getText());
		//"default-ltr-cache-1tn7jro-StyledContent e191g6e31"
		//System.out.println(driver.findElement(By.className("div.textWithTags")).getText());
	// default-ltr-cache-fumqm6-StyledContainer euy28770
	
	
	}

}
