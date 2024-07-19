package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import steps.LoginSteps;

public class LoginStepDefinition {

    LoginSteps login = new LoginSteps();

    @Given("^Accedo a la url de Parabank$")
    public void navegarParabankStep(){
            login.ingresoParabank();
    }

    @And("^Inicio sesion con cuenta (.*),(.*)$")
    public void inicioSesionStep(String user, String pass){
            login.loginParabank(user,pass);
    }


}
