package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.RegisterSteps;

public class RegisterStepDefinition {

    RegisterSteps register = new RegisterSteps();

    @And("^Ingreso a la opcion de registro$")
    public void ingresoRegistroStep()
    {
            register.ingresoRegistro();
    }
    @When("^Lleno todo el formulario (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$")
    public void llenoFormularioStep(String fname, String lname,String address, String city, String state, String zcode, String pnumber, String ssn, String user, String pass){
            register.rellenoFormulario(fname,lname,address,city,state, zcode, pnumber,ssn,user,pass);
    }
    @Then("^Valido mensaje de confirmacion$")
    public void validoConfirmacionStep(){
            register.validoMensaje();
    }

}
