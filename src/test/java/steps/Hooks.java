package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import methods.ActionElement;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void beforeScenario(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        ActionElement.driver = driver;

    }

    @After
    public void afterScenario(){
        driver.quit();
    }



}
