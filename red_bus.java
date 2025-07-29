import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class red_bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To invoke browser
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		//To maximize window
	    driver.manage().window().maximize();
		//To get the URL
	    driver.get("https://www.redbus.in/");
	  //for clicking on from 
	    driver.findElement(By.xpath("//input[@id='src']")).click();
	    driver.findElement(By.xpath("//input[@id='dest']")).click();
	    driver.findElement(By.xpath("//input[@id='src']")).click();
	}

}
