package Demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear_disabled {
	public static void main(String[] args) throws InterruptedException{
	    System.setProperty("webdriver.chrome.driver","./SELENIUM/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ACER/Desktop/SELENIUM/disabled.html");
		Thread.sleep(2000);
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("document.getElementById('t1').value='xyz'");

}
}