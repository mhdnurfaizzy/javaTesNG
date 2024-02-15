package javaTestNG;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	@Parameters({"URL", "API"})
	@Test(groups= {"smoke"})
	public void login(String urlName, String key) {
		System.out.println(urlName);
		System.out.println(key);
		
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
