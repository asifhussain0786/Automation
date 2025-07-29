import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassengersDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To invoke browser
				WebDriver driver = new ChromeDriver();
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
				//To maximize window
			    driver.manage().window().maximize();
				//To get the URL
			    driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
			    //for clicking on Passengers dropdown
			    driver.findElement(By.id("divpaxinfo")).click();
			    //for adult addition
			    //driver.findElement(By.id("hrefIncAdt")).click();
			    //for child addition
			    driver.findElement(By.id("hrefIncChd")).click();
			    /*//for infant addition
			    driver.findElement(By.id("")).click(); */
			    //for clicking on Done option in Passengers dropdown
			    //driver.findElement(By.id("btnclosepaxoption")).click();
	}

}
