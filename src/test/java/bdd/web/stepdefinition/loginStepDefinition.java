package bdd.web.stepdefinition;

import bdd.web.hooks.Hooks;
import bdd.web.step.loginbankSteps;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class loginStepDefinition {

    private WebDriver driver;
    private loginbankSteps steps;

    public loginStepDefinition() {
        this.driver = Hooks.getDriver();
        this.steps = new loginbankSteps(driver);
    }

    @Given("empieza a navegar por www.parabank.com")
    public void navegar_parabank() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("el usuario ingresa a su cuenta de usuario")
    public void login_usuario() throws InterruptedException {
        steps.login();
    }

    @When("el usuario selecciona Register")
    public void seleccionar_register() {
        steps.irARegister();
    }

    @And("completa los campos solicitados")
    public void completar_formulario() {
        steps.registrarUsuario();
    }

    @And("clickea el botón Register")
    public void click_register() {
        steps.confirmarRegistro();
    }

    @Then("el sistema muestra el mensaje {string}")
    public void validar_mensaje(String mensaje) {
        Assert.assertTrue(steps.validarMensaje(mensaje));
    }

    @When("selecciona {string}")
    public void seleccionar_opcion(String opcion) {
        steps.seleccionarOpcion(opcion);
    }

    @And("selecciona el tipo de cuenta que desea")
    public void seleccionar_tipo_cuenta() {
        steps.seleccionarTipoCuenta();
    }

    @And("clickea el boton {string}")
    public void click_boton(String boton) {
        steps.clickBoton(boton);
    }

    @And("clickea el boton 'Accounts Overview'")
    public void click_accounts_overview() {
        steps.accountsOverview();
    }
}
