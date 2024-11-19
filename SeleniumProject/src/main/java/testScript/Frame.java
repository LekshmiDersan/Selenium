package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Frame  {
	public WebDriver driver; 
	

	public void browser()
	{
		driver=new ChromeDriver();  
		driver.get("https://demo.guru99.com/test/guru99home"); 
		driver.manage().window().maximize();
		
		//Jmeter automation
		
		WebElement newframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(newframe);
		WebElement image=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		image.click();
	}
		
		//Youtube automation
		public void youtube()
		{
			driver=new ChromeDriver();  
			driver.get("https://demo.guru99.com/test/guru99home"); 
			driver.manage().window().maximize();
			WebElement youtube=driver.findElement(By.xpath("//iframe[@wmode='transparent']"));
			driver.switchTo().frame(youtube);
			WebElement icon =driver.findElement(By.xpath("//div[@class='ytp-cued-thumbnail-overlay']"));
			icon.click();
			
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Frame frame=new Frame();
			//frame.browser();
			frame.youtube();
	}

}
