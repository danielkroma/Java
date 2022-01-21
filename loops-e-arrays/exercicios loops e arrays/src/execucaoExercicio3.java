import java.util.*;

public class execucaoExercicio3 {

    public static void exercicioExecucao() {

        System.out.println("Maior e Média: Faça um programa que leia 5 números "+
        "e informe o maior número e a média desses números.");
 
        try (// Inserir elementos na listaNomes
        Scanner entrada = new Scanner(System.in)) {
          ArrayList<Integer> numeros = new ArrayList<Integer>();
          int maior=0;
          int numerosSomados=0;     

          do { 
            System.out.println("Insira cinco numeros: ");
            numeros.add(entrada.nextInt());

            //enquanto todos os nomes inseridos forem diferentes de 0 continuará inserindo os nomes
          } while ( numeros.size()<5);
              for(int numero:numeros){
                numerosSomados+=numero;
                if(numero > maior){
                  maior = numero;
                }              
              }


          // Exibir todos os elementos da listaNomes e lista idades
          System.out.println("O maior numero inserido foi "+ maior + " e a média aritimética entre os numeros inseridos é "+ numerosSomados/5 );
        }
         
        
    }
}
