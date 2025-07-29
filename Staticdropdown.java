import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.org.apache.bcel.internal.generic.Select;

public class Staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//To invoke browser
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		//To maximize window
	    driver.manage().window().maximize();
		//To get the URL
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
	    Thread.sleep(3000);
	    WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	    //whose tag_name is select
	    Select dropdown = new Select(staticdropdown);
	    //1st method
	    //dropdown.selectByIndex(3);
	    //2nd method
	    //dropdown.selectByVisibleText("AED");
	    //3rd method
	    dropdown.selectByValue("AED");  
	}

}
