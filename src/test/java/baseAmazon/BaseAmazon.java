package baseAmazon;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;

import utility.TimeUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BaseAmazon {
	public static Properties prop=new Properties();
	public static WebDriver driver;
	
	public BaseAmazon() {
		try {
		FileInputStream file=new FileInputStream("C:\\Users\\16477\\eclipse-workspace\\Amazonjas\\src\\test\\java\\variables\\Config.properties");
		prop.load(file);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
		catch(IOException a) {
			a.printStackTrace();
		}
	}
	
	public static void initiate() {
		String browsername=	prop.getProperty("browser");
		if(browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver=new FirefoxDriver();}
			else if(browsername.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				 ChromeOptions options = new ChromeOptions();
					options.addArguments("--remote-allow-origins=*");

				driver=new ChromeDriver(options);
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage,TimeUnit.SECONDS );
		driver.get(prop.getProperty("url"));
		
		}

public static void Screenshots(String Filename) {
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	
	
	FileUtils.copyFile(file, new File("C:\\Users\\16477\\eclipse-workspace\\Amazonjas\\src\\test\\java\\screenshots\\Screenshots" +Filename+".jpg"));
}
catch(IOException e) {
	e.printStackTrace();
}}
}	
		/*   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		driver.get("url");*/
	


