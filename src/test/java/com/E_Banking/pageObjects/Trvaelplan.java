package com.E_Banking.pageObjects;

import java.text.SimpleDateFormat;

import org.apache.poi.ss.formula.functions.Today;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trvaelplan {
	WebDriver ldriver;
	public Trvaelplan(WebDriver rdriver){
		
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
	
	}
	 String TravelmonthAndyear; // geting data fom web page
	@FindBy(xpath ="//*[@id=\"origin\"]/span/input")
	WebElement Form;
	
	@FindBy(xpath ="//*[@id=\"destination\"]/span/input")
	WebElement to;
	
	@FindBy(css="#jDate > span > input")
	WebElement date;
	
	@FindBy(css="#jDate > span > div > div > div.ui-datepicker-header.ui-widget-header.ui-helper-clearfix.ui-corner-all.ng-tns-c59-10 > div")
	WebElement MothYear;
	
	@FindBy(css="#jDate > span > div > div > div.ui-datepicker-header.ui-widget-header.ui-helper-clearfix.ui-corner-all.ng-tns-c59-10 > a.ui-datepicker-next.ui-corner-all.ng-tns-c59-10.ng-star-inserted")
	WebElement NextMonthPicker;	
	
	public void Fillform() throws InterruptedException {
		
		Thread.sleep(5000);
		Form.click();
		Form.sendKeys("LTT");
		Form.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		Form.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Thread.sleep(5000);
		to.click();
		to.sendKeys("PUNE");
		to.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		to.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
	}
	public void  traveldateNClass() throws InterruptedException {
	
		String month="june 2022";
		String day ="25";
		date.click();
		Thread.sleep(3000);
	TravelmonthAndyear=	MothYear.getText();
	while(TravelmonthAndyear==month) {
		NextMonthPicker.click();
		Thread.sleep(5000);
		
	}
	Thread.sleep(3000);
	
	} 
}
