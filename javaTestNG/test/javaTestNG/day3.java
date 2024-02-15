package javaTestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {
	
@BeforeClass
public void beforeClass() {
	System.out.println("i will execute before class");
	
}

	
	@Test(groups= {"smoke"})
	public void webLoginCarLoad() {
		System.out.println("web");
		
	}
	
	@Test
	public void mobileSignInCarLoad() {
		System.out.println("mobileSignIn");
		
	}
	
	@Test
	public void mobileSignOutCarLoad() {
		System.out.println("mobileSignOut");
		
	}
	
	@Test
	public void mobileLoginCarLoad() {
		System.out.println("mobileLogin");
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("i will execute before class");
		
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("i will execute in every method in page 3");
	}
	
	@Test
	public void APILoginCarLoad() {
		System.out.println("API");
		
	}

}
