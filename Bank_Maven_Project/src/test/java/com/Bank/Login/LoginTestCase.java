package com.Bank.Login;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
        driver.getTitle();
	}

}
