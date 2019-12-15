package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TopMenuPage {

    private SelenideElement searchInput = $x("//input[@name='search']");
    private SelenideElement submitButton = $x("//button[contains(@class, 'search') and contains(@class,'submit')] | //button[contains(@class,'search-button')]");

    public void makeSearchFor(String value) {
        searchInput.setValue(value);
    }

    public void submitSearch() {
        submitButton.should(Condition.appear).click();

    }
}
