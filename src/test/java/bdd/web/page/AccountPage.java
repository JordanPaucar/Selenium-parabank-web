package bdd.web.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountPage {

    private WebDriver driver;

    private By message = By.id("rightPanel");
    private By accountType = By.id("type");
    private By openAccountBtn = By.cssSelector("input[value='Open New Account']");
    private By accountsOverview = By.linkText("Accounts Overview");

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getConfirmationMessage() {
        return driver.findElement(message).getText();
    }

    public void selectMenu(String option) {
        driver.findElement(By.linkText(option)).click();
    }

    public void selectAccountType() {
        new Select(driver.findElement(accountType)).selectByIndex(1);
    }

    public void clickButton(String name) {
        driver.findElement(By.cssSelector("input[value='" + name + "']")).click();
    }

    public void accountsOverview() {
        driver.findElement(accountsOverview).click();
    }
}
