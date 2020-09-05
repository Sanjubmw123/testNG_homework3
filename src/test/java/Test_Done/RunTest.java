package Test_Done;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import MakeUtil.LaunchBrowser;
import Page_make.ck_calen;

public class RunTest {
	WebDriver driver;
	LaunchBrowser browser;
	ck_calen dropck;
	
	@Test
	public void launch() throws Exception {
		driver=LaunchBrowser.startwebsite();
		 dropck=PageFactory.initElements(driver, ck_calen.class);
		dropck.calender();
		
	}
	
	}


