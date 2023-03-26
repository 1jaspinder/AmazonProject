package pomPackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseAmazon.BaseAmazon;

public class PomLogin extends BaseAmazon {
	@FindBy(id="nav-link-accountList-nav-line-1")WebElement Hello;
	@FindBy(css="#nav-flyout-ya-signin > a > span")WebElement Loginn;
	@FindBy(id="ap_email")WebElement Username1;
	@FindBy(id="continue")WebElement Continue1;
	@FindBy(id="ap_password")WebElement Password1;
	@FindBy(id="signInSubmit")WebElement Signin1;
	@FindBy(css="#twotabsearchtextbox") WebElement Search1;
	@FindBy(id="nav-search-submit-button")WebElement SearchSubmit1;

	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(4) > div > div > div > div > div > div > div.s-product-image-container.aok-relative.s-text-center.s-image-overlay-grey.s-padding-left-small.s-padding-right-small.puis-spacing-small.s-height-equalized > div > span > a > div > img")WebElement Product1;
	@FindBy(css="#sc-buy-box-ptc-button > span > input")WebElement ProceedtoBuy;
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")WebElement Cart3;

    @FindBy(css="#shipToThisAddressButton > span > input")WebElement Address;
	@FindBy(xpath="//span[@id='attachSiNoCoverage']//span[@class]//input[@class]")WebElement skip;

	@FindBy(xpath="//div[@class='a-row a-spacing-base apx-add-card-compact-grid-row']//input[@id='pp-9RPJP5-16']")WebElement cardnumber;
	@FindBy(xpath="//span[text()='Your Account']") WebElement Accountlists;
	
	public PomLogin() {
		PageFactory.initElements(driver,this);
	}
public void action() {

	
	 Actions action1=new Actions(driver);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	 action1.moveToElement(Hello).build().perform();
	 
	 Loginn.click();
}
	 public void typeusername(String username) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Username1.sendKeys(username);
			Username1.isDisplayed() ;
			
			
			}
	 
	  public void clitch() {
		Continue1.click();
	}
	public void typepassword(String password) {
		Password1.sendKeys(password);
		return;
	}
	
	public void submitbtn() {
		Signin1.submit();
		if( Loginn != null ) {
			System.out.println("Login Success");
		}
			else
			{	
			System.out.println("Login Failed");
			}
		}
	
	public void Accountlist() {

		 Actions action1=new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		 action1.moveToElement(Hello).build().perform();
		 Accountlists.click();
		 
		
//Select obj=new Select(driver.findElement(By.id("nav-link-accountList-nav-line-1")));
		
		//Three methods to select options.
		//obj.selectByVisibleText("Your Account");
		
		
		////span[text()='Your Account']
	}
	
	public void searchBox2() {
		
		Search1.sendKeys("tshirt for women");
		
		
	}
	
	public void submitbtn2() {
		SearchSubmit1.click();
	}
	
	
	public void productclick() throws InterruptedException {
		
		Thread.sleep(2000);
		Product1.isEnabled();
		Product1.click();
		
		
	}
	public void Cart1() throws InterruptedException {
		Thread.sleep(3000);
		
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> windows =new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Cart3.click();
		
		Thread.sleep(2000);
	}
	public void skipthenotify1() {
		skip.click();
	}

	 public void carttobuy() throws InterruptedException  {
	Thread.sleep(2000);
	ProceedtoBuy.click();

	}
	/* public void typeusername1(String username) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Username1.sendKeys(username);
			Username1.isDisplayed() ;
			}
	 
	public void clitch1() throws InterruptedException {
		Thread.sleep(2000);
		Continue1.click();
		Thread.sleep(2000);
		
	}
	public void typepassword1(String password) throws InterruptedException {
		Thread.sleep(2000);
		Password1.sendKeys(password);
		return;
	}
	
	public void submitbtn1() {
		Signin1.submit();
	}     */
	public void address() throws InterruptedException {
		Address.click();
		Thread.sleep(3000);
	}    
	public void giftcode() throws InterruptedException {
		Thread.sleep(3000);
		//WebElement radio= (WebElement) driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='pp-uFDF6Y-98']")));
    //driver.switchTo().frame(driver.findElement(By.id("pp-uFDF6Y-98")));
    
	WebElement radio= driver.findElement(By.xpath("//div[@class='a-fixed-left-grid-inner']//input[@value='SelectableAddCreditCard']"));
	
			radio.click();

	}
			public void entercodd() throws InterruptedException {
				
				
			Thread.sleep(3000);
		WebElement entercard=driver.findElement(By.xpath("//div[@class='a-row pmts-add-cc-default-trigger']//span[text()='Amazon accepts all major credit &  cards']"));
		entercard.click();
		//Alert alert = driver.switchTo().alert();
		//alert.sendKeys("5123456789012346");
		
			}

	
}

