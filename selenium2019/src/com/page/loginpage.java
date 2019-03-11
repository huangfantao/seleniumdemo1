package com.page;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.util.loginutil;

public class loginpage extends loginutil {
	//打开网址
	public void openurl() {
		driver.get(baseUrl);
	}
	
//用户名输入
public void setusername() {
	driver.findElement(By.name("username")).clear();
	 driver.findElement(By.name("username")).sendKeys("hujianming");
}
public void setpassword() {
	 driver.findElement(By.name("userpass")).clear();
	 driver.findElement(By.name("userpass")).sendKeys("hujianming123");
}
public void selectlx() {
	new Select(driver.findElement(By.name("usertype"))).selectByVisibleText("管理员");
}
public void clicklogin() {
	driver.findElement(By.cssSelector("button.tm_btn")).click();
}

}
