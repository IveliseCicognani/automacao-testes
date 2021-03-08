package utilitarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

    /*  Existem duas formas de montar os waits */

   /* private WebDriverWait waits;

    public Waits(WebDriver driver){

        waits = new WebDriverWait(driver,20);
    }

    public WebElement visibilityOfElement(By by){
        return waits.until(ExpectedConditions.visibilityOfElementLocated(by));
    }*/

    private WebDriver driver;

    public Waits(WebDriver driver){

        this.driver = driver;
    }

    public WebElement visibilidadeDoElemento(By by){

        WebDriverWait waits = new WebDriverWait(driver, 20);

        return waits.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    public  WebElement carregarElemento(WebElement elemento){
        try{

            return new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(elemento));

        }catch (WebDriverException e){

            return elemento;
        }
    }

}

