import java.util.*;

public class execucaoExercicio6 {

    public static void exercicioExecucao() {

        System.out.println("Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros \r\n e mostre-os na ordem inversa.\r\n");
        try (Scanner entrada = new Scanner(System.in)) {
            ArrayDeque<Integer> dq = new ArrayDeque<Integer>();

            for(int i =0 ; i < 5; i++){
                System.out.print("Digite o numero a ser adicionado ao final da pilha: ");
                Integer saida = entrada.nextInt();
                dq.addFirst(saida);
                
            }
            System.out.println(dq);
        }
        

         

    
    }
}
