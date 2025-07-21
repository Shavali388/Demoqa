package clickOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import homepage.Homepage;

public class ElementsLink {

	public static void main(String[] args) {
		Homepage launch =new Homepage();
		WebDriver driver=launch.homepageLaunch();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		String elementBut="//h5[text()='Elements']";
		WebElement element=driver.findElement(By.xpath(elementBut));
		element.click();
	}

}
