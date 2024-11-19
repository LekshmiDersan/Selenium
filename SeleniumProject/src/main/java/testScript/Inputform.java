package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Inputform extends Base{
	
	public void showmessage()
	{
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("hello");
		WebElement showmsg=driver.findElement(By.id("button-one"));
	    showmsg.click();
	    WebElement valuea=driver.findElement(By.id("value-a"));
	    valuea.sendKeys("20");
	    WebElement valueb=driver.findElement(By.id("value-b"));
	    valueb.sendKeys("30");
	    WebElement total=driver.findElement(By.id("button-two"));
	    total.click();
	}

	public static void main(String[] args) {
		Inputform input=new Inputform();
		input.initializationBrowser();
		input.showmessage();

	}

}
