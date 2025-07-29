import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		//TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
		//To get the URL
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwj7rYix6cyMAxUVpGYCHQ1YMdIYABAAGgJzbQ&co=1&gclid=CjwKCAjwtdi_BhACEiwA97y8BMPMF2M9lUGvDW8KWoAu0_VannBV42XmEDxLcaZUQsyGQuh3iwMLaRoCRbwQAvD_BwE&ohost=www.google.com&cid=CAESVuD2AHvAHBE3vjo0Q6Z5BpdjnhMODRioQGUh-4-TOoOa2X4A0Ut6iuwt0rpbfsrgymMbVcG2BgngRYOp8oWJbyUwOsuUsER9p3widP257EkeryoihBAc&sig=AOD64_2Nusk2J7HNQVzEFD70w5YpvT1vUQ&q&adurl&ved=2ahUKEwjf34Ox6cyMAxXQzDgGHQFZPBMQ0Qx6BAgJEAE");
		//For scrolling the page
		Actions action = new Actions(driver);
		//Scroll from up to down
		action.scrollByAmount(0, 3000).perform();
		//To give time allocation
        Thread.sleep(2000);
		//Scroll from down to up
		action.scrollByAmount(0,-2000).perform();
		//Scroll from left to right
		action.scrollByAmount(3000,0).perform();
		//Scroll from right to left(back)
		action.scrollByAmount(-1000,0).perform();
	}

}
