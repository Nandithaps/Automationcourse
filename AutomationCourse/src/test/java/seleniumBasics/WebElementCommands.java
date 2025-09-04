package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base
{
    public void verifyWebElements()
    {
    	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
    	WebElement messagebox = driver.findElement(By.id("single-input-field"));
    	messagebox.sendKeys("Nanditha");
    	WebElement showbutton = driver.findElement(By.id("button-one"));
    	System.out.println(showbutton.isDisplayed());
    	System.out.println(showbutton.isEnabled());
    	showbutton.click();
    	WebElement yourmessage = driver.findElement(By.id("button-one"));
    	System.out.println(yourmessage.getText());
    	messagebox.clear();
    	System.out.println(showbutton.getTagName());
    	System.out.println(messagebox.getCssValue("border-color"));
    	
    	
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebElementCommands element = new WebElementCommands();
		element.initialiseBrowser();
		element.verifyWebElements();

	}

}
