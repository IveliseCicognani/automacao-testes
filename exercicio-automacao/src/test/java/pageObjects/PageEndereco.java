package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilitarios.Waits;

public class PageEndereco {
	private WebDriver driver;
	private Waits waits;
	
	public PageEndereco(WebDriver driver) {
		this.driver = driver;
		 waits = new Waits(driver);
	}
	public WebElement continuar() {
		return waits.visibilidadeDoElemento(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
	}
}