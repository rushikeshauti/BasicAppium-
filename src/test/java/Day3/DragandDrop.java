package Day3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DragandDrop {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("appium:deviceName", "Medium Phone API 32");
		dc.setCapability("appium:skipServerInstallation","true");
		dc.setCapability("appium:noReset", "true");
		dc.setCapability("appium:platformVersion","12.0");
		dc.setCapability("appium:app","D:\\appium\\com.mobeta.android.demodslv-0.5.0-3_APKdot.com.apk");



		URL url=new URL("http://127.0.0.1:4723/wd/hub");  // you have to go on appium server;
			AndroidDriver driver= new AndroidDriver(url, dc);
			
		Thread.sleep(1000);
			driver.findElement(By.xpath("  //android.widget.TextView[@resource-id=\"com.mobeta.android.demodslv:id/activity_title\" and @text=\"CursorAdapter\"] ")).click();
			
		WebElement Drag=driver.findElement(By.xpath(" (//android.widget.ImageView[@resource-id=\"com.mobeta.android.demodslv:id/drag_handle\"])[1] "));
		
			WebElement Drop=driver.findElement(By.xpath(" (//android.widget.ImageView[@resource-id=\"com.mobeta.android.demodslv:id/drag_handle\"])[10] "));
	
	
	Actions Ac=new Actions(driver);
	
	Ac.dragAndDrop(Drag, Drop).build().perform();
	//Ac.moveByOffset(1, 10);
	Ac.moveToElement(Drag, 1, 10);
	//Ac.moveToElement(Drop, 10, 1);
	
	driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.mobeta.android.demodslv:id/click_remove\"])[1]")).click();
	}

}
