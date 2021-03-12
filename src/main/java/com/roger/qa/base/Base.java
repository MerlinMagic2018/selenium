package com.roger.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.roger.qa.util.TestUtil;
import com.roger.qa.util.WebEventListener;

public class Base {

	
//	public static EventFiringWebDriver e_driver;
//    public static WebEventListener eventListener;
	
	
		
	public static WebDriver driver;
	public static String chromeExePath = "C:\\Users\\Name\\eclipse-workspace"
			+ "\\POM_Project_concept\\src\\main\\java\\com\\roger\\qa\\util\\chromedriver.exe";
	
	public static String firefoxExePath = "C:\\Users\\Name\\eclipse-workspace\\POM_Project_concept"
			+ "\\src\\main\\java\\com\\roger\\qa\\util\\chromedriver.exe";
	public static Properties prop;
	public static FileInputStream file;
	
	public Base() {
		try {
			prop = new Properties();
			file = new FileInputStream("C:\\Users\\Name\\eclipse-workspace\\POM_Project_concept"
					+ "\\src\\main\\java\\com\\roger\\qa\\config\\config.properties");
			prop.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 
	
	
	public static void initialization() {
		//String browser = "chrome";
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		
		if(browserName.equals("CD")) {
			System.setProperty("webdriver.chrome.driver", chromeExePath);
			driver =  new ChromeDriver();
	}
			
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", firefoxExePath);
			driver =  new ChromeDriver();
		}
		else {
			System.out.println("Browser name is not found");
		}
		
		
		
//		e_driver = new EventFiringWebDriver(driver);
//	    eventListener = new WebEventListener();
//	    e_driver.register(eventListener);
//	    driver = e_driver;
//		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Wait, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Imp_Load_Wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
				
	}
	
	
}
