package methods;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ActionElement {

    public static WebDriver driver;


    public static void implicitWaitVisible() {
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.err.println("Message: " + e.getMessage());
        }
    }

    public static void explicitWait(By locator) throws Exception{
        try{
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        }catch (Exception e){
            System.out.println("Message error: " + e.getMessage());
            throw new RuntimeException("Element no clickable", e);


        }

    }

    public static void clickElement(By locator) throws Exception{

        try{
            explicitWait(locator);
            driver.findElement(locator).click();
        }catch (Exception e){
            System.out.println("Message error: " + e.getMessage());
            throw new RuntimeException("Element no clickable", e);
        }

    }

    public static void typeText(By locator, String text) throws Exception{

        try{
            explicitWait(locator);
            WebElement element = driver.findElement(locator);
            element.clear();
            element.sendKeys(text);
        }catch (Exception e){
            System.out.println("Message error: " + e.getMessage());
            throw new RuntimeException("Could not write to item", e);
        }

    }

    public static void screenShot(String NombreSC) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("src/test/java/screenShots/" + NombreSC + System.currentTimeMillis() + ".png"));
    }

}
