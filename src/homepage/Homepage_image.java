package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage_image {

	public static void main(String[] args) {

		Homepage launch = new Homepage();
		WebDriver driver = launch.homepageLaunch();
		String imgPath = "//div[@id='app']/header/a/img";
		WebElement element = driver.findElement(By.xpath(imgPath));
		launch.highlightElement(driver, element);
		boolean imgDisplay = element.isDisplayed();
		System.out.println("Logo image is displayed: " + imgDisplay);
		// driver.close();
	}

	
}
