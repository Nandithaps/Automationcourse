package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base
{

	public void simpleAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement button = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		button.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void confirmationAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement confirmButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirmButton.click();
		Alert alertconfirm = driver.switchTo().alert();
		//alertconfirm.accept();
		alertconfirm.dismiss();
	}
	
	public void promptAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement promptButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		promptButton.click();
		Alert alertprompt = driver.switchTo().alert();
		alertprompt.sendKeys("Nanditha");
		System.out.println(alertprompt.getText());
		alertprompt.accept();
		
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		AlertHandling alerthandle = new AlertHandling();
		alerthandle.initialiseBrowser();
		//alerthandle.simpleAlert();
		//alerthandle.confirmationAlert();
		alerthandle.promptAlert();
		

	}

}
