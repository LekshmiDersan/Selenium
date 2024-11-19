package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {

	public void table()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	
		WebElement tablefields=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		
		System.out.println(tablefields.getText());       //to get complete table text(1st page)
	}
	
	public void tablerow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		WebElement tablerowfields=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]"));
		System.out.println(tablerowfields.getText());
	}
	public void tableselectdata()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		WebElement tablerowselect=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[1]"));
		System.out.println(tablerowselect.getText());
	}
	public void elementsearch()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input="System Architect";
		List<WebElement> data=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
 	for(WebElement tabledata:data)
 	{
 		if(tabledata.getText().equals(input))
 		{
 			System.out.println((tabledata.getText()));
 		}
 	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TableHandling handle=new TableHandling();
		handle.initializationBrowser();
		handle.table();
		System.out.println("***************");
		handle.tablerow();
		System.out.println("***************");
		handle.tableselectdata();
		System.out.println("***************");
		handle.elementsearch();
	}

}
