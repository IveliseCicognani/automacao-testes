package tarefas;

import org.openqa.selenium.WebDriver;

import pageObjects.PagePagamento;

public class PagamentoTarefa {
	private PagePagamento payment;
	
	public PagamentoTarefa(WebDriver driver){
		this.payment = new PagePagamento(driver);
	}
	public void pagarTransferenciaBancaria() {
		this.payment.pagarTransferenciaBancaria().click();
	}
	public void continuar() {
		this.payment.continuar().click();
	}
}