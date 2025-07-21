package homepage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homepage {
	WebDriver driver;

	public WebDriver homepageLaunch() {
		driver = new FirefoxDriver();
		String url = "https://demoqa.com/";
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	public  void highlightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
	}
	 public  void removeHighlight(WebDriver driver, WebElement element) {
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("arguments[0].setAttribute('style', '');", element);
	    }
}
