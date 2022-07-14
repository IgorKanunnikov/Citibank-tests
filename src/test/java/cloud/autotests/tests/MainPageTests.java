package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class MainPageTests extends TestBase {

    @Tag("cititest")
    @Test
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://habr.com/'", () ->
                open("https://habr.com/"));

        step("Page title should have text 'All posts in a row / Habr'", () -> {
            String expectedTitle = "All posts in a row / Habr";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
}