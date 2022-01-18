package operacoesBasicas;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class mensagem {

    public void mensagemExibir() {

        String horalocal = ZonedDateTime.now().format(DateTimeFormatter.ofPattern("HH"));
        new Integer(Integer.parseInt(horalocal));
        if(Integer.valueOf(horalocal) <= 12){

            System.out.println("\r\n Bom Dia!!!\r\n");

        }
        if((Integer.valueOf(horalocal) <= 17) && (Integer.valueOf(horalocal) > 12) ){

            System.out.println("\r\nBoa Tarde!!!\r\n");

        }
        else{

            System.out.println("\r\nBoa Noite!!!\r\n");
        }
    }
    
}
