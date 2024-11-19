package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleCheckbox extends Base {
	
	public void multipleCheckbox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> multi=driver.findElements(By.xpath("///input[@class='check-box-list']"));
		for(WebElement listvalue:multi)
		{
			listvalue.click();
		}
	}
	

	public static void main(String[] args) {
		MultipleCheckbox multi=  new MultipleCheckbox();
		multi.initializationBrowser();
		multi.multipleCheckbox();
	}

}
