package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload 
{
	public WebDriver driver;
    public void sendKeysForFileUpload()
    {
    	driver = new ChromeDriver();
    	driver.get("https://the-internet.herokuapp.com/upload");
    	driver.manage().window().maximize();
    	WebElement file = driver.findElement(By.xpath("//input[@id='file-upload']"));
    	//file.click();
    	file.sendKeys("D:\\Nanditha\\OBSQURA\\MANUAL_TESTING_03072025\\TestingMethods.docx");
    }
    
    public void roboClassForFileUpload() throws AWTException
    {
    	driver = new ChromeDriver();
    	driver.get("https://www.ilovepdf.com/pdf_to_word");
    	driver.manage().window().maximize();
    	WebElement robo = driver.findElement(By.xpath("//a[@id='pickfiles']"));
    	robo.click();
    	StringSelection stringselect = new StringSelection("D:\\Nanditha\\OBSQURA\\JAVA_13052025\\javanotes\\Corejava 3.pdf");
    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect,null);
    	Robot robot = new Robot();
    	robot.delay(1000);
    	robot.keyPress(KeyEvent.VK_CONTROL);
    	robot.keyPress(KeyEvent.VK_V);
    	robot.keyRelease(KeyEvent.VK_CONTROL);
    	robot.keyRelease(KeyEvent.VK_V);
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	
    }
	public static void main(String[] args) throws AWTException
	{
		// TODO Auto-generated method stub
		FileUpload fileupload = new FileUpload();
		//fileupload.sendKeysForFileUpload();
		fileupload.roboClassForFileUpload();
		

	}

}
