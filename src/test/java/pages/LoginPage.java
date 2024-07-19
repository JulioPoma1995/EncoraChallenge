package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends BasePage{

    public String inptUser = "username";
    public String inptPass = "password";
    public String btnLogin = "//*[@id='loginPanel']/form/div[3]/input";
    public String btnLogOut = "//*[@id='leftPanel']/ul/li[8]/a";

public LoginPage(){
    super(driver);
}
    public void ingresoParabank() {
        navigateTo("https://parabank.parasoft.com/parabank/index.htm");
    }

    public void loginParabank(String user, String pass){

    try {
        driver.findElement(By.xpath(btnLogOut)).click();
        driver.findElement(By.name(inptUser)).sendKeys(user);
        driver.findElement(By.name(inptPass)).sendKeys(pass);
        driver.findElement(By.xpath(btnLogin)).click();

    }catch (Exception e){
        System.out.print("No se encontró un elemento");
    }
    }

}
