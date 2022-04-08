package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Configuration.PathFiles;

public class ChromeBaseClass {
	public WebDriver cdriverinit() {
		System.setProperty(PathFiles.chromekey, PathFiles.chromepath);
		WebDriver cdriver = new ChromeDriver();
		return cdriver;
	}
}