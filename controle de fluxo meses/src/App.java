import java.text.SimpleDateFormat;
import java.util.Calendar;

import meses.meses;


public class App {
    public static void main(String[] args) throws Exception {
  
        String timeStamp = new SimpleDateFormat("MM").format(Calendar.getInstance().getTime());
        var mesDoAnoLiteral = meses.mesDoAno(Integer.valueOf(timeStamp));

        System.out.println("Estamos em "+ mesDoAnoLiteral + " e você "+ meses.ferias(mesDoAnoLiteral) );
    }
}
