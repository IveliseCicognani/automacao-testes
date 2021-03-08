package suporte;

import utilitarios.GerenciadorDeArquivos;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestBase extends GerenciadorDriver{

    private static WebDriver driver;
    private static GerenciadorDeArquivos gerenciadorDeArquivos = new GerenciadorDeArquivos();

    /* Inicialmente montamos a testbase passando a url por string, mas não é uma boa prática
       melhoramos a leitura com arquivos de propriedades.
     */

    //private String URL = "https://www.saucedemo.com/index.html";

    public static WebDriver pegarDriver(){

        driver = pegarDriver(TipoDriver.FIREFOX);
        return driver;
    }

    @BeforeEach
    public void setUp() throws IOException {
//        pegarDriver().get(URL);
        String index = gerenciadorDeArquivos.getProperties("url").getProperty("url.index");
//        configReportExtent();
        pegarDriver().get(index);
    }

    @AfterEach
    public void encerraDriver(){

        Relatorio.close();
        encerrarDriver();

    }

}