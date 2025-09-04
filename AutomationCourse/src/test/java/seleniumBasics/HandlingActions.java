package seleniumBasics;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base
{
	public void verifyRightClick()
	{
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		Actions action = new Actions(driver);
		action.contextClick(home).build().perform();  //for right click
		
	}
	
	public void verifyMouseOver()
	{
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		Actions action = new Actions(driver);
		action.moveToElement(home).build().perform(); //turns black for home
	}
	
	public void verifyDragAndDrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform(); //to perform drag and drop
	}
	
	public void verifyKeyboardActions() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL); //control key
		r.keyPress(KeyEvent.VK_T);       //new tab
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HandlingActions actions = new HandlingActions();
		actions.initialiseBrowser();
		//actions.verifyRightClick();
		//actions.verifyMouseOver();
		//actions.verifyDragAndDrop();
		try {
			actions.verifyKeyboardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
