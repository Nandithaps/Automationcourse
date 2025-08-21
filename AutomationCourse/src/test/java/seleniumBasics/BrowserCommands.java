package seleniumBasics;

public class BrowserCommands extends Base
{
    public void verifyCommands()
    {
    	String title = driver.getTitle();  // title--tab name
    	System.out.println(title);
    	
    	String url = driver.getCurrentUrl();   //url
    	System.out.println(url);
    	
    	String handleid = driver.getWindowHandle();  // for single window
    	System.out.println(handleid);
    	
    	String source = driver.getPageSource();
    	System.out.println(source);
    }
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BrowserCommands browser = new BrowserCommands();
		browser.initialiseBrowser();
		browser.verifyCommands();

	}

}
