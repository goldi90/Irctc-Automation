package com.E_Banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HandelPoups {

	WebDriver ldriver;
	public HandelPoups(WebDriver rdriver){
		
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
	
	}
	@FindBy(xpath ="/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")
	WebElement OkButton;
	
	public void HandelPopUp() throws InterruptedException {
		
		Thread.sleep(5000);
		OkButton.click();
		Thread.sleep(7000);
	}
	
	
}
