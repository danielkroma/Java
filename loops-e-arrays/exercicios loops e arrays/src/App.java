import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Informe o numero do exercicio que desaja o resultado:");
        
        try (Scanner leitor = new Scanner(System.in)) {
            Integer valorRecebido = leitor.nextInt();
            switch (valorRecebido){
                case 1:
                execucaoExercicio1.exercicioExecucao();
                break;
                case 2:
                execucaoExercicio2.exercicioExecucao();
                break;
                case 3:
                execucaoExercicio3.exercicioExecucao();
                break;
                case 4:
                execucaoExercicio4.exercicioExecucao();
                break;
                case 6:
                execucaoExercicio6.exercicioExecucao();
                break;
                case 7:
                execucaoExercicio7.exercicioExecucao();
                break;
                case 8:
                execucaoExercicio8.exercicioExecucao();
                break;
                case 9:
                execucaoExercicio9.exercicioExecucao();
                break;
                default:
                System.out.println("entrada inválida, por favor digite um valor de 1  a 9");
            }
        }
        execucaoExercicio9.exercicioExecucao();

    }
}
