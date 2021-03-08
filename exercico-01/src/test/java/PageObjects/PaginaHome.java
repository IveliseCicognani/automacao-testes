package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaHome {

    private WebDriver driver;

    public PaginaHome(WebDriver driver){
        this.driver =  driver;

    }
    public WebElement pegaLinkImagemDoProduto(){
        return driver.findElement(By.id("item_4_title_link"));
    }
}
