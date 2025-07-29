import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class seleniumwebformsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");

		// To maximize window
		driver.manage().window().maximize();

		// To get the URL
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");

		/*// For text input
		driver.findElement(By.id("my-text-id")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("my-text-id")).sendKeys("Duke");
		

		// for password 
		driver.findElement(By.name("my-password")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("my-password")).sendKeys("Duke390");
		
		
		// for textarea
	    driver.findElement(By.name("my-textarea")).click();
	    Thread.sleep(1000);
		driver.findElement(By.name("my-textarea")).sendKeys("Duke390");

		
		// for readonly input ,to check whether is it clickable or not?
	    driver.findElement(By.name("my-readonly")).click();

				
		// for Dropdown(select)
		WebElement mrdropdown = driver.findElement(By.name("my-select"));
		Select dropdown = new Select(mrdropdown);
	    Thread.sleep(1000);
		// dropdown.selectByIndex(2);
		//dropdown.selectByVisibleText("Three");
		dropdown.selectByValue("2");

		
		// for Dropdown(datalist)
 		driver.findElement(By.name("my-datalist")).click();
 		Thread.sleep(1000);
 		driver.findElement(By.name("my-datalist")).sendKeys("Mithu ji");
		
		
		//For link text i.e. Return to index  written text 
		Thread.sleep(1000);
	    //driver.findElement(By.linkText("Return to index")).click();
	    driver.findElement(By.partialLinkText("Return to index")).click();
	    
	    //for move back to the original page from this page
	    Thread.sleep(3000);
	    driver.navigate().back();
	    
	    //for checked checkbox (as it is already checked so we unchecked it)
	    
	    Thread.sleep(1000);
	    //WebElement checkbox = driver.findElement(By.id("my-check-1"));
	    //if (checkbox.isSelected()) {
	        //checkbox.click(); // This will uncheck it
	    //}
	    
	    driver.findElement(By.id("my-check-1")).click();
	    
	    
	    //for default checkbox
	    Thread.sleep(1000);
	    driver.findElement(By.id("my-check-2")).click();
	    
	        
	    //for checked radio and default radio buttons
	    Thread.sleep(1000);
	    driver.findElement(By.id("my-radio-2")).click();
	    
	    //for submit button
	    driver.findElement(By.id("my-radio-2")).click();
	    
	    
	    ////////////////for navigate back to real page	   
	    driver.findElement(By.className("btn-outline-primary")).click();
	    
	  //for move back to the original page from this page
	    Thread.sleep(3000);
	    driver.navigate().back();
	    
	    
	// for file input    
	    driver.findElement(By.name("my-file")).sendKeys("C:\\Users\\hp\\Pictures\\2019-KTM-RC-390-and-RC-200.jpg");
	    
	   //for color picker
	    driver.findElement(By.name("my-colors")).sendKeys("#a9e24c");*/
	    
		//for date picker
		//to click on that textbox
		driver.findElement(By.name("my-date")).click();
		
		//to click on next arrow
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")).click();
		
		//to click on back arrow
		Thread.sleep(2000);
		//driver.findElement(By.xpath("")).click();
		driver.findElement(By.className("flex-shrink-2")).click();
		
		
		
		
		
		
	    //for example range
	    WebElement slider = driver.findElement(By.name("my-range"));
	    Actions action = new Actions(driver);
	    action.clickAndHold(slider).moveByOffset(200, 0).release().perform();
	}

}
