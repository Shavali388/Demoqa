package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeBanner {

	public static void main(String[] args) {
		Homepage launch = new Homepage();
		WebDriver driver = launch.homepageLaunch();
		String bannerPath="//img[@class='banner-image']";
		WebElement element=driver.findElement(By.xpath(bannerPath));
		launch.highlightElement(driver, element);
		boolean banner=element.isDisplayed();
		System.out.println("image banner is displayed: "+banner);
		//driver.close();
		
		

	}

}
