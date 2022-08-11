package rozetkaTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LoginTest extends BaseTest {

    @Test
    public void checkThatSingleSignOnViaGoogleIsPresented() {
        getHomePage().moveToLoginPage();
        getLoginPage().waitVisibilityOfElement(60, getLoginPage().getLoginWindow());
        Assert.assertTrue(getLoginPage().getGoogleButton().isDisplayed(),
                "The single sign-on via Google button isn't present");
    }

    @Test(dataProvider = "generateInvalidEmail")
    public void checkThatErrorMessageIsDisplayedIfInvalidEmailIsEntered(String value) {
        getHomePage().moveToLoginPage();
        getLoginPage().waitVisibilityOfElement(60, getLoginPage().getLoginWindow());
        getLoginPage().fillInField(getLoginPage().getInputEmailField(), value);
        Assert.assertTrue(getLoginPage().getErrorMassageInvalidEmail().isDisplayed(),
                "The error massage isn't displayed");
    }

    @DataProvider(name = "generateInvalidEmail")
    public static Object[][] generateInvalidEmail() {
        List<Object[]> testData = new ArrayList<>();
        testData.add(new Object[]{"testgmailcom"});
        testData.add(new Object[]{"testgmail.com"});
        testData.add(new Object[]{"abc#def@mail.com"});
        return testData.toArray(new Object[][]{});
    }

    @Test
    public void checkMainComponentsOnLoginPage() {
        getHomePage().moveToLoginPage();
        getLoginPage().waitVisibilityOfElement(60, getLoginPage().getLoginWindow());
        Assert.assertTrue(getLoginPage().getInputEmailField().isDisplayed(),
                " The email input field isn't presented");
        Assert.assertTrue(getLoginPage().getInputPasswordField().isDisplayed(),
                " The password input field isn't presented");
        Assert.assertTrue(getLoginPage().getRememberCheckbox().isDisplayed(),
                " The remember checkbox input field isn't presented");
        Assert.assertTrue(getLoginPage().getLoginButton().isDisplayed(),
                " The login button input field isn't presented");
        Assert.assertTrue(getLoginPage().getRegisterButton().isDisplayed(),
                " The register button input field isn't presented");
        Assert.assertTrue(getLoginPage().getRemindPasswordButton().isDisplayed(),
                " The remind password button input field isn't presented");
    }
}