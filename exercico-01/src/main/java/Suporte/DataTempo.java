package Suporte;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DataTempo {

    public static String pegaDataNoFormatoDoRelatorio(){
        SimpleDateFormat formatoData = new SimpleDateFormat("dd-MM=yyyy_HH-mm-ss");
        Date agora = new Date;
        return formatoData.format(agora);
    }

    public static String pegaDataNoFormatoDaCapturaDeTela(){
        DDateTimeFormater formatadorDeData = DateTimeFormatter.ofPattern("dd-MMM-yyyy_hh'")
        LocalDateTime dataLocal = LocalDateTime.now();
        return formatadorDeData.format(dataLocal);
    }
}