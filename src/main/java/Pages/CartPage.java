package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class CartPage {

    private String popUpCore = "//*[contains(@class,'cart-content')]";

    private SelenideElement cartButton = $x("//a[contains (@class, 'button_type_cart')]");
    private SelenideElement plusIcon = $x("//*[@icon='plus']/parent::button");
    private SelenideElement minusIcon = $x("//*[@icon='minus']/parent::button");
    private SelenideElement closeIcon = $x("//a[@class='rz-popup-close']");


    public void openCart() {
        cartButton.should(Condition.appear).click();
    }

    public void addPlusOneMoreChoosenGoods() {
        plusIcon.should(Condition.appear).click();
    }

    public void minusOneChoosenGoods() {
        minusIcon.should(Condition.appear).click();
    }

    public void verifyPresenceOfGoods(String title) {
        $x(format("%s//a[contains(text(),'%s')]", popUpCore, title)).should(Condition.appear);
    }

    public void closeCart() {
        closeIcon.click();
    }
}
