package bdd.web.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private WebDriver driver;

    private By registerLink = By.linkText("Register");
    private By firstName = By.id("customer.firstName");
    private By lastName = By.id("customer.lastName");
    private By address = By.id("customer.address.street");
    private By city = By.id("customer.address.city");
    private By state = By.id("customer.address.state");
    private By zip = By.id("customer.address.zipCode");
    private By phone = By.id("customer.phoneNumber");
    private By ssn = By.id("customer.ssn");
    private By username = By.id("customer.username");
    private By password = By.id("customer.password");
    private By confirm = By.id("repeatedPassword");
    private By registerBtn = By.cssSelector("input[value='Register']");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRegisterLink() {
        driver.findElement(registerLink).click();
    }

    public void fillRegistrationForm() {
        driver.findElement(firstName).sendKeys("Test");
        driver.findElement(lastName).sendKeys("User");
        driver.findElement(address).sendKeys("Street 123");
        driver.findElement(city).sendKeys("Lima");
        driver.findElement(state).sendKeys("PE");
        driver.findElement(zip).sendKeys("00001");
        driver.findElement(phone).sendKeys("999999999");
        driver.findElement(ssn).sendKeys("123");
        driver.findElement(username).sendKeys("user" + System.currentTimeMillis());
        driver.findElement(password).sendKeys("pass");
        driver.findElement(confirm).sendKeys("pass");
    }

    public void submit() {
        driver.findElement(registerBtn).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
