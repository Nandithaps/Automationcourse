package seleniumBasics;

public class NavigationCommands extends Base
{
	public void verifyCommands()
	{
		driver.navigate().to("https://www.amazon.in/");  //navigate from obsqura to amazon (different application)
		driver.navigate().back(); //navigate back to Obsqura
		driver.navigate().forward(); // navigate to Amazon
		driver.navigate().refresh(); // refresh the page
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		NavigationCommands navigate = new NavigationCommands();
		navigate.initialiseBrowser();
		navigate.verifyCommands();

	}

}
