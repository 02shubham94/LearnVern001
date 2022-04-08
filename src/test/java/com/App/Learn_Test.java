package com.App;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.ChromeBaseClass;
import com.BaseClass.UtilityClass;
import com.Configuration.PathFiles;
import com.PomClass.DataMembers;

public class Learn_Test {
	WebDriver cdriver;
	DataMembers dm;
	UtilityClass util;
	@BeforeMethod
	void launchBrowser() {
		ChromeBaseClass cbase = new ChromeBaseClass();
		cdriver = cbase.cdriverinit();
		dm = new DataMembers(cdriver);
		util = new UtilityClass();
		cdriver.manage().window().maximize();
		cdriver.get(PathFiles.ProjectUrl);
	}
	@Test(enabled=true)
	void loginTest001() throws IOException {
		dm.clicklogin();
		dm.clickwithemail();
		dm.enteremail(util.getCellData(1, 1));
		dm.enterpass(util.getCellData(1, 2));
		dm.clicksubmit();
		dm.clickname();
		dm.clicklogout();
	}
	@Test(enabled=true)
	void loginTest002() throws IOException {
		dm.clicklogin();
		dm.clickwithemail();
		dm.enteremail(util.getCellData(2, 1));
		dm.enterpass(util.getCellData(2, 2));
		dm.clicksubmit();
		dm.clickname();
		dm.clicklogout();
	}
	@Test(enabled=true)
	void loginTest003() throws IOException {
		dm.clicklogin();
		dm.clickwithemail();
		dm.enteremail(util.getCellData(3, 1));
		dm.enterpass(util.getCellData(3, 2));
		dm.clicksubmit();
		dm.clickname();
		dm.clicklogout();
	}
	@AfterMethod
	void closeBrowser() {
		cdriver.quit();
	}
}
