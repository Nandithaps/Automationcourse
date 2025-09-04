package seleniumBasics;

import org.openqa.selenium.By;

public class Locators extends Base
{
	public void verifyLocators()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("input"));
		driver.findElement(By.name("description"));
		driver.findElement(By.linkText("Radio Buttons Demo"));
		driver.findElement(By.partialLinkText("Radio"));
		driver.findElement(By.cssSelector("button[id='button-one']"));
		// right click copy- copy xpath paste will show the html below one
		// /html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div[1]/input
		//xpath syntax-> //tagname[@attribute='attribute value']
		driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));  // text
		driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]"));   // start text
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));    //AND
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']")); //OR
		
		//xpath access methods
		driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']")); // parent
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']")); // child
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']")); // following
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']")); // preceding
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div")); //ancestor
		driver.findElement(By.xpath("//div[@class='card']//descendant::div")); //descendant
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Locators locators = new Locators();
		locators.initialiseBrowser();
		locators.verifyLocators();
		
		

	}

}
