import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void successfulSearchTestYahoo() {
        open("https://search.yahoo.com/");
        $("[name=p]").setValue("selenide").pressEnter();
        $("[id=results]").shouldHave(text("road to conflict"));
    }


    @Test
    void successfulSearchTestYandex() {
        open("https://www.ya.ru/");
        $("[name=text]").setValue("selenide").pressEnter();
        $("[id=search-result]").shouldHave(text("selenide"));
    }
    
    @Test
    void successfulSearchTestGoogle() {
        open("https://www.google.com/");
        $("[name=text1]").setValue("selenide").pressEnter();
        $("[id=search-results]").shouldHave(text("selenide"));
    }
}
