package tarefas;

import org.openqa.selenium.WebDriver;

import pageObjects.PageEndereco;

public class EnderecoTarefa {
	private PageEndereco address;
	
	public EnderecoTarefa(WebDriver driver){
		this.address = new PageEndereco(driver);
	}
	public void continuar() {
		this.address.continuar().click();
	}
}