package Suporte;

import Utilitarios.FileOperations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TesteBase extends GerenciadorDriver {

    private static WebDriver driver;
    private String URL = FileOperations.pegaPropriedade("url".getProperty(url1));

    public static WebDriver pegarDriver(){

        driver = pegarDriver(TipoDriver.CHROME);
        return driver;
    }

    @BeforeEach
    public void setUp(){
        pegarDriver().get(URL);
    }

    @AfterEach
    public void encerraDriver(){
        Relatorio.fecha();
        encerrarDriver();
    }

}
