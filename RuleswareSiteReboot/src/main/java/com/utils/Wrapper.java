package com.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Wrapper {
	
	public WebDriver driver;
	
	public Wrapper(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();		
	}
	
	public void click(int i, By locator) {
		List<WebElement> elementList = findElements(locator);
		elementList.get(i).click();		
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		}catch(org.openqa.selenium.NoSuchElementException e) {
			return false;						
		}
	}
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void moveTo(By locator) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Actions act = new Actions(driver);
		jse.executeScript("arguments[0].scrollIntoView();", driver.findElement((By)locator));
		act.moveToElement(driver.findElement((By) locator)).perform();
		
	}
	
	public void closePopup(By locator) {
		WebDriverWait waitPopup = new WebDriverWait(driver, 7);
		waitPopup.until(ExpectedConditions.visibilityOfElementLocated(locator));
		click(locator);
	}
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void selectingDropdown(By locator) {
		int min = 1;
		int max = 9;
		int indexValue = (int)Math.floor(Math.random()*(max-min+1)+min);
		WebElement ddown = driver.findElement(locator);
		Select selectOpt = new Select(ddown);
		selectOpt.selectByIndex(indexValue);
	}
	
	public void hoverTo(By locator, int indexm, By locatorb, int indexsm) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		List<WebElement> listM = driver.findElements(locator);
		List<WebElement> elementSM = driver.findElements(locatorb);
		Actions action = new Actions(driver);
		WebElement menu = listM.get(indexm);
		action.moveToElement(menu).click().build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(locatorb));
		click(indexsm, locatorb);
	}
	
	public String getUrl() {
		String strurl = driver.getCurrentUrl();
		return strurl;
	}
	
	public void gobacktoMain() {
		driver.get("https://www.rulesware.com");
	}
	
	public void waitElementClickable(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		click(locator);
	}
	
	
	
}
