import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Departure_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To invoke browser
				WebDriver driver = new ChromeDriver();
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
				//To maximize window
			    driver.manage().window().maximize();
				//To get the URL
			    driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
			    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();	    
			    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/a[1]")).click();
			    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
			    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/a[1]")).click();
	}

}
