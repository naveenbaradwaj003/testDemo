package com.bjs.testng;

import org.testng.annotations.Test;

public class Testng {

	@Test(priority=2)
	public void b()
	{
		System.out.println("a");
	}
	@Test
	public void a()
	{
		System.out.println("b");
	}
	@Test(priority=2)
	public void d()
	{
		System.out.println("d");
	}
	@Test
	public void c()
	{
		System.out.println("c");
	}
}
