import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubHW {
    @BeforeAll
    static void setup() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com/";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
     void fillFormTest() {
        open("");
        $(byText("Solutions")).shouldBe(visible).click();
        $(byText("Enterprises")).shouldBe(visible).click();
        $("#hero-section-brand-heading").shouldBe(visible).hover();
        $("#hero-section-brand-heading").shouldHave(Condition.text("The AI-powered\n developer platform"));
    }
}
