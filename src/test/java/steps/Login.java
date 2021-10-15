package steps;

import static methods.ActionElement.*;
import cucumber.api.java.en.*;
import elements.PageCart;
import elements.PageInventory;
import elements.PageLogin;
import org.openqa.selenium.WebDriver;

public class Login {

    public static WebDriver driver = Hooks.driver;

    @Given("^Login with user \"(.*)\", pass \"(.*)\"")
    public void login(final String user, final String pass) throws Exception{
        typeText(PageLogin.USER_NAME, user);
        typeText(PageLogin.PASSWORD, pass);
        clickElement(PageLogin.BTN_LOGIN);
    }

    @When("^Add to cart item")
    public void addItemToCart() throws Exception{
        clickElement(PageInventory.BTN_ADD_CART);
        clickElement(PageInventory.CART);
    }

    @When("^Checkout and finish buy")
    public void checkoutAndFinish() throws Exception{
        clickElement(PageCart.CHECKOUT_CART);
        typeText(PageCart.FIRST_NAME,"Rene");
        typeText(PageCart.LAST_NAME,"Montilla");
        typeText(PageCart.ZIP_CODE,"1020");
        clickElement(PageCart.BTN_SUBMIT);
        clickElement(PageCart.BTN_FINISH);
    }

}
