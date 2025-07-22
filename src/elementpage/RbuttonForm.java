package elementpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RbuttonForm {
void yRadiobutton(WebDriver driver)
{
	String ybuttonPath="(//label[@class='custom-control-label'])[1]";
	By locator=By.xpath(ybuttonPath);
	WebElement yElement=driver.findElement(locator);
	boolean ybEnable=yElement.isEnabled();
	if(ybEnable==true)
	{
		System.out.println("Yes radio button is enabled");
		yElement.click();
	}
	else
	{
		System.out.println("Yes radio button is not enabled");	
	}
	
}
void nRadiobutton(WebDriver driver)
{
	String nbuttonPath="//input[@name='like' and @class='custom-control-input disabled']";
	By locator=By.xpath(nbuttonPath);
	WebElement nElement=driver.findElement(locator);
	boolean nbEnable=nElement.isEnabled();
	if(nbEnable==true)
	{
		System.out.println("No radio button is enabled");
		nElement.click();
	}
	else
	{
		System.out.println("No radio button is not enabled");	
	}
}
void iRadiobutton(WebDriver driver)
{
	String ibuttonPath="(//label[@class='custom-control-label'])[2]";
	By locator=By.xpath(ibuttonPath);
	WebElement iElement=driver.findElement(locator);
	boolean ibEnable=iElement.isEnabled();
	if(ibEnable==true)
	{
		System.out.println("Impresive radio button is enabled");
		iElement.click();
	}
	else
	{
		System.out.println("Impresive radio button is not enabled");	
	}
	
}
}
