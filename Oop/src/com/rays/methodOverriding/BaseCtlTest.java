package com.rays.methodOverriding;

public class BaseCtlTest {
public static void main(String[] args) {
	UserCtl ctl=new UserCtl();
	ctl.getView();
	
	LoginCtl log=new LoginCtl();
	log.getView();
	
	BaseCtl base=new LoginCtl();
	base.getView();
	
	//LoginCtl ct=new BaseCtl(); nooo
}
}
