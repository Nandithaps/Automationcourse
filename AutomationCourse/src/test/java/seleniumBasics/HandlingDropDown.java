package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base
{
	public void verifyDropDown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement drop = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(drop);
		//select.selectByIndex(2);     //python will select based on index value 2
		//select.selectByValue("sql"); 
		//select.selectByVisibleText("C#"); // capital text from dom
	}

	public void verifyCheckBox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement check = driver.findElement(By.xpath("//input[@value='option-1']"));
		check.click();
		System.out.println(check.isSelected());
	}
	
	public void verifyRadioButton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio = driver.findElement(By.xpath("//input[@value='orange']"));
		radio.click();
	}
	
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HandlingDropDown drop = new HandlingDropDown();
		drop.initialiseBrowser();
		//drop.verifyDropDown();
		drop.verifyCheckBox();
		//drop.verifyRadioButton();
		

	}

}
