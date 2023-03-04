package sbpTests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {

    @BeforeAll
    static void before(){
        Configuration.timeout = 3000; // Умное ожидание появление элемента на странице
        Configuration.browserSize = "1920x1080"; // Умно
    };
    @BeforeEach
    void beforeEach() {
        Selenide.open(Loc.baseUrl);
        Loc.logoImg.shouldBe(visible);
        BaseSteps.Authorisation();
    }
    void frameOut(){
        switchTo().defaultContent();
        Loc.logoImg.shouldBe(visible).click();
    }
    @AfterAll
    static void after() {
        closeWebDriver();
    }
}
