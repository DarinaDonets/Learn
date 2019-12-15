package tests;

import before.BrowserSettings;
import org.junit.jupiter.api.Test;

public class SearchTests extends BrowserSettings {


    @Test
    public void searchForCar() {
        pageManager.getTopMenuPage().makeSearchFor("Машинка");
        pageManager.getSearchResultPage().verifyPresenceOfTitle("Машинки, моделі техніки та зброя");
    }

    @Test
    public void searchForDog() {
        pageManager.getTopMenuPage().makeSearchFor("собака");
        pageManager.getSearchResultPage().verifyPresenceOfTitle("бла бла");
    }

    @Test
    public void searchWithLeftSideMenu() {
        pageManager.getSearchResultPage().searchLeftSideMenu("Товары для дома", "Подушки");
        pageManager.getSearchResultPage().openSubCategoryOfGoods();
        pageManager.getSearchResultPage().verifyPresenceOfTitle("Подушки");
    }


}



