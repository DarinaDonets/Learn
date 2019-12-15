package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.LinkedList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ItemPage {

    private SelenideElement buyButton = $x("//div[contains (@class, 'g-buy')]");
    private SelenideElement specificationsButton = $x("//a[@class='nav-tabs-link novisited ng-star-inserted']");
    List<String> specifications = new LinkedList<String>();

    public void clickOnBuyButton() {
        buyButton.should(Condition.appear).click();
    }

    public void seeSpecificationsOfGoods() { specificationsButton.should(Condition.appear).click(); }

    public void getAllSpecifications() {
        List<String> allSpecificationOfGoods = $$x("//tr[@class='ng-star-inserted']").texts();
        assertThat(allSpecificationOfGoods).containsAll(specifications);
        System.out.println(allSpecificationOfGoods);
    }

}
