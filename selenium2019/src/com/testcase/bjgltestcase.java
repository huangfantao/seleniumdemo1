package com.testcase;

import org.testng.annotations.Test;

import com.busniss.bjglbusiness;
import com.busniss.loginbusiness;
import com.util.loginutil;
@Test
public class bjgltestcase extends loginutil {
bjglbusiness bjgl=new bjglbusiness();
loginbusiness login=new loginbusiness();
public void bjgl() throws Exception {
	login.openurl();
	login.loginb();
	bjgl.bjglcz();
}
}
