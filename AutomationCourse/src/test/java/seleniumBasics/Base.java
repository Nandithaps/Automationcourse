package seleniumBasics;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	
    public WebDriver driver;
    public void initialiseBrowser()
	{
    	//WebDriverManager.edgedriver().setup();  //import also
    	//WebDriverManager.edgedriver()
        //.clearResolutionCache()
        //.forceDownload()
        //.setup();
    	
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
    	
    	WebDriverManager.edgedriver();
    	//driver = new EdgeDriver();
    	
		driver.get("https://selenium.qabible.in/"); //url open
		driver.manage().window().maximize(); //window maximize
	}
    
    public void browserClose()
    {
    	//driver.close();
        //driver.quit();
    }

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Base base = new Base();
		base.initialiseBrowser();
		base.browserClose();

	}
	
	
}
