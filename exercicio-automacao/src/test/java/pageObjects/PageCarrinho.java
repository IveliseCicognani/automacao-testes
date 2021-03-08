package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilitarios.Waits;

public class PageCarrinho {
	private WebDriver driver;
	private Waits waits;

	public PageCarrinho(WebDriver driver) {
		this.driver = driver;
		waits = new Waits(driver);
	}	
	public WebElement adicionarAoCarrinho() {
		this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]")).click();
		return this.driver.findElement(By.id("add_to_cart"));
	}
	public WebElement total() {
		return waits.visibilidadeDoElemento((By.id("total_price")));
	}
	public WebElement seguirParaCheckout() {
		return waits.visibilidadeDoElemento(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a"));
		
	}
	public WebElement validaNomeProduto() {
		return waits.visibilidadeDoElemento(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/h1"));
	}
	public WebElement prosseguirResumoDasCompras() {
		return waits.visibilidadeDoElemento(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]"));
	}
}