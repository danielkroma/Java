import java.util.*;

public class execucaoExercicio2 {

    public static void exercicioExecucao() {

        System.out.println("Nota: Faça um programa que peça uma nota, entre zero e dez." +
        "Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.");

        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        try (Scanner entrada = new Scanner(System.in)) {
            Integer numeros;

            do {
                System.out.print("informe uma nota de 0 a 10: ");
                numeros =Integer.parseInt(entrada.nextLine());
                if(numeros<0 || numeros > 10){
                    System.out.println("Os numeros devem ser apenas de 0 a 10 !!!");
                    listaNumeros.add(numeros);
                }

            
            }while(numeros<0 || numeros > 10);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.print(listaNumeros);     
   
    }
    
    

    

}
