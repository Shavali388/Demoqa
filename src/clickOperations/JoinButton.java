package clickOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import homepage.Homepage;

public class JoinButton {

	public static void main(String[] args) {
		Homepage launch=new Homepage();
		WebDriver driver=launch.homepageLaunch();
		String joinButton="img.banner-image";
		WebElement element=driver.findElement(By.cssSelector(joinButton));
		element.click();
		driver.close();
	}

}
