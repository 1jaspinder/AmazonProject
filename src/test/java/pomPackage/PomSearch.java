package pomPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java. util. ArrayList;
import java.util.Collections;
import java. util. List;

import baseAmazon.BaseAmazon;

public class PomSearch extends BaseAmazon{
	
	
	
	// sorting and searching
	
	
	@FindBy(css="#twotabsearchtextbox") WebElement Search;
	@FindBy(id="nav-search-submit-button")WebElement SearchSubmit;
	@FindBy(xpath="//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//a[@class]//span[text()='Back Camera Lens Protector Apple iPhone Phones (iPhone 6)']")WebElement Product;
	//@FindBy(css="#add-to-cart-button")WebElement AddtoCart;
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")WebElement Cart2;
	@FindBy(xpath="//span[@id='attachSiNoCoverage']//span[@class]//input[@class]")WebElement skip;
	@FindBy(xpath="//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")WebElement Cartopen;
	//@FindBy(css="#nav-cart-count-container > span.nav-cart-icon.nav-sprite")WebElement Cartcount;
	
	//@FindBy(id="nav-cart-count")WebElement openCart;
	@FindBy(xpath="//span[@class='a-button-text a-declarative']")WebElement Quantity;
	
	
	
	
	
	public PomSearch()  {
		PageFactory.initElements(driver,this);
	
		}
	public void searchBox() throws InterruptedException {
		Thread.sleep(2000);
		Search.sendKeys("iphone14");
		Thread.sleep(2000);
		
		
	}
	public void submitbtn() throws InterruptedException {
		SearchSubmit.click();
		Thread.sleep(2000);
	}
	public void sorting() throws InterruptedException {
		
		List<WebElement>beforefilterprice= driver.findElements(By.xpath("//span[@class='a-price']"));
		
		Thread.sleep(3000);
		
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='s-result-sort-select']")));
		
		dropdown.selectByVisibleText("Price: Low to High");
		
		Thread.sleep(3000);
		
		
		List<WebElement> afterfilterprice= driver.findElements(By.xpath("//span[@class='a-price']"));
		
	Thread.sleep(3000);
	
	//Assert.assertEquals(beforefilterprice, afterfilterprice);
	}

public void productclick() {
	
	
	Product.click();
	
	
}


public void Cart() throws InterruptedException {
	Thread.sleep(3000);
	
	Set<String> windowHandles=driver.getWindowHandles();
	List<String> windows =new ArrayList<String>(windowHandles);
	driver.switchTo().window(windows.get(1));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	Cart2.click();
	
	Thread.sleep(2000);
}

	//compare the value
	
	


public void skipthenotify() {
	skip.click();
}

public void cartBox() throws InterruptedException  {
Thread.sleep(2000);
Cartopen.click();

}

/*public void quantityvalue() {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Select quantity=new Select(Quantity);
		quantity.selectByIndex(3);
	Quantity.click(); */
	
}



