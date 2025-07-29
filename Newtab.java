import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Newtab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		System.setProperty("webdriver.edge.driver","C:\\Users\\hp\\Downloads\\edgedriver_win64");
		//To maximize window
		driver.manage().window().maximize();
		//To get the URL
		driver.get("https://chatgpt.com/");
		//To give time allocation
	    Thread.sleep(2000);
		//To switch to new Tab 
	    driver.switchTo().newWindow(WindowType.TAB);
	    //driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		// And to navigate the URL
	    //driver.navigate().to("https://www.flipkart.com/");

	}

}
