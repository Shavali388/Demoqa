package elementpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxFill  {

	public static void main(String[] args)throws InterruptedException {
		ElementPage formpage=new ElementPage();
		WebDriver driver=formpage.elementPage();
		String boxpath="//span[contains(text(),'Text')]";
		WebElement textBoxElement=driver.findElement(By.xpath(boxpath));
		textBoxElement.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		TextBoxForm tform=new TextBoxForm();
		tform.formFill(driver);
		//driver.close();

	}

}
