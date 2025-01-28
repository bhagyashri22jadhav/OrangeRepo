package BaseLayer;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import UtilityLayer.PropertyHelper;



public class BaseClass {
	
	protected static ThreadLocal<WebDriver> td=new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver()
	{
		return td.get();
	}
	//We achived method overloding .Below method will be used when we want to get browsername from feature file
	public static void initialization(String browsername)
	{
	
	
	 if(browsername.equalsIgnoreCase("chrome"))
	{
		WebDriver driver=new ChromeDriver();
		td.set(driver);
	}
	else if(browsername.equalsIgnoreCase("edge"))
	{
		WebDriver driver=new EdgeDriver();
		td.set(driver);
	}
	else if(browsername.equalsIgnoreCase("incognito"))
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("incognito");
		WebDriver driver=new ChromeDriver(opt);
		td.set(driver);
	}
	else if(browsername.equalsIgnoreCase("disable-notification"))
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notification");
		WebDriver driver=new ChromeDriver(opt);
		td.set(driver);
	}
	else
	{
		System.out.println("please enter valide browser");
	}
	 getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	 getDriver().manage().window().maximize();
	 getDriver().manage().deleteAllCookies();
	}
	//We achived method overloding .Below method will be used when we will get browsername from config file
	public static void initialization() throws IOException
	{
		String browsername=PropertyHelper.getProperty("BROWSER_NAME");
	
	
	 if(browsername.equalsIgnoreCase("chrome"))
	{
		WebDriver driver=new ChromeDriver();
		td.set(driver);
	}
	else if(browsername.equalsIgnoreCase("edge"))
	{
		WebDriver driver=new EdgeDriver();
		td.set(driver);
	}
	else if(browsername.equalsIgnoreCase("incognito"))
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("incognito");
		WebDriver driver=new ChromeDriver(opt);
		td.set(driver);
	}
	else if(browsername.equalsIgnoreCase("disable-notification"))
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notification");
		WebDriver driver=new ChromeDriver(opt);
		td.set(driver);
	}
	else
	{
		System.out.println("please enter valide browser");
	}
	 getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	 getDriver().manage().window().maximize();
	 getDriver().manage().deleteAllCookies();
	}
	
	public static void getURL() throws IOException
	{
		String abc=PropertyHelper.getProperty("SIT_BASE_URL");
		getDriver().get(abc);
	}
}
