package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseAmazon.BaseAmazon;
import pomPackage.Pagination;
import pomPackage.PomLogin;
import pomPackage.PomSearch;

public class AmazonTestSearch  extends BaseAmazon{
	
	
	PomSearch Search;
	
	
	
	
	
	
	
	
	public AmazonTestSearch() {
		super();
	}
	@BeforeMethod
	public void initsetup1() {
		initiate();
		Screenshots("search");
		
		 Search=new PomSearch();
	}
	
	@Test(priority=1)
	public void searchfacility() throws InterruptedException  {
		Search.searchBox();
		Search.submitbtn();
		/*Search.typeproduct();
		Search.clickonproduct();
		Search.skipthenotify();
		Search.cartBox();*/
		//Search.quantityvalue();
		Search.sorting();
		Search.productclick();
		Search.Cart();
		
		

}

	@AfterMethod
	public void closetab() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();  
	}
}
