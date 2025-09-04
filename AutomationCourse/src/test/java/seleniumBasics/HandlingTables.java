package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTables extends Base
{
	public void handleTable()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		//WebElement table = driver.findElement(By.xpath("//table[@id='dataTable']"));   // for getting table
		//System.out.println(table.getText());
		
		WebElement row=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]")); // for single row
		System.out.println(row.getText());  
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HandlingTables table = new HandlingTables();
		table.initialiseBrowser();
		table.handleTable();

	}

}
