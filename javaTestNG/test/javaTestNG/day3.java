package javaTestNG;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
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
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("i will execute in every method in page 3");
	}
	
	@Test
	public void APILoginCarLoad() {
		System.out.println("API");
		
	}

}
