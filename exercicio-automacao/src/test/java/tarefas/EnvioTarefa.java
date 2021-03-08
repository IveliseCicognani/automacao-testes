package tarefas;

import org.openqa.selenium.WebDriver;

import pageObjects.PageEnvio;

public class EnvioTarefa {
	private PageEnvio shipping;
	
	public EnvioTarefa(WebDriver driver){
		this.shipping = new PageEnvio(driver);
	}
	public void concordarComTermos() {
		this.shipping.check().click();
	}
	public void continuar() {
		this.shipping.continuar().click();
	}
}