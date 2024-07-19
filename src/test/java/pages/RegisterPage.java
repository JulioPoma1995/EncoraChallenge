package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    private String btnRegister = "//*[@id='loginPanel']/p[2]/a";
    private String inptFName = "customer.firstName";

    private String inptLName = "customer.lastName";

    private String inptAdd = "customer.address.street";

    private String inptCity = "customer.address.city";

    private String inptState = "customer.address.state";

    private String inptZCode = "customer.address.zipCode";

    private String inptNumber = "customer.phoneNumber";

    private String inptSsn = "customer.ssn";

    private String inptUser = "customer.username";

    private String inptPass = "customer.password";

    private String inptPassRpt = "repeatedPassword";

    private String btnRegiForm = "//*[@id='customerForm']/table/tbody/tr[13]/td[2]/input";

    private String message = "//*[@id='rightPanel']/p";

    public RegisterPage(){
        super(driver);
    }

    public void ingresoRegistro(){
       try {
           driver.findElement(By.xpath(btnRegister)).click();
       }catch (Exception e){
           System.out.print("No se encontró el elemento");
           e.printStackTrace();
       }
    }

    public void completoFormulario(String fname, String lname, String address, String city, String state, String zcode, String pnumber, String ssn, String user, String pass){
        try {
            driver.findElement(By.id(inptFName)).sendKeys(fname);
            driver.findElement(By.id(inptLName)).sendKeys(lname);
            driver.findElement(By.id(inptAdd)).sendKeys(address);
            driver.findElement(By.id(inptCity)).sendKeys(city);
            driver.findElement(By.id(inptState)).sendKeys(state);
            driver.findElement(By.id(inptZCode)).sendKeys(zcode);
            driver.findElement(By.id(inptNumber)).sendKeys(pnumber);
            driver.findElement(By.id(inptSsn)).sendKeys(ssn);
            driver.findElement(By.id(inptUser)).sendKeys(user);
            driver.findElement(By.id(inptPass)).sendKeys(pass);
            driver.findElement(By.id(inptPassRpt)).sendKeys(pass);
            driver.findElement(By.xpath(btnRegiForm)).click();

        }catch (Exception e){
            System.out.print("No se encontró un elemento");
            e.printStackTrace();
        }
    }

    public void validaMensajeConfirmacion(){
    String mensaje = "";
        mensaje = driver.findElement(By.xpath(message)).getText();
        Assert.assertEquals("Your account was created successfully. You are now logged in.", mensaje);

    }


}
