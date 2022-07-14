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
    @Description("Open new account, check where do you live should be visible")
    @DisplayName("Citibank main page, open new account, zip code question")
    @Tag("cititest")
    void zipcodeTest() {
        step("Open https://www.citi.com/", () -> {
            open("https://www.citi.com/");
        });
        sleep(5000);
        step("Click on Open an Account", () -> {
            $("#navOpenAccmainAnchor8").click();
        });

        step("Where Do You Live? should be visible", () -> {
            $(".zipcode-h2").shouldHave(text("Where Do You Live?"));
        });
    }

    @Test
    @Owner("IgorK")
    @Description("Check eng language communication")
    @DisplayName("Citibank main page, Important Information eng language")
    @Tag("cititest")
    void languageTest() {
        step("Open https://www.citi.com/", () -> {
            open("https://www.citi.com/");
        });
        sleep(5000);
        step("Click on Espanol worldwide icon", () -> {
            $("#langBtn").click();
        });

        step("Important Information should be visible", () -> {
            $(".modal-body").shouldHave(text("Important Information"));
        });
    }
    @Test
    @Owner("IgorK")
    @Description("Check reg account")
    @DisplayName("Citibank main page, register account")
    @Tag("cititest")
    void registerTest() {
        step("Open https://www.citi.com/", () -> {
            open("https://www.citi.com/");
        });
        step("Click on Register new account", () -> {
            $(".col-xs-6.anchor-container").click();
        });

        step("Setup access should be visible", () -> {
            $("#maincontent").shouldHave(text("You can view or manage your account online in just a few easy steps. Let’s get started!"));
        });
    }

    @Test
    @Owner("IgorK")
    @Description("Check forgot User ID")
    @DisplayName("Citibank main page, forgot User ID")
    @Tag("cititest")
    void forgotuseridTest() {
        step("Open https://www.citi.com/", () -> {
            open("https://www.citi.com/");
        });
        step("Click on Forgot User ID", () -> {
            $(".col-xs-6.readLine", 1).click();
        });

        step("Verifying Primary Account Holder’s information should be visible", () -> {
            $(".ng-tns-c200-0").shouldHave(text("Select one of the following and use the Primary Account Holder’s information to finish verifying your identity."));
        });
    }

}