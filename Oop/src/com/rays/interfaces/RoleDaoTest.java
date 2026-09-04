package com.rays.interfaces;

public class RoleDaoTest {
public static void main(String[] args) {
	
	BaseDao dao1=new RoleDao();
	UserDao dao2=new RoleDao();
	
	dao1.add();
	dao1.delete();
	dao1.update();
	dao2.search();
}
}
