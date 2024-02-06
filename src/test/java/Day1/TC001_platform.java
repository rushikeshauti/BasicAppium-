package Day1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TC001_platform {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("appium:deviceName", "Medium Phone API 32");
	

URL url=new URL("http://127.0.0.1:4723/wd/hub");  // you have to go on appium server;
	AndroidDriver driver= new AndroidDriver(url, dc);
	
	}

}
