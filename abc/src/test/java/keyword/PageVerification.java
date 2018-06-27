package keyword;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import abcd.Base;

public class PageVerification extends Base {
	public PageVerification (WebDriver driver) {
		this.driver =driver;
	}
	public void openbrowser() {
		driver.get("https://hris.qainfotech.com/login.php");
		String pagetitle =driver.getTitle();
		System.out.println(driver);
		
		Assert.assertEquals("HRIS Login",pagetitle);
		System.out.println("page verified");
		
	}
	

}
