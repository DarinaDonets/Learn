package tests;

import before.BrowserSettings;
import org.junit.jupiter.api.Test;

public class CheckItemsData extends BrowserSettings {

    //TODO Create more test for items

    @Test
    public void getColourOfGoods() {
        pageManager.getTopMenuPage().makeSearchFor("унітаз");
        pageManager.getTopMenuPage().submitSearch();
        pageManager.getSearchResultPage().openItem();

        pageManager.getItemPage().seeSpecificationsOfGoods();
        pageManager.getItemPage().getAllSpecifications();






    }


}
