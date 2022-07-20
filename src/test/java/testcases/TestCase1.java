package testcases;

import org.testng.annotations.Test;

public class TestCase1 {

	@Test
	public void setup() {
		System.out.println("This is Setup Test...");
	}
	@Test
	public void login() {
		System.out.println("This is login Test...");
	}
	
	@Test
	public void teardown() {
		System.out.println("This is teardown Test...");
	}
	
	
}
