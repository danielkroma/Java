import java.util.*;

public class execucaoExercicio5 {

    public static void exercicioExecucao() {

        System.out.println("Tabuada: Desenvolva um gerador de tabuada,"+
        " capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10."+
        " O usuário deve informar de qual numero ele deseja ver a tabuada."+
        " A saída deve ser conforme o exemplo abaixo:\r\n"+

        "Tabuada de 5:!\r\n"+
        "5 X 1 = 5\r\n"+
        "5 X 2 = 10\r\n"+
        "...\r\n"+
        "5 X 10 = 50\r\n");
        System.out.print("informe um numero: \r\n");
        try (Scanner entrada = new Scanner(System.in)) {
            String saida = (String) entrada.nextLine();
            System.out.println("Tabuada de "+ saida +" :\r\n");
            for(int i= 1 ; i <= 10 ; i++){
                System.out.println( saida + " X " + i + " = " +(Integer.valueOf(saida)* i));
                
 

            }
        } catch (NumberFormatException e) {

            e.printStackTrace();
        }

    
    }
}
