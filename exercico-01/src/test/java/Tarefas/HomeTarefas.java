package Tarefas;

import PageObjects.PaginaHome;
import org.openqa.selenium.WebDriver;

public class HomeTarefas {

    private static WebDriver driver;
    private static PaginaHome homePage;

    public HomeTarefas(WebDriver driver){

        this.driver = driver;
        homePage = new PaginaHome(this.driver);
    }

    public void selecionaProduto(){

        homePage.pegaLinkImagemDoProduto().click();
    }

    public void selecionaVariosProdutos(){

    }

}
