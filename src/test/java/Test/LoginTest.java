package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.LoginPage;
import utility.BaseClass;
import utility.Parametrization;

public class LoginTest extends BaseClass {

	@BeforeMethod
	public void OpenBrowser() {
		driver=Browser.LaunchChrome();
	}
	@Test
	public void LoginWithCredentials() throws EncryptedDocumentException, IOException {
		LoginPage log=new LoginPage(driver);
	String user=Parametrization.GetExcelData("Credentials", 0, 0);
	String Pass=Parametrization.GetExcelData("Credentials", 1, 0);
		log.Entermail(user);
		log.Enterpass(Pass);
		log.ClickLogin();
		String ExpectedUrl="https://www.saucedemo.com/inventory.html";
		String ActualUrl=driver.getCurrentUrl();
		Assert.assertEquals(ActualUrl, ExpectedUrl);
		
	}
	
}
