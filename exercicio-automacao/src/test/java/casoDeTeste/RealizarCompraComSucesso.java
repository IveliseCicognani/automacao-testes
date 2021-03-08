package casoDeTeste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import suporte.Relatorio;
import suporte.Screenshot;
import suporte.TestBase;
import tarefas.CarrinhoTarefa;
import tarefas.EnderecoTarefa;
import tarefas.UsuarioTarefa;
import tarefas.PagamentoTarefa;
import tarefas.EnvioTarefa;
//import verificationpoints.verificationPoint;

public class RealizarCompraComSucesso extends TestBase{
	private WebDriver driver = pegarDriver();
	private CarrinhoTarefa add;
	private EnderecoTarefa address;
	private UsuarioTarefa newUser;
	private PagamentoTarefa payment;
	private EnvioTarefa shipping;
	//private verificationPoint verificationPoint;
	
	@Before
	public void configurar() {
		Relatorio.startTest("Teste - Realizar uma compra com sucesso.");
		
		add = new CarrinhoTarefa(driver);
		address = new EnderecoTarefa(driver);
		newUser = new UsuarioTarefa(driver);
		payment = new PagamentoTarefa(driver);
		shipping = new EnvioTarefa(driver);
		
	}
	@Test
	public void realizarCompraEToE() {
		driver.get("http://automationpractice.com/index.php?");
		driver.manage().window().maximize();
		Relatorio.log(Status.INFO, "O website foi carregado.", Screenshot.capture(driver));
		add.adicionarProdutoAoCarrinho();
		String nome = add.nomeProduto();
		add.finalizar();
		String total = add.total();
		add.resumoCompra();
		newUser.novaConta("wwsod@jjj.com");
		String endereco = "nomeee ruaaa, 2222";
		String cidade = "Porto Alegre";
		newUser.informacoesPessoais("aaaa", "oooo", "password", endereco, cidade, "14785", "1234568521");
		newUser.criarConta();
		address.continuar();
		shipping.concordarComTermos();
		shipping.continuar();
		payment.pagarTransferenciaBancaria();
		payment.continuar();
		
		}
	@After
	public void tearDown() {
		driver.quit();
	}
}