package javaTestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {
	
	@Test
	public void doThis() {
		System.out.println("run me");
	}
	
	@BeforeMethod
	public void runFirst() {
		System.out.println("i will run first");
	}

}
