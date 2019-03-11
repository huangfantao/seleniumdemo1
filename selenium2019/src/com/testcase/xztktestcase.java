package com.testcase;

import org.testng.annotations.Test;

import com.busniss.loginbusiness;
import com.busniss.xztkbusiness;
import com.util.loginutil;
@Test
public class xztktestcase extends loginutil{
	loginbusiness login=new loginbusiness();
	xztkbusiness x=new xztkbusiness();
public void  xztkb() throws Exception {
	
	login.openurl();
	login.loginb();
	x.xztkcz();

}
}
