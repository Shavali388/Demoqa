package elementpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CheckBoxForm {
	
void checkbox(WebDriver driver)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,400)", "");
	driver.findElement(By.xpath("(//span[@class='rct-text']/button)[1]")).click();
	driver.findElement(By.xpath("(//span[@class='rct-text']/button)[2]")).click();

	js.executeScript("window.scrollBy(0,300)", "");
	driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[3]")).click();
	driver.findElement(By.xpath("(//span[@class='rct-text']/button)[3]")).click();
	js.executeScript("window.scrollBy(0,200)", "");
	driver.findElement(By.xpath("(//span[@class='rct-text']/button)[4]")).click();
	js.executeScript("window.scrollBy(0,200)", "");
	driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[8]")).click();
	
	driver.findElement(By.xpath("(//span[@class='rct-text']/button)[5]")).click();
	js.executeScript("window.scrollBy(0,200)", "");
	driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[14]")).click();
	js.executeScript("window.scrollBy(0,200)", "");
	driver.findElement(By.xpath("(//span[@class='rct-text']/button)[6]")).click();
	js.executeScript("window.scrollBy(0,200)", "");
	driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[17]")).click();
	
	
}
}
