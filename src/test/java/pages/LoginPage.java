package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login")
    WebElement logIn;

    public ProfilePage login(String login, String pswrd) {
        type(userName, login);
        type (password, pswrd);
        logIn.click();
        return new ProfilePage(driver);
    }


}
