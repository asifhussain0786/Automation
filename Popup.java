import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//To invoke browser
				WebDriver driver = new ChromeDriver();
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrlauncher-win64-stable-codecs-sync");
				//To maximize window`
			    driver.manage().window().maximize();
				//To get the URL
			    driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
			    //See an example alert
			    
			    
			    
			    //To click on click me button
			    driver.findElement(By.xpath("//button[@id='alertBox']")).click();
			    
			    //For time
			    Thread.sleep(2000);
			    
			    //Script to give when it is a alert
			    Alert simplealert = driver.switchTo().alert();
			    simplealert.accept();
			    
			    
			    //To click on click me button 2nd one
			    driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
			    //For time
			    Thread.sleep(2000);
			    //To click on Ok button 
			    Alert alertok = driver.switchTo().alert();
			    alertok.accept();
			  //For time
			    //Thread.sleep(2000);
			  //To click on Cancel button 
			    //Alert alertdismiss = driver.switchTo().alert();
			    //alertdismiss.dismiss();
			  
			   
			  //To click on click me button 3rd one
			    driver.findElement(By.id("promptBox")).click();
			  //For time
			    Thread.sleep(2000);
			  //To click on Ok button 
			    Alert okonalert = driver.switchTo().alert();
			    okonalert.sendKeys("asde");
			    Thread.sleep(2000);
			    okonalert.accept();
			    
			  
	}

}
