import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideGoogle {

    @Test
    public void test(){
        Configuration.browser = "chrome";
        Configuration.headless=true;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        open("http://google.com");
        $(By.name("q")).val("selenide").pressEnter();
        $("#ires .g").shouldHave(text("selenide.org"));
        }

}
