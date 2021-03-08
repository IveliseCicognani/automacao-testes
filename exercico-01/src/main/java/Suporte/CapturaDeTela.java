package Suporte;

import org.openqa.selenium.TakesScreenshot;

import com.assertthat.selenium_shutterbug.core.PageSnapshot;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.ScreenshotException;
import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class CapturaDeTela {

    public class CapturaDeTela{
        private static final String CAMINHO_CAPTURA_DE_TELA = GeradorRelatorio.CAMINHO_RELATORIO;
        File.separator + "CapturaDeTela";

        public static MediaEntityModelProvider capture(WebDriver driver){
            try{
            CriarPasta.criaPastaRelatorio(CAMINHO_CAPTURA_DE_TELA);
            File scrshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String caminhoDaCaptura = CAMINHO_CAPTURA_DE_TELA + File.separator +

        }catch(IOException e){
                String mensagem = "Ocorreu um erro na captura de tela!";
                Relatorio.log(Status.WARNING, mensagem);
            }
            return null;
    }

    public static MediaEntityModelProvider fullPageBase64(WebDriver driver){
        try{
        PageSnapshot

        }catch (ScreenshotException | IOException e){
            String mensagem = "Ocorreu um erro na captura de tela!";
            Relatorio.log(Status.WARNING, mensagem);
        }

        return null;
    }
    }

}
