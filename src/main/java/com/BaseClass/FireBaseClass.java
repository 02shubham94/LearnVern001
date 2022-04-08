package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Configuration.PathFiles;

public class FireBaseClass {
	public WebDriver fdriverinit() {
		System.setProperty(PathFiles.firekey, PathFiles.firepath);
		WebDriver fdriver = new FirefoxDriver();
		return fdriver;
	}
}