import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99site {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// To invoke browser
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		// To maximize window
		driver.manage().window().maximize();
		// To get the URL
		driver.get("https://demo.guru99.com/Agile_Project/Agi_V1/");

		// to click on Selenium module
		driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
		// timing
		Thread.sleep(2000);

		// implicit wait
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// to click on Ajax demo drop_down of Selenium module
		driver.findElement(By.xpath("//a[normalize-space()='Ajax Demo']")).click();
		// FOR RADIO BUTTON SELECTING YES
		driver.findElement(By.id("yes")).click();

		// now for reseting the selected radio button by clicking on reset button by
		// xpath
		driver.findElement(By.xpath("//input[@value='Reset']")).click();
		// timing
		Thread.sleep(1000);

		
		  //to click on Insurance Project module
		  driver.findElement(By.xpath("//a[normalize-space()='Insurance Project']")).
		  click(); 
		  //for filling in user_id Automation
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Asif"); 
		  //for
		  //filling in password Automation
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("A213");
		  
		  
		  //to click on Tele_com Project module which consists of partial link
		  driver.findElement(By.xpath("//a[normalize-space()='Telecom Project']")).
		  click(); 
		  //to click on Add customer partial link
		  
		  //driver.findElement(By.partialLinkText("Add Customer")).click();
		  
		  //same thing by xpath 
		  driver.findElement(By.xpath("//div[@class='flex-item left']//div//h3//a[@href='addcustomer.php'][normalize-space()='Add Customer']"
		  )).click();
		 
	}

}
