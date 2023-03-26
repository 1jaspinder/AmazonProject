package pomPackage;

import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import baseAmazon.BaseAmazon;

public class Pagination extends BaseAmazon{
	
	
	@FindBy(css="#twotabsearchtextbox") WebElement Search1;
	@FindBy(id="nav-search-submit-button")WebElement SearchSubmit1;
	 @FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small']//span[text()='1-48 of over 30,000 results for']")WebElement numberdetails;
	@FindBy(xpath="//a[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-separator']")WebElement Nextbutton;
   
	
    
    
    public Pagination() {
		PageFactory.initElements(driver,this);
		
		
		}

	public void searchBox1() {
		
		Search1.sendKeys("tshirt for women");
		
		
	}
	
	public void submitbtn1() {
		SearchSubmit1.click();
	}
	
	
	public void titleofproduct(int nelement) {
		List<WebElement> titlepro= driver.findElements(By.xpath("//div[@class='a-section a-spacing-base a-text-center']"));
		if(titlepro.size()!=0)
		{
		titlepro.get(nelement);
		
		
		
		}

	}
	
	/*public void pagedetails1(int nelement) {
		
		//title.click();
	
	//String displayedcount=	Details.getText().split("  ")[1];
		
		
		List<WebElement> prices = driver.findElements(By.id("//span[@id='a-autoid-4-announce']"));

				// extract the prices from the price elements and store in a List
				//List<String> prices = new ArrayList<String>();
				for(int i=0;i<prices.size();i++) {
				
			for (WebElement e : prices)
				{
				    prices.size();
				    prices.get(nelement).click();
				}

				// make a copy of the list
				List<String> sortedPrices = new ArrayList<String>();

				// sort the list
				Collections.sort(sortedPrices);

				// true if the prices are sorted
				System.out.println(sortedPrices.equals(prices));


				}
	}*/
public void next() throws InterruptedException {
	String numberdetails=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//span[text()='1-48 of over 30,000 results for']")).getText().split("  ")[0];
Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		js.executeScript("window.scroll(0,9000);");
		Thread.sleep(3000);
		
		List<WebElement> products =driver.findElements(By.xpath("//div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro']//h5[@class='s-line-clamp-1']"));
		List<String> productNames=new ArrayList();
	
   for(WebElement names: products) {
	   productNames.add(names.getText());
	   System.out.println(names.getText());
	  
   }
   System.out.println("*******************************");

while(true){
	Thread.sleep(2000);
	
	Nextbutton.click();
	
	Thread.sleep(3000);
	
	js.executeScript("window.scroll(0,7000);");
	
	Thread.sleep(3000);
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	products =driver.findElements(By.xpath("//div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro']//h5[@class='s-line-clamp-1']"));

	for(WebElement names: products) {
		   productNames.add(names.getText());
		   System.out.println(names.getText());
		   
	
	System.out.println("*******************************");  
	}
	try {
	Nextbutton=driver.findElement(By.xpath("//a[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-separator']"));   
	}
	catch(Exception e) {
		System.out.println("No more products");
		break;
	}
	}	

	System.out.println("*******************************");


	System.out.println("My Number of products are:  "+productNames.size());
	System.out.println("Total number of Displayed products:  "+numberdetails);


}
}

