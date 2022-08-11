package rozetka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//li[contains(@class,'item--user')]//button[contains(@class,'header__button')]")
    private WebElement loginButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void moveToLoginPage() {
        loginButton.click();
    }

}