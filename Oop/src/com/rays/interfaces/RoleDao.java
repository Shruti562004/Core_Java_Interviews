package com.rays.interfaces;

public class RoleDao  implements UserDao , BaseDao{

	@Override
	public void add() {
	System.out.println("add");
		
	}

	@Override
	public void update() {
	System.out.println("update");
		
	}

	@Override
	public void delete() {
		System.out.println("delete");
		
	}

	@Override
	public void search() {
		System.out.println("search");
		
	}

}
