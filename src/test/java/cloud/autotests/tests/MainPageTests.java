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

    @Test
    @Owner("IgorK")
    @Description("Check forgot Password")
    @DisplayName("Citibank main page, forgot Password")
    @Tag("cititest")
    void forgotpasswordTest() {
        step("Open https://www.citi.com/", () -> {
            open("https://www.citi.com/");
        });
        sleep(5000);
        step("Click on Forgot Password", () -> {
            $(".col-xs-6.readLine", 3).click();
        });

        step("Verifying Primary Account Holder’s information should be visible", () -> {
            $("#maincontent").shouldHave(text("Select one of the following and use the Primary Account Holder’s information to finish verifying your identity."));
        });
    }
}