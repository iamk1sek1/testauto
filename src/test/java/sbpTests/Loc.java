package sbpTests;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Loc {
    public final static SelenideElement logoImg = $x("//*[@id='logo']");
    public static final SelenideElement logInButton = $x("//button[@id='login-button']");
    public static final SelenideElement userNameInput = $x("//input[@name='username']");
    public static final SelenideElement passwordInput = $x("//input[@name='password']");
    public static final SelenideElement smsInput = $x("//input[@id='otp-code']");
    public static final SelenideElement codeButton = $x("//button[@id='login-otp-button']");
    public final static String baseUrl = "https://idemo.bspb.ru/";
    public final SelenideElement appName = $x("//div[@class='environment print-hidden']");

    public static final SelenideElement curAva = $x("//a[@id='user-avatar']");
    public static final SelenideElement newAva = $x("//div[@id='avatars']//img[@data-avatar='3.png']");
    public static final SelenideElement labelAva = $x("//div[@id='avatars-form']/label");
    public static final SelenideElement buttonAva = $x("//button[@id='submit-button']");
    public static final SelenideElement labeAllert = $x("//div[@class='alert alert-error']");
    public static final SelenideElement labelKart = $x("//li[@id='cards']");
    public static final SelenideElement labelCardblock = $x("//a[@class='card-block']");
    public static final SelenideElement buttonBlock = $x("//button[@id='block-card']");
    public static final SelenideElement buttonBlockVer = $x("//button[@id='confirm']");
    public static final SelenideElement smsBlock = $x("//input[@type='tel']");//button[@id="confirm"]
    public static final SelenideElement buttonlCardunblock = $x("//a[@class='card-unblock']");
}
