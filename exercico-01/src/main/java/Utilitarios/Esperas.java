package Utilitarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Esperas {

//    private WebDriverWait espera;
//
//    public Esperas(WebDriver driver){
//        espera = new WebDriverWait(driver, 28);
//    }
//
//    public WebElement esperaVisibilidadeDoElemento(By by){
//        return espera.until(ExpectedConditions.visibilityOfElementLocated(by));
//    }

    private WebDriver driver;

    public Esperas(WebDriver driver){
        this.driver = driver;
    }

    public WebElement esperaVisibilidadeDoElementoMapeado(By by){
        WebDriverWait espera = new WebDriverWait(driver, 28);
        return espera.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement esperaCarregarElemento(WebElement elemento){
        try{

            return new WebDriverWait(driver, 28).until(ExpectedConditions.visibilityOf(elemento));
        } catch (WebDriverException e){
            return elemento;

        }
    }

}
