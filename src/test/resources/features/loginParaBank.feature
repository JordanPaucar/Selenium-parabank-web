#language: en
@GestiónAccountParaBank
Feature: Cuentas de sesión (login) del sitio Parabank

  Background: el usuario ingresa correctamente a la pagina de paraBank
    Given empieza a navegar por www.parabank.com

  @Register
  Scenario: registrar cuenta para inicio de sesion
    When el usuario selecciona Register
    And completa los campos solicitados
    And clickea el botón Register
    Then el sistema muestra el mensaje 'Your account was created successfully. You are now logged in.'

  @login
  Scenario: iniciar sesión para pruebas
    When el usuario ingresa a su cuenta de usuario

  @NewAccount
  Scenario: registrar nueva cuenta bancaria
    When el usuario ingresa a su cuenta de usuario
    And selecciona 'Open New Account'
    And selecciona el tipo de cuenta que desea
    And clickea el boton 'Open new account'
    Then el sistema muestra el mensaje 'Congratulations, your account is now open.'

  @AccountSummary
  Scenario: Validar estado del resumen de cuenta
    When el usuario ingresa a su cuenta de usuario
    And clickea el boton 'Accounts Overview'
    Then el sistema muestra el mensaje '*Balance includes deposits that may be subject to holds'


