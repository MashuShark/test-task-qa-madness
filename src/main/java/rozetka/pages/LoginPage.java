package rozetka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//div[@class='modal__content']")
    private WebElement loginWindow;
    @FindBy(xpath = "//button[contains(text(),'Google')]")
    private WebElement googleButton;
    @FindBy(xpath = "//input[@type='email']")
    private WebElement inputEmailField;
    @FindBy(xpath = "//p[@class='error-message ng-star-inserted']")
    private WebElement errorMassageInvalidEmail;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement inputPasswordField;
    @FindBy(xpath = "//label[contains(@class,'remember-checkbox')]")
    private WebElement rememberCheckbox;
    @FindBy(xpath = "//button[contains(text(),'Увійти')]")
    private WebElement loginButton;
    @FindBy(xpath = "//button[contains(text(),'Зареєструватися')]")
    private WebElement registerButton;
    @FindBy(xpath = "//a[contains(text(),'Нагадати пароль')]")
    private WebElement remindPasswordButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getGoogleButton() {
        return googleButton;
    }

    public WebElement getLoginWindow() {
        return loginWindow;
    }

    public WebElement getInputEmailField() {
        return inputEmailField;
    }

    public WebElement getErrorMassageInvalidEmail() {
        return errorMassageInvalidEmail;
    }

    public WebElement getInputPasswordField() {
        return inputPasswordField;
    }

    public WebElement getRememberCheckbox() {
        return rememberCheckbox;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getRemindPasswordButton() {
        return remindPasswordButton;
    }
}