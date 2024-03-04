package testNGsessions;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 2)
	public void bbb2() {

		System.out.println("aaa");
	}
	@Test(priority = 1)
	public void bbb() {
		System.out.println("bbb");

	}
	@Test(priority = 0)
	public void ccc() {
		System.out.println("ccc");

	}
	@Test(priority = -1)
	public void ddd() {
		System.out.println("ddd");

	}
	@Test(priority = -2)
	public void eee() {
		System.out.println("eee");

	}
	@Test(priority = 6)
	public void fff() {
		System.out.println("fff");

	}

}
