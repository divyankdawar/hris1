package keyword;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import abcd.Base;


	
public class Loginpage extends Base{ 
		
	public Loginpage(WebDriver driver) {
	this.driver =driver;
			
	}
	By UserName = By.id("txtUserName");
	By Password = By.id("txtPassword");
	//By Submit = By.className("bt");
		
	By sub =By.name("Submit");
	By tab = By.className("active");
				
	public void LoginWithWrongCreditional(String user,String Pass) {
		driver.findElement(tab).click();
		driver.findElement(UserName).sendKeys(user);
		driver.findElement(Password).sendKeys(Pass);
		driver.findElement(sub).click();
		System.out.println("Wrong creditional verified");
	}
	public void LoginWithbothBlankCreditional(String user,String Pass) {
		driver.findElement(tab).click();
		driver.findElement(UserName).sendKeys(user);
		driver.findElement(Password).sendKeys(Pass);
		driver.findElement(sub).click();
		System.out.println("Blank creditional verified");
	}
	public void LoginWithCorrectusernameandwrongpass(String user,String Pass) {
		driver.findElement(tab).click();
		driver.findElement(UserName).sendKeys(user);
		driver.findElement(Password).sendKeys(Pass);
		driver.findElement(sub).click();
		System.out.println("Correct username and wrong pass verified");
	}
	public void LoginWithCorrectcredtional(String user,String Pass) {
		driver.findElement(tab).click();
		driver.findElement(UserName).sendKeys(user);
		driver.findElement(Password).sendKeys(Pass);
		driver.findElement(sub).click();
		System.out.println("Correct username and Correct pass verified");

	}
}


