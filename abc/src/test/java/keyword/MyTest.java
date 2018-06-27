package keyword;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterClass;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import abcd.Base;



public class MyTest{ 

WebDriver driver;
Loginpage obj1;
Base select_browser;

@BeforeClass
public void calllaunchBrowser() {
	Base b =new Base();
	driver = b.getDriver();
	PageVerification objj = new PageVerification(driver);
	objj.openbrowser();
}
@Test(priority = 0)
public void callLoginPage() {
	Loginpage obj1 = new Loginpage(driver);
	obj1.LoginWithWrongCreditional("fewqer", "wqwdeqwde");
	Assert.assertTrue(obj1.driver.getCurrentUrl().contains("login"));
}
@Test(priority = 1)
public void callBlankCredentials() {
	Loginpage obj2 = new Loginpage(driver);
	obj2.LoginWithbothBlankCreditional("", "");
	Assert.assertTrue(obj2.driver.getCurrentUrl().contains("login"));
}
@Test(priority = 2)
public void callCorrectUsername() {
    Loginpage obj3 = new Loginpage(driver);
	obj3.LoginWithCorrectusernameandwrongpass("divyankdawar","12456grtg");
	Assert.assertTrue(obj3.driver.getCurrentUrl().contains("login"));
}
@Test(priority = 3)
public void callEnteredPassword() {
    Loginpage obj4 = new Loginpage(driver);
	obj4.LoginWithCorrectusernameandwrongpass("divyankdawar","12456grtg");
	Assert.assertTrue(obj4.driver.getCurrentUrl().contains("login"));
}
@Test(priority = 4)
public void callCorrectCredentials() {
    Loginpage obj5 = new Loginpage(driver);
	obj5.LoginWithCorrectcredtional("divyankdawar","Qait@123");
	Assert.assertTrue(obj5.driver.getCurrentUrl().contains("Your"));
	

	
	
}

}