import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thirdpopup_of_Popupclass {

	public static void main(String[] args) 
		throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		//To maximize window`
	    driver.manage().window().maximize();
		//To get the URL
	    driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		//To click on click me button 3rd one
	    driver.findElement(By.id("promptBox")).click();
	    Thread.sleep(2000); 
	  //For time
	    //Thread.sleep(2000);
	  //To click on Ok button 
	    Alert okonalert = driver.switchTo().alert();
	    okonalert.sendKeys("asde");
	    Thread.sleep(2000);
	    okonalert.accept();
	    
	}

}
