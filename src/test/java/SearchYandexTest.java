import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class SearchYandexTest {
    @Test
    void successfulSearchTest() {
        open("https://ya.ru/");
        $("[name=text]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://selenide.org"));
        sleep(5000);
    }
}
