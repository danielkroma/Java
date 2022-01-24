import java.util.*;

public class execucaoExercicio9 {

    public static void exercicioExecucao() {
        System.out.println(
                "Array Multidimensional: Gere e imprima uma matriz M 4x4 \r\n" +
                        "com valores aleatórios entre 0-9." +
                        "Após isso determine o menor número da matriz e a sua posição(linha, coluna).\r\n");
        // o array em questão
        int[][] myarray = new int[4][4];
        // A posição valor linha coluna onde ficará o menor valor
        int menor = 0;
        int[] valorLinhaColuna = new int[2];
        Random aleatorio = new Random();
        int numeroGerado;
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                numeroGerado = aleatorio.nextInt(100);
                myarray[i][j] = numeroGerado;
                if (i == 0 && j == 0) {
                    menor = numeroGerado;
                } 
                if (numeroGerado < menor) {
                    menor = numeroGerado;
                    valorLinhaColuna[0] = i;
                    valorLinhaColuna[1] = j;
                }
            }
            System.out.println(myarray[i][0] +" "+ myarray[i][1]  +" "+ myarray[i][2]  +" "+ myarray[i][3]);
        }
        System.out.println("o menor numero gerado foi " + menor + " " + valorLinhaColuna[0] + " " + valorLinhaColuna[1]);
    }
}