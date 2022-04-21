package com.E_Banking.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.E_Banking.pageObjects.HandelPoups;
import com.E_Banking.pageObjects.Login;
import com.E_Banking.pageObjects.Trvaelplan;

public class Tests extends BaseClass {
	
	@Test
	public void Hadelpopup() throws InterruptedException {
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HandelPoups lp=new HandelPoups(driver);
		lp.HandelPopUp();
	}
//	@Test
//	public void ClickHamburger() throws InterruptedException {
//		Login Lp=new Login(driver);
//		Lp.Hamburgerclick();
//		
	@Test
	public void  fillform() throws InterruptedException {
		Trvaelplan travel=new Trvaelplan(driver);
		travel.Fillform();
	}
	@Test
	public void traveldateNClass1() throws InterruptedException {
		 
			Trvaelplan travel=new Trvaelplan(driver);
			travel.traveldateNClass();
		
	
	}
}


