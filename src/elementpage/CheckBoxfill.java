package elementpage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxfill {
	public static void main(String[] args)throws InterruptedException {
		ElementPage formpage=new ElementPage();
		WebDriver driver=formpage.elementPage();
		String checkBoxPath="//span[contains(text(),'Check')]";
		WebElement checkBoxElement=driver.findElement(By.xpath(checkBoxPath));
		checkBoxElement.click();
		
		CheckBoxForm check=new CheckBoxForm();
		check.checkbox(driver);
		
		
		//driver.close();
	}
}
