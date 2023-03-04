package sbpTests;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class BaseSteps {

@Step
    static void Authorisation(){
    Loc.userNameInput.shouldBe(visible).val("demo");
    Loc.passwordInput.shouldBe(visible).val("demo");
    Loc.logInButton.shouldBe(visible).click();
    Loc.smsInput.shouldBe(visible).val("0000");
    Loc.codeButton.shouldBe(visible).click();
}
    @Step
    static void setAv(){
        Loc.curAva.click();
        switchTo().frame($x("(//div[@id='contentbar']/iframe)"));
        Loc.labelAva.shouldBe(visible);
        Loc.newAva.click();
        Loc.labelAva.click();
        Loc.buttonAva.click();
        Loc.labeAllert.shouldBe(visible);
    }
    @Step
    static void ban() {
        Loc.labelKart.click();
        Loc.labelCardblock.click();
        Loc.buttonBlock.click();
        switchTo().frame($x("//iframe[@id='confirmation-frame']"));
        Loc.smsBlock.shouldBe(visible).val("0000");
        Loc.buttonBlockVer.click();
        Loc.buttonlCardunblock.click();
        switchTo().frame($x("//iframe[@id='confirmation-frame']"));
        Loc.buttonBlockVer.click();
    }
}

