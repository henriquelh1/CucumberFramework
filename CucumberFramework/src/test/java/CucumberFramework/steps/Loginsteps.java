package CucumberFramework.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Loginsteps {

	WebDriver driver;

	@Before()
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\luis_marreiros\\eclipse-workspace\\CucumberFramework\\CucumberFramework\\src\\test\\java\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

	}

	@Given("^user navigates on website$")
	public void user_navigates_to_stackoverflow_website() throws Throwable {
		driver.get("http://automationpractice.com/index.php?");
	}

	@Given("^User clicks on the login button on homepage$")
	public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
		driver.findElement(By.className("login")).click();
		
	}

	@Given("^User enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("luis@hahaha.com");
	}

	@Given("^User enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
		
		driver.findElement(By.id("passwd")).sendKeys("123456");;
	}

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.id("SubmitLogin")).click();
	}

	@Then("^User should be taken to the successful login page$")
	public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
		WebElement button = driver.findElement(By.xpath("//*[@title='Orders']"));
		Assert.assertEquals(true, button.isDisplayed());
		
	}

	@Given("^user navigates on website(\\d+)$")
	public void user_navigates_to_stackoverflow_website(int arg1) throws Throwable {
		System.out.println("user navigates to stackoverflow website 222");
		driver.get("https://stackoverflow.com/");
	}

	@Given("^User clicks on the login button on homepage(\\d+)$")
	public void user_clicks_on_the_login_button_on_homepage(int arg1) throws Throwable {
		System.out.println("User clicks on the login button on homepage 222");
	}

	@Given("^User enters a valid username(\\d+)$")
	public void user_enters_a_valid_username(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User enters a valid username 222");
	}

	@Given("^User enters a valid password(\\d+)$")
	public void user_enters_a_valid_password(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User enters a valid password 222");
	}

	@When("^user clicks on the login button(\\d+)$")
	public void user_clicks_on_the_login_button(int arg1) throws Throwable {
		System.out.println("user clicks on the login button 222");
	}

	@Then("^User should be taken to the successful login page(\\d+)$")
	public void user_should_be_taken_to_the_successful_login_page(int arg1) throws Throwable {
		System.out.println("User should be taken to the successful login page 222");
	}

}
