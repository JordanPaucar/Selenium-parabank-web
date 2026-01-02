package bdd.web.step;

import bdd.web.page.AccountPage;
import bdd.web.page.LoginPage;
import bdd.web.page.RegisterPage;
import org.openqa.selenium.WebDriver;

public class loginbankSteps {

    private LoginPage loginPage;
    private RegisterPage registerPage;
    private AccountPage accountPage;

    public loginbankSteps(WebDriver driver) {
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
        accountPage = new AccountPage(driver);
    }

    public void login() throws InterruptedException {
        loginPage.login("user", "pass");

    }

    public void irARegister() {
        registerPage.clickRegisterLink();
    }

    public void registrarUsuario() {
        registerPage.fillRegistrationForm();
    }

    public void confirmarRegistro() {
        registerPage.submit();
    }

    public boolean validarMensaje(String mensaje) {
        return accountPage.getConfirmationMessage().contains(mensaje);
    }

    public void seleccionarOpcion(String opcion) {
        accountPage.selectMenu(opcion);
    }

    public void seleccionarTipoCuenta() {
        accountPage.selectAccountType();
    }

    public void clickBoton(String boton) {
        accountPage.clickButton(boton);
    }

    public void accountsOverview() {
        accountPage.accountsOverview();
    }
}