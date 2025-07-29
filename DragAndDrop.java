import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		//To maximize window`
	    driver.manage().window().maximize();
		//To get the URL
	    driver.get("https://the-internet.herokuapp.com/drag_and_drop");
	    //For timing
	    //Thread.sleep(2000);
	   WebElement drag =  driver.findElement(By.id("column-a"));
	   WebElement drop = driver.findElement(By.id("column-b"));
	   Actions action = new Actions(driver);
	   action.dragAndDrop(drag, drop).perform();
	   
	}

}
