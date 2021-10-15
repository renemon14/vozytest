package elements;

import org.openqa.selenium.By;

public class PageCart {

    public static final By CHECKOUT_CART = By.name("checkout");
    public static final By FIRST_NAME = By.cssSelector("input#first-name");
    public static final By LAST_NAME = By.xpath("//input[@id='last-name']");
    public static final By ZIP_CODE = By.id("postal-code");
    public static final By BTN_SUBMIT = By.cssSelector("input.submit-button");
    public static final By BTN_FINISH= By.cssSelector("button#finish");
}
