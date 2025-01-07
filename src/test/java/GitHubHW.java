import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

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

    @org.junit.jupiter.api.Test
    void fillFormTest() {
        open("");
        // Ожидаем, что кнопка "Solutions" будет видна перед кликом
        $(byText("Solutions")).shouldBe(visible).click();

        // Ожидаем, что кнопка "Enterprises" будет видна перед кликом
        $(byText("Enterprises")).shouldBe(visible).click();

        // Ожидаем, что элемент с id "hero-section-brand-heading" будет видим
        $("#hero-section-brand-heading").shouldBe(visible).hover();

        // Ожидаем, что текст элемента соответствует ожидаемому
        $("#hero-section-brand-heading").shouldHave(Condition.text("The AI-powered\n developer platform"));
    }
}
