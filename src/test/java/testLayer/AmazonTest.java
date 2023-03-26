package testLayer;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseAmazon.BaseAmazon;
import pomPackage.PomLogin;
import pomPackage.PomSearch;
import testdata.ExcelSheet;
import utility.TimeUtils;

public class AmazonTest extends BaseAmazon{
	PomLogin Log;
	//PomSearch Search;
	
	public AmazonTest() {
		super();
		
		
	}
	
	@BeforeMethod
	public void initsetup() throws InterruptedException {
		initiate();
		Screenshots("search");
		 Log=new PomLogin();
		// Search=new PomSearch();
		 
		
		
	}
	/*@Test(priority=1)
	public void signn() {
		Log.action();
		
	}*/
@Test(priority=1)
public void validusername() throws InterruptedException {
	Log.action();
	
	Log.typeusername(prop.getProperty("username"));
	Log.clitch();
	Log.typepassword(prop.getProperty("password"));
	Log.submitbtn();
	Log.searchBox2();
	Log.submitbtn2();
	//Payment.titleofproduct1(2);
	Log.productclick();
	Log.Cart1();
	Log.carttobuy();


	//Payment.skipthenotify1();

		


	Log.address();
	Log.giftcode();
	Log.entercodd();
	//Log.cardentry();


}
@Test
public void validpassword() {
	
	Log.Accountlist();
	Log.searchBox2();
	
}


/*@DataProvider
public Object[][] Details() throws InterruptedException {
		
		 Object[][] result= (Object[][]) ExcelSheet.readdata("Sheet1");
		System.out.println(result);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return result;
		*/

/*@Test(priority=2)
public void searchfacility() throws InterruptedException  {
	Search.searchBox();
	Search.submitbtn();
	Search.typeproduct();
	Search.clickonproduct();
	Search.cartBox();*/


@AfterMethod
public void close() {
	
	driver.quit();
}
}

