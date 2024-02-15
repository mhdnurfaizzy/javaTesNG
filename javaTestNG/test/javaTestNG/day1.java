package javaTestNG;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@Test(groups= {"smoke"})
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
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("I am 1 from the last");
	}

}
