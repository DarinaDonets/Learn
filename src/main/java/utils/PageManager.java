package utils;

import Pages.*;

public class PageManager {

    private LoginPage loginPage = new LoginPage();
    private TopMenuPage topMenuPage = new TopMenuPage();
    private SearchResultPage searchResultPage = new SearchResultPage();
    private ItemPage itemPage = new ItemPage();
    private CartPage cartPage = new CartPage();

    public SearchResultPage getSearchResultPage() {
        return searchResultPage;
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public TopMenuPage getTopMenuPage() {
        return topMenuPage;
    }

    public ItemPage getItemPage() { return itemPage; }

    public CartPage getCartPage() { return cartPage; }

}
