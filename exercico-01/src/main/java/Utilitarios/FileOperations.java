package Utilitarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileOperations {
    private static final String CAMINHO_PROPERTIES =
            System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator +
                    "resources" + File.separator + "Properties";

    public Properties pegaPropriedade(String nomeArquivo) throws IOException {
        InputStream inputStream = null;
        Properties properties = new Properties();

        try {
            File file = new File(CAMINHO_PROPERTIES + File.separator + nomeArquivo + "properties");
            inputStream = new FileInputStream(file);
            properties.load(inputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }
}
