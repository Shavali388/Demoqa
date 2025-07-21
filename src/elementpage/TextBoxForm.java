package elementpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxForm {
	
	void formFill(WebDriver driver)
	{
		String fullname="userName";
		WebElement fname=driver.findElement(By.id(fullname));
		String name="Shaikshavali Dudekula";
		fname.sendKeys(name);
		
		String email="userEmail";
		WebElement emailform=driver.findElement(By.id(email));
		String useremail="shavali2009@gmail.com";
		emailform.sendKeys(useremail);
		
		String cadress="currentAddress";
		WebElement cuadress=driver.findElement(By.id(cadress));
		String useradress="8-17-127/52/4,NallaBandastreet,giddalur";
		cuadress.sendKeys(useradress);
		
		String padress="permanentAddress";
		WebElement paadress=driver.findElement(By.id(padress));
		String userpadress="8-17-127/52/4,NallaBandastreet,giddalur,prakasam";
		paadress.sendKeys(userpadress);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		driver.findElement(By.id("submit")).click();
		
		
		
	}

}
