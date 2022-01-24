import java.util.*;

public class execucaoExercicio4 {

    public static void exercicioExecucao() {

        System.out.println("Par e Ímpar: Faça um programa que peça N números inteiros." +
                " Calcule e mostre a quantidade de números pares e a quantidade de números impares." +
                "quando quizer encerrar apenas pressione enter!");

        ArrayList<Integer> listaNumerosPar = new ArrayList<Integer>();
        ArrayList<Integer> listaNumerosImpar = new ArrayList<Integer>();
        try (Scanner entrada = new Scanner(System.in)) {
            String numeros;

            do {
                System.out.print("informe um numero: ");
                numeros = entrada.nextLine();
                if (!numeros.isEmpty()) {
                    if (Integer.parseInt(numeros) % 2 == 0) {
                        listaNumerosPar.add(Integer.parseInt(numeros));
                    } else {
                        listaNumerosImpar.add(Integer.parseInt(numeros));
                    }
                }

            } while (!numeros.isEmpty());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.print("Você inseriu " + listaNumerosPar.size() + " numeros par e " + listaNumerosImpar.size()
                + " numeros impar");

    }
}
