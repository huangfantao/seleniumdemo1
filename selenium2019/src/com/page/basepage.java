package com.page;

import com.util.loginutil;

public class basepage extends loginutil {
	//�����߿��
		public void tzzb() {
			driver.switchTo().frame("menu");
		}
	//��ת���ұ߿���ҷ��ص��ⲿ
		public void  tzyb() {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("main");
		}	
}
