package tarefas;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjects.PageUsuario;

public class UsuarioTarefa {
	private PageUsuario user;
	
	public UsuarioTarefa(WebDriver driver){
		this.user = new PageUsuario(driver);
	}
	public void novaConta(String email) {
		this.user.emailUsuario().sendKeys(email);
		this.user.criarUmaConta().click();
	}
	public void informacoesPessoais(String primeiroNome, String ultimoNome, String senha, String endereco, String cidade, String cep, String celular) {
		this.user.titulo().click();
		this.user.primeiroNome().sendKeys(primeiroNome);
		this.user.ultimoNome().sendKeys(ultimoNome);
		this.user.senha().sendKeys(senha);
		this.user.dia().sendKeys(Keys.ARROW_DOWN);
		this.user.dia().sendKeys(Keys.ENTER);
		this.user.mes().sendKeys(Keys.ARROW_DOWN);
		this.user.mes().sendKeys(Keys.ENTER);
		this.user.ano().sendKeys(Keys.ARROW_DOWN);
		this.user.ano().sendKeys(Keys.ENTER);
		this.user.endereco().sendKeys(endereco);
		this.user.cidade().sendKeys(cidade);
		this.user.estado().sendKeys(Keys.ARROW_DOWN);
		this.user.estado().sendKeys(Keys.ENTER);
		this.user.cep().sendKeys(cep);
		this.user.pais().sendKeys(Keys.ARROW_DOWN);
		this.user.pais().sendKeys(Keys.ENTER);
		this.user.celular().sendKeys(celular);
	}
	public void criarConta() {
		this.user.criarConta().click();
	}
}