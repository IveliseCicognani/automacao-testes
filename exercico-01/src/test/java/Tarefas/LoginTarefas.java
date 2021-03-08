package Tarefas;

import PageObjects.PaginaLogin;
import org.openqa.selenium.WebDriver;

public class LoginTarefas {

    private static WebDriver driver;
    private static PaginaLogin login;

    public LoginTarefas(WebDriver driver){
        this.driver = driver;
        login = new PaginaLogin(this.driver);
    }

    public void realizarLogin(){

        login.pegarInputNomeUsuario().sendKeys("standard_user");
        login.pegarInputPassword().sendKeys("secret_sauce");
        login.pegarBotaoLogin().click();
    }
}
