package before;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import utils.PageManager;

import static com.codeborne.selenide.Selenide.open;

public class BrowserSettings {

    public PageManager pageManager;

    @BeforeEach
    public void makeLogIn() {
        pageManager = new PageManager();

        Configuration.baseUrl = "https://rozetka.com.ua";
        Configuration.browser = "chrome";
        Configuration.screenshots = false;
        open("");
        pageManager.getLoginPage().makeLogin();
    }


}
