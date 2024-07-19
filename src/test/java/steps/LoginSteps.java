package steps;

import pages.LoginPage;

public class LoginSteps {

    LoginPage login = new LoginPage();

    public void ingresoParabank(){
        login.ingresoParabank();
    }

    public void loginParabank(String user, String pass){
        login.ingresoParabank();
        login.loginParabank(user, pass);
    }
}
