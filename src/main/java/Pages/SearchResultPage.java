package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class SearchResultPage {


    private SelenideElement openGoods = $x("//div[@data-view_type='catalog_with_hover']//img | //div[@name='catalog_item_block']//img");

    public void openItem() {
        openGoods.should(Condition.appear).click();
    }

    public void verifyPresenceOfTitle(String title) {
        $x(format("//h1[contains(text(),'%s')]", title)).should(Condition.appear);
    }

    public void searchLeftSideMenu(String category, String subCategory) {
        $x(format("//a[@class='menu-categories__link' and contains(text(),'%s')]", category)).should(Condition.appear).hover();
        $x(format("//a[@class='menu__link' and contains(text(),'%s')]", subCategory)).should(Condition.appear).click();
    }

    public void openSubCategoryOfGoods() {
        $x("//a[@class='m-cat-l-i-title-link']").should(Condition.appear).click();
    }

    public void searchAfterAddingGoodsToCart() {
        $x("//button[@type='button']").should(Condition.appear).click();
    }
}
