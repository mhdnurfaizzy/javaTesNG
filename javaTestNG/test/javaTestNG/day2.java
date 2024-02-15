package javaTestNG;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void demo() {
		System.out.println("demo");
		
	}
	
	@Test(groups= {"smoke"})
	public void demo2() {
		System.out.println("demo2");
		
	}
	
	@BeforeTest
	public void prerequester() {
		System.out.println("I will execute first");
	}

	@BeforeSuite
	public void beforesuite() {
		System.out.println("I am no 1");
	}
}
