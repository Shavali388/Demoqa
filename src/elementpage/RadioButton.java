package elementpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {

	public static void main(String[] args) {
		ElementPage rButton=new ElementPage();
		WebDriver driver=rButton.elementPage();
		String buttonPath="//span[text()='Radio Button']";
		By locator=By.xpath(buttonPath);
		WebElement bElement=driver.findElement(locator);
		bElement.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		RbuttonForm rForm=new RbuttonForm();
		rForm.yRadiobutton(driver);
		rForm.nRadiobutton(driver);
		rForm.iRadiobutton(driver);
		

	}

}
