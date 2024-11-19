package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base{
	public void drag()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement dragvalue1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dragvalue2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		WebElement dragvalue3=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		WebElement dragvalue4=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		
		WebElement dropvalue=driver.findElement(By.id("mydropzone"));
		
		Actions actions=new Actions(driver);    //Actions is inbuilt class 
		actions.moveToElement(dragvalue1).click();
		actions.doubleClick(dragvalue1).perform();
		actions.dragAndDrop(dragvalue1, dropvalue).build().perform();
		
		actions.moveToElement(dragvalue2).click();
		actions.doubleClick(dragvalue2).perform();
		actions.dragAndDrop(dragvalue2, dropvalue).build().perform();
		
		actions.moveToElement(dragvalue3).click();
		actions.doubleClick(dragvalue3).perform();
		actions.dragAndDrop(dragvalue3, dropvalue).build().perform();
				
		actions.moveToElement(dragvalue4).click();
		actions.doubleClick(dragvalue4).perform();
		actions.dragAndDrop(dragvalue4, dropvalue).build().perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragAndDrop drop=new DragAndDrop();
		drop.initializationBrowser();
		drop.drag();
		
	}

}
