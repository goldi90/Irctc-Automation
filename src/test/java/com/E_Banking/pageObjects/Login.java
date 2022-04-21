package com.E_Banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver ldriver;
	
	public Login(WebDriver rdriver)
		{
			this.ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
	}
@FindBy(css  ="body > app-root > app-home > div:nth-child(1) > app-header > div.h_container_sm > div.h_menu_drop_button.hidden-xs")
	WebElement Hamburger; 
	
	public void Hamburgerclick() throws InterruptedException {
		Thread.sleep(5000);
		Hamburger.click();
	}
}
