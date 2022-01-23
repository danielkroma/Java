import java.util.*;

public class execucaoExercicio8 {

    public static void exercicioExecucao() {
        System.out.println(
                "Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)" +
                        " armazene-os num vetor. Ao final, mostre os números e seus sucessores.\r\n");
        ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();

        Random gerador = new Random();
        for (int i = 0; i < 20; i++) {
            int numeroGerado = gerador.nextInt(100);
            numerosAleatorios.add(numeroGerado);
        }
        for(var i:numerosAleatorios){
            System.out.println("Número aleatório: "+i +" sucessor do número: "+((int)i+1) );
        }
 

    }
}