package org.test.drivers;

import org.futurepages.test.DriverFactory;
import org.futurepages.util.Is;
import org.futurepages.util.The;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CustomChromeDriver extends ChromeDriver {

//	public CustomChromeDriver(ChromeOptions options) {
//		super(options);
//	}
//
//	private Long sleepTime = null;
//
//	/**
//	 *
//	 */
//	public CustomChromeDriver() {
//		super();
//		if(!Is.empty(DriverFactory.TESTING_DELAY_MS) && !DriverFactory.TESTING_DELAY_MS.equals("0")){
//			sleepTime = Long.parseLong(DriverFactory.TESTING_DELAY_MS);
//		}
//	}
//
//	@Override
//	public WebElement findElement(By by) {
//		WebElement el = super.findElement(by);
//		sleepSeNecessario(el);
//		return el;
//	}
//
//	private void sleepSeNecessario(WebElement el) {
//		if(sleepTime!=null) {
//			String st = el.getAttribute("style");
//			this.executeScript("arguments[0].setAttribute('style', '" + st + "; background: yellow !important; background-image: none !important;');", el);
//			The.sleepOf(sleepTime);
//			this.executeScript("arguments[0].setAttribute('style', '" + st + "');", el);
//		}
//	}
}
