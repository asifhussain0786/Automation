import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
				//To maximize window`
			    driver.manage().window().maximize();
				//To get the URL
			    driver.get("https://the-internet.herokuapp.com/");
			    //For timing
			    Thread.sleep(2000);
			    //For link text i.e. A/B Testing written text 
			    driver.findElement(By.linkText("A/B Testing")).click();
			    //Now the same by Xpath 
			    //driver.findElement(By.xpath("//a[normalize-space()='A/B Testing']")).click();
			    driver.findElement(By.partialLinkText("A/B Testing")).click();
	}

}
