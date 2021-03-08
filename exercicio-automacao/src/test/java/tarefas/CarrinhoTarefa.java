package tarefas;

import org.openqa.selenium.WebDriver;

import pageObjects.PageCarrinho;

public class CarrinhoTarefa {
	private PageCarrinho product;
	
	public CarrinhoTarefa(WebDriver driver){
		this.product = new PageCarrinho(driver);
	}
	public void adicionarProdutoAoCarrinho() {
		product.adicionarAoCarrinho().click();
	}
	public String total() {
		return product.total().getText();//$18.51
	}
	public void finalizar() {
		product.seguirParaCheckout().click();
	}
	public void resumoCompra() {
		product.prosseguirResumoDasCompras().click();
	}
	public String nomeProduto() {
		return product.validaNomeProduto().getText();
	}
}