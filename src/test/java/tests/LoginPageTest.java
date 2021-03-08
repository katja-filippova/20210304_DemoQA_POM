package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBase {

    @Test
    public void loginPageTest() {
        new HomePage(driver).goFromHomePageToLogin();
        new LoginPage(driver).login("Pam", "Filippova123!")
                .verifyUserName("Pam")
                .logOut();
    }
}
