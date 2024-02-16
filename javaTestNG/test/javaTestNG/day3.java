package javaTestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
	
	@Test(enabled=false) // if want to disable tc
	public void mobileSignInCarLoad() {
		System.out.println("mobileSignIn");
		
	}
	
	@Test(timeOut=4000) //give timeout 4scnd
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
	
	@Test(dataProvider = "getData")
	public void APILoginCarLoad(String username, String password) {
		System.out.println("API");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@DataProvider
	public Object getData() {
		
		Object[][] data = new Object[3][2];
		
		//list set
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		
		//2nd set
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		
		//3nd set
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		return data;
	}

}
