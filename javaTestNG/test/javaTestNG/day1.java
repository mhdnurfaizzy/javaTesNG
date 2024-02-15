package javaTestNG;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@Test
	public void login() {
		System.out.println("login");
		
	}
	
	@Test
	public void home() {
		System.out.println("home");
		
	}
	
	@AfterTest
	public void lastexecute() {
		System.out.println("I will execute last");
	}

}
