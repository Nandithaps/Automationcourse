package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base
{
	public void verifyFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		List <WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());  //to find total count of frames...WebElementname.size() //o/p 11
		WebElement frameone = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frameone); // driver control from page to frame1
		WebElement framehead = driver.findElement(By.id("sampleHeading"));
		System.out.println(framehead.getText());  // get the text from frame   //o/p This is a sample page
		driver.switchTo().defaultContent(); // switches back to page from frame1
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HandlingFrames frame = new HandlingFrames();
		frame.initialiseBrowser();
		frame.verifyFrames();

	}

}
