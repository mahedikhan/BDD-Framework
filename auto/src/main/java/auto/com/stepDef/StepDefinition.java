package auto.com.stepDef;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testUtil.TestUtility;

public class StepDefinition {
	
	WebDriver driver;
	TestUtility testu;
	
	@Given("^user is already on AutoTrader HomePage$")
	
	public void user_is_already_on_AutoTrader_HomePage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahtab\\OneDrive\\Desktop\\Selenium Auto\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.autotrader.com");
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@When("^Browse by Make is present$")
	
	public void Browse_by_Make_is_present() {
	boolean isDis = driver.findElement(By.xpath("//span[@class='text-link text-bold text-size-5 text-size-sm-10 text-white']")).isDisplayed();
	if(isDis) {
		System.out.println("Browse by Make is present");
	}else {
		System.out.println("Browse by Make is not present");
	}
	}
	
	@Then("^Browse by Style is present$")
	public void browse_by_Style_is_present() {
		boolean isDis1 = driver.findElement(By.xpath("//span[@class='text-link text-bold text-size-5 text-size-sm-10']")).isDisplayed();
		if(isDis1) {
			System.out.println("Browse by Style is present");
		}else {
			System.out.println("Browse by Style is not present");
		}
		
	}
	@Then("^Advanced Search is present$")
	public void Advanced_Search_is_present() {
		boolean isDis2 = driver.findElement(By.xpath("//a[@data-qaid='adv_srch']")).isDisplayed();
		if(isDis2) {
			System.out.println("Advanced Search is present");
		}else {
			System.out.println("Advanced Search is not present");
		}
			
	}
	@Then("^Search button is present$")
	public void search_button_is_present() {
		boolean sButton = driver.findElement(By.xpath("//button[@id='search']")).isDisplayed();
		if(sButton) {
			System.out.println("Search button is present");
		}else {
			System.out.println("Search button is not present");
		}
	}
	@Then("^Drop Downs make and model is present$")
	public void drop_Downs_make_and_model_is_present() {
		boolean dropDownMake = driver.findElement(By.xpath("//*[@id=\"makeCodeListPlaceHolder\"]")).isDisplayed();
		if(dropDownMake) {
			System.out.println("Drop Down Make is present");
		}else {
			System.out.println("Drop Down Make is not present");
		}
		
		boolean dropDownModel = driver.findElement(By.xpath("//*[@id=\"modelCodeListPlaceHolder\"]")).isDisplayed();
		if(dropDownModel) {
			System.out.println("Drop Down Model is present");
		}else {
			System.out.println("Drop Down Model is not present"); }
		driver.quit();
		}
		
		@Given("^user is on AdvancedSearch Page$")
		public void user_is_on_AdvancedSearch_Page() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahtab\\OneDrive\\Desktop\\Selenium Auto\\chromedriver_win32 (1)\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.get("https://www.autotrader.com");
			//driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@data-qaid='adv_srch']")).click();
			Thread.sleep(2000);
		}
		
		@When("^user enter \"([^\"]*)\" in text box$")
		public void user_enter_in_text_box(String zipcode) {
		    driver.findElement(By.xpath("//input[@id='zipundefined']")).sendKeys(zipcode);
		}
		

		@Then("^user select certified checkbox under condition$")
		public void user_select_certified_checkbox_under_condition() throws InterruptedException {
		   driver.findElement(By.xpath("//div[@class='col col-xs-4 col-lg-2']//child::label[@class='checkbox ae-label']//child::div[contains(text(), 'Certified')]")).click();
		   Thread.sleep(10000);
		
		}
		@Then("^user select convertible checkbox under style$")
		public void user_select_convertible_checkbox_under_style(){
			 WebElement element4 = driver.findElement(By.xpath("//*[@id=\"mountNode\"]/div/div[1]/div/div/div[1]/form/div[5]/div/div[2]/div/div/div[1]/label[1]/div[1]"));
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("arguments[0].click();", element4);
		}
		@Then("^user select from year to year$")
		public void user_select_from_year_to_year() throws InterruptedException {
			//this code will select from year
		
			 WebElement element = driver.findElement(By.xpath("//*[@name='startYear']"));
			    Select sel = new Select(element);
			    sel.selectByVisibleText("2017");
			    Thread.sleep(2000);
		
             WebElement element1 = driver.findElement(By.xpath("//*[@name='endYear']"));
             Select sel1 = new Select(element1);
             sel1.selectByVisibleText("2020");
             Thread.sleep(2000);
             
        }
		@Then("^user select make, model and trim section$")
		public void user_select_make_model_and_trim_section() throws InterruptedException  {
			// this will selelct BMW
			WebElement element = driver.findElement(By.xpath("//*[@name=\"makeFilter0\"]"));
		    Select sel2 = new Select(element);
		    sel2.selectByVisibleText("BMW");
		    Thread.sleep(15000);
		
		}
            
		@Then("^user click search button$")
		public void user_click_search_button() throws Throwable {
		    WebElement element3 = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block ae-button']"));
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].click();", element3);
			Thread.sleep(10000);
			
			List<WebElement> resultList = driver.findElements(By.xpath("//img[@data-cmp='inventoryImage']"));
			int size = resultList.size();
			System.out.println("Total search result is" + size);
			
		}

		
}


		
		
		
		
		
		
	

	
	
	
	
	
	
	
	


