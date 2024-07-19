package steps;

import pages.RegisterPage;

public class RegisterSteps {
    RegisterPage register = new RegisterPage();

    public void ingresoRegistro(){
        register.ingresoRegistro();
    }

    public void rellenoFormulario(String fname,String lname, String address, String city, String state, String zcode, String number, String ssn, String user, String pass){
        register.completoFormulario(fname,lname,address, city,state,zcode, number, ssn, user, pass);
    }

    public void validoMensaje(){
        register.validaMensajeConfirmacion();
    }
}
