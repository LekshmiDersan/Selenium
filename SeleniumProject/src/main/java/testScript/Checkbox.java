package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends Base{
	
	public void box()
	{
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		WebElement checkboxdemo=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		checkboxdemo.click();
		WebElement tick=driver.findElement(By.id("gridCheck"));
		tick.click();
	}

	public static void main(String[] args) {
		Checkbox check=new Checkbox();
		check.initializationBrowser();
		check.box();

	}

}
