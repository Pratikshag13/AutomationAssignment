package assignment.testscripts;

import assignment.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void verifyLogin() throws InterruptedException {
        System.out.println("Inside LoginTest Test: verifyLogin");
        LoginPage obj = new LoginPage();
        obj.loginToApplication(driver);
    }
}
