package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{

	public void idlocator()
	{
		//Syntax-->WebElement Elementname=driver.findElement(By.Locatorname("value"));
		WebElement message=driver.findElement(By.id("single-input-field"));
		WebElement bootstrapalerts=driver.findElement(By.id("autoclosable-btn-success"));
		WebElement jquerydatepicker=driver.findElement(By.id("from"));
		WebElement jqueryuiprogress=driver.findElement(By.id("downloadButton"));
		WebElement dynamicdataloading=driver.findElement(By.id("save"));
		
	}
	public void classlocator()
	{
		WebElement section=driver.findElement(By.className("clearfix"));
	}
	
	public void namelocator()
	{
		WebElement name=driver.findElement(By.name("viewport"));
	}
	
	public void linktextlocator()
	{
		WebElement linkinputform=driver.findElement(By.linkText("simple-form-demo.php"));
	}
	
	public void partiallinktext()
	{
		WebElement partial=driver.findElement(By.partialLinkText("simple-form"));

	}
	
	public void csstagandid()
	{
		//tag#id
			WebElement inputid=driver.findElement(By.cssSelector("input#single-input-field"));
	}
	public void csstagattribute()
	{
		//tag[attributetype=value]
		WebElement tagattribute=driver.findElement(By.cssSelector("input[id=single-input-field]"));
	}
	
	public void csstagclass()
	{
		//tag.class
		WebElement tagclass=driver.findElement(By.cssSelector("ul.navbar-nav"));
	}
	public void csstagclassattribute()
	{
		//tag.classname[attribute=value]
		WebElement tagclassattribute=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
	}
	  public void xpath()
      {
    	  //absolute xpath
    	  WebElement xpath=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
    	 
    	  //relative xpath syntax://tagname[@attributetype='attributevalue']
    	  
    	  WebElement relativexpath=driver.findElement(By.xpath("//input[@id='single-input-field']"));
    	  WebElement relativexpathsampleone=driver.findElement(By.xpath("//input[@id='value-a']"));
    	  WebElement relativexpathsampletwo=driver.findElement(By.xpath("//input[@id='value-b']"));
    	  
    	  //dynamic xpath contains method syntax://tagname[contains(@attributetype,'value')]
    	  WebElement dynamicxpath=driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
    	  
    	  //dynamic xpath text method syntax://tagname[text()='value']
    	  WebElement textxpath=driver.findElement(By.xpath("//button[text()='Show Message']"));
    	  
    	//axes method xpath parent  syntax://tagname[@attributetype='attributevalue']:://parent.div
    	    	  
    	
    	  WebElement FormGroup=driver.findElement(By.xpath("//input[@class='form-control']//parent::div"));
    	
    	  //axes method xpath child syntax://tagname[@attributetype='attributevalue']://child.div
    	  
    	  WebElement Formchild=driver.findElement(By.xpath("a[@href='index.php']//child::img[@alt='logo'"));
    	  
    	
      }
	public static void main(String[] args) {
		

	}

}
