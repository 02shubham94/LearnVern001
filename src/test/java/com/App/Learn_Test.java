package com.App;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
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
	String tcID;
	
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
		tcID = "test001";
		dm.clicklogin();
		dm.clickwithemail();
		dm.enteremail(util.getCellData(2, 1));
		dm.enterpass(util.getCellData(2, 2));
		dm.clicksubmit();
		dm.clickname();
		dm.clicklogout();
	}
	@Test(enabled=true)
	void loginTest002() throws IOException {
		tcID = "test002";
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
		tcID = "test003";
		dm.clicklogin();
		dm.clickwithemail();
		dm.enteremail(util.getCellData(3, 1));
		dm.enterpass(util.getCellData(3, 2));
		dm.clicksubmit();
		dm.clickname();
		dm.clicklogout();
	}
	@AfterMethod
	void screenshot(ITestResult res) throws IOException {
		if(ITestResult.FAILURE==res.getStatus()){
			util.takeScreenshot(tcID, cdriver);
		}
		cdriver.quit();
	}
}
