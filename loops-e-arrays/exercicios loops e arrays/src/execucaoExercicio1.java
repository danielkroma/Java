import java.util.*;

public class execucaoExercicio1 {

    public static void exercicioExecucao() {

        System.out.println("Nome e Idade: Programa que lê conjuntos de dois valores," +
                "o primeiro representando o nome do aluno e o segundo representando a sua idade." +
                "(Para o programa quando inserido o valor 0 no campo nome)");

        try (Scanner entrada = new Scanner(System.in)) {
            ArrayList<String> listaNomes = new ArrayList<String>();
            ArrayList<Integer> listaIdades = new ArrayList<Integer>();
            String nomes = "";
            Integer idade = 0;

            // Inserir elementos na listaNomes

            // compara se a variavel nomes é diferente de zero antes de adicionar a lista

            // insrido dentro da validação para pedir a idade sómente se o nome for
            // diferente de zero

            // enquanto todos os nomes inseridos forem diferentes de 0 continuará inserindo
            // os nomes
            while (!nomes.equals("0")) {
                if (!(nomes.equals("0"))) {
                    System.out.print("Digite um nome: ");
                    nomes = entrada.nextLine();
                    if (!(nomes.equals("0"))) {
                        System.out.print("Digite uma idade: ");
                        idade = Integer.parseInt(entrada.nextLine());
                    }
                    if (!(nomes.equals("0"))) {
                        listaNomes.add(nomes);
                        listaIdades.add(idade);
                    }
                }
            }
            // Exibir todos os elementos da listaNomes e lista idades
            System.out.println("=== Os nomes e idades inseridos foram ===");
            for (int i = 0; i < listaNomes.size(); i++) {
                System.out.println("Nome: " + listaNomes.get(i) + " Idade :" + listaIdades.get(i));
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
