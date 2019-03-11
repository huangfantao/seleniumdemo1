package com.busniss;

import com.page.loginpage;

public class loginbusiness extends loginpage {
	public void loginb() throws Exception {
		loginpage page=new loginpage();
		page.openurl();
		page.setusername();
		page.setpassword();
		page.selectlx();
		Thread.sleep(8000);
		page.clicklogin();
	}
	
}
