import java.util.*;

public class execucaoExercicio7 {

    public static void exercicioExecucao() {
        System.out.println("Faça um Programa que leia um vetor de 6 caracteres," +
                " e diga quantas consoantes foram lidas. Imprima as consoantes.\r\n");
        try (Scanner entrada = new Scanner(System.in)) {
            char[] arraycaracteres = new char[6];
            int contador = 0;

            for (int i = 0; i < arraycaracteres.length; i++) {
                System.out.print("Digite o numero a ser adicionado ao final da pilha: ");
                char entradaChar = entrada.next().charAt(0);
                if (entradaChar >= 98 && entradaChar <= 122) {

                    contador++;

                }

            }

            System.out.println("Foram inseridas "+contador+" consoantes no array");

        }
    }
}