import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jqueryuisite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				  
		        WebDriver driver = new ChromeDriver();
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
				
				//To maximize window
			    driver.manage().window().maximize();
			    
			    //To get the URL
				driver.get("https://jqueryui.com/droppable/");				
				
				//To give time allocation
				Thread.sleep(2000);
				
				//web_element
				
				WebElement iframe =  driver.findElement(By.className("demo-frame"));
				driver.switchTo().frame(iframe); 
				
				//
				
				WebElement drag =  driver.findElement(By.id("draggable"));			
				WebElement drop = driver.findElement(By.id("droppable"));
				Actions action = new Actions(driver);
				action.dragAndDrop(drag, drop).perform();
				
	}
}
