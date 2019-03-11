package com.page;

import org.openqa.selenium.By;

import com.util.loginutil;

public class bjglpage extends loginutil {
//点击学生管理
	public void xsgl() {
		    driver.findElement(By.linkText("学生管理")).click();
	}
//点击班级管理
	public void bjgl() {
		driver.findElement(By.linkText("班级管理")).click();
	}
//点击新增班级
	public void xzbj() {
		driver.findElement(By.linkText("新增班级")).click();
	}
//输入机构名称
	public void jgmc() {
		 driver.findElement(By.name("b_name")).clear();
		 driver.findElement(By.name("b_name")).sendKeys("hh");
	}
//点击提交
	public void tj() {
		    driver.findElement(By.cssSelector("button.tm_btn.tm_btn_primary")).click();
	}
}
