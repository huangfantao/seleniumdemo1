package com.page;

import org.openqa.selenium.By;

import com.util.loginutil;

public class bjglpage extends loginutil {
//���ѧ������
	public void xsgl() {
		    driver.findElement(By.linkText("ѧ������")).click();
	}
//����༶����
	public void bjgl() {
		driver.findElement(By.linkText("�༶����")).click();
	}
//��������༶
	public void xzbj() {
		driver.findElement(By.linkText("�����༶")).click();
	}
//�����������
	public void jgmc() {
		 driver.findElement(By.name("b_name")).clear();
		 driver.findElement(By.name("b_name")).sendKeys("hh");
	}
//����ύ
	public void tj() {
		    driver.findElement(By.cssSelector("button.tm_btn.tm_btn_primary")).click();
	}
}
