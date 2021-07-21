import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideWiki {
    // Comment HW8

    @Test
    void softAssertionsLinkTest() {
        open("https://github.com/selenide/selenide");
        $("[data-content=Wiki]").click();

        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(byText("SoftAssertions")).click();

        $("[id=wiki-body]").shouldHave(text("Using JUnit5 extend test"));
    }
}
