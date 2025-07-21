package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeCard {

	public static void main(String[] args)  {
		Homepage launch=new Homepage();
		WebDriver driver=launch.homepageLaunch();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		
		
		String cardElements="//h5[text()='Elements']";
		WebElement element=driver.findElement(By.xpath(cardElements));
		launch.highlightElement(driver, element);
		boolean card1=element.isDisplayed();
		System.out.println("Card Element is displayed: "+card1);
		launch.removeHighlight(driver, element);
		
		
		String cardForms="//h5[text()='Forms']";
		WebElement formelement=driver.findElement(By.xpath(cardForms));
		launch.highlightElement(driver, formelement);
		boolean card2=formelement.isDisplayed();
		System.out.println("Card Form is displayed: "+card2);
		launch.removeHighlight(driver, formelement);
		
		
		String cardAlerts="//h5[contains(text(),'Alerts')]";
		WebElement alertelement=driver.findElement(By.xpath(cardAlerts));
		launch.highlightElement(driver, alertelement);
		boolean card3=alertelement.isDisplayed();
		System.out.println("Card Alerts is displayed: "+card3);
		launch.removeHighlight(driver, alertelement);
		
		String cardWidgets="//h5[text()='Widgets']";
		WebElement widgetselement=driver.findElement(By.xpath(cardWidgets));
		launch.highlightElement(driver, widgetselement);
		boolean card4=widgetselement.isDisplayed();
		System.out.println("Card Widgets is displayed: "+card4);
		launch.removeHighlight(driver, widgetselement);
		
		String cardInteractions="//h5[text()='Interactions']";
		WebElement interactionselement=driver.findElement(By.xpath(cardInteractions));
		launch.highlightElement(driver, interactionselement);
		boolean card5=interactionselement.isDisplayed();
		System.out.println("Card Interactions is displayed: "+card5);
		launch.removeHighlight(driver, interactionselement);
		
		String cardStore="//h5[contains(text(),'Book')]";
		WebElement storeelement=driver.findElement(By.xpath(cardStore));
		launch.highlightElement(driver, storeelement);
		boolean card6=alertelement.isDisplayed();
		System.out.println("Card Store is displayed: "+card6);
		launch.removeHighlight(driver, storeelement);
	}

}
