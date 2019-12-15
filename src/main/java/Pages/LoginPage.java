package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private SelenideElement mailField = $x("//input[@id='auth_email']");
    private SelenideElement passField = $x("//input[@id='auth_pass']");
    private SelenideElement logInButton = $x("//button[contains(@class, 'login-button')]");
    private SelenideElement personalAreaField = $x("//p[@class='header-topline__user-text']");



    public void makeLogin() {
        personalAreaField.should(Condition.appear).click();
        mailField.should(Condition.appear).setValue("darinka95@ukr.net");
        passField.setValue("Lollipop666");
        logInButton.click();
    }



}
