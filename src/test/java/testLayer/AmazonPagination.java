package testLayer;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseAmazon.BaseAmazon;
import pomPackage.Pagination;
import pomPackage.PomSearch;

public class AmazonPagination extends BaseAmazon {
	Pagination page;
	
	
	public AmazonPagination() {
		super();
	}
		@BeforeMethod
		public void initsetup2() {
			initiate();
			page=new Pagination();
			
	}
		@Test
		
public void clicknext() throws InterruptedException  {

			page.searchBox1();
			page.submitbtn1();
		
			page.titleofproduct(3);
			//page.pagedetails1(2);
			
			page.next();
	}

	@AfterMethod
		public void closewindow() {
			driver.close();
		}
}
