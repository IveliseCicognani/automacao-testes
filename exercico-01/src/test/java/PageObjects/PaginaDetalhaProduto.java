package PageObjects;

import Utilitarios.Esperas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaDetalhaProduto {

    private WebDriver driver;
    private Esperas espera;

    public  PaginaDetalhaProduto(WebDriver driver){
        this.driver = driver;
        this.espera = new Esperas(driver);

    }

    public WebElement pegaBotaoAdicionarCarrinho(){
        return espera.esperaVisibilidadeDoElementoMapeado(By.cssSelector("shopping_cart_link.fa-layers.fa-fw"));
    }
}
