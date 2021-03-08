package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilitarios.Waits;

public class PagePagamento {
	private WebDriver driver;
	 private Waits waits;
	
	public PagePagamento(WebDriver driver) {
		this.driver = driver;
		 waits = new Waits(driver);
	}
	public WebElement pagarTransferenciaBancaria() {
		return waits.visibilidadeDoElemento(By.className("payment_module"));
	}
	public WebElement continuar() {
		return waits.visibilidadeDoElemento(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
	}
}