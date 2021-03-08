package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends PageBase{

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName-value")
    WebElement user;

    @FindBy(id = "submit")
    WebElement logOutButton;

    public ProfilePage verifyUserName (String userName){
        if(user.getText().equalsIgnoreCase(userName)){
            System.out.println("Correct user name is: " + user.getText());
        }else{
            System.out.println("Incorrect user name: " + user.getText());
        }
        return this;
    }

    public LoginPage logOut () {
        logOutButton.click();
        return new LoginPage(driver);
    }
}
