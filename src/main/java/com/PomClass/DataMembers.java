package com.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataMembers {
	@FindBy(xpath = "//*[text()='Login']")
	private WebElement login;
	@FindBy(xpath = "//*[@data-eventlabel='Login with Email']")
	private WebElement loginwithemail;
	@FindBy(xpath = "(//*[@type='email'])[1]")
	private WebElement emailid;
	@FindBy(xpath = "//*[@type='password']")
	private WebElement password;
	@FindBy(xpath = "//*[@id='loginSubmit']")
	private WebElement submit;
	@FindBy(xpath = "//*[text()='Shubham Hendwe']")
	private WebElement name;
	@FindBy(xpath = "//*[text()='Logout']")
	private WebElement logout;
	
	public DataMembers(WebDriver cdriver){
		PageFactory.initElements(cdriver, this);
	}
	
	public void clicklogin() {
		login.click();
	}
	public void clickwithemail() {
		loginwithemail.click();
	}
	public void enteremail(String st) {
		emailid.sendKeys(st);
	}
	public void enterpass(String st) {
		password.sendKeys(st);
	}
	public void clicksubmit() {
		submit.submit();
	}
	public void clickname() {
		name.click();
	}
	public void clicklogout() {
		logout.click();
	}
}
