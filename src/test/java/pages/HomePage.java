package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[6]")
    WebElement bookStoreApplicationButton;

    @FindBy(id = "login")
    WebElement loginButton;

    public void goFromHomePageToLogin() {
        scrollDown();
        bookStoreApplicationButton.click();
        loginButton.click();
    }

    private void scrollDown() {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
    }
}
