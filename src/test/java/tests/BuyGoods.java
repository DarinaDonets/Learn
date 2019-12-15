package tests;

import before.BrowserSettings;
import org.junit.jupiter.api.Test;

public class BuyGoods extends BrowserSettings {

    @Test
    public void buyACar() {
        pageManager.getTopMenuPage().makeSearchFor("Самоскид");
        pageManager.getSearchResultPage().openItem();
        pageManager.getItemPage().clickOnBuyButton();

        pageManager.getCartPage().openCart();
        pageManager.getCartPage().verifyPresenceOfGoods("самоскид");

    }
}
