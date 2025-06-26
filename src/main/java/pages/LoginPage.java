package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	
	private WebDriver driver;
	

	private By usernameTextBox = By.xpath("//input[@name='username']");
	//private By usernameTextBox = By.cssSelector("input[name='username']");
	private By passwordTextBox = By.xpath("//input[@name='password']");
	private By loginButton = By.xpath("//button[@type='submit']");
	//private By forgotText = By.xpath("//*[contains(text(),'Forgot')]");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {

		driver.findElement(usernameTextBox).clear();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(usernameTextBox));
//		usernameField.sendKeys(username);
		driver.findElement(usernameTextBox).sendKeys(username);
	}

	public void enterPassword(String password) {

		driver.findElement(passwordTextBox).clear();
		driver.findElement(passwordTextBox).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
//	public void clickForgotPassword() {
//		
//		driver.findElement(forgotText).click();
//	}
}
