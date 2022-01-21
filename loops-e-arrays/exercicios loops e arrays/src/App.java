import java.util.Scanner;
import java.util.ArrayList;

public class App {


    /*Nome e Idade: Faça um programa que leia conjuntos de dois valores, 
    o primeiro representando o nome do aluno e o segundo representando a sua idade.
     (Pare o programa inserindo o valor 0 no campo nome) */
    public static void main(String[] args) throws Exception {



        System.out.println("Nome e Idade: Faça um programa que leia conjuntos de dois valores,"+ 
    "o primeiro representando o nome do aluno e o segundo representando a sua idade."+
     "(Pare o programa inserindo o valor 0 no campo nome)");
      
    
    
     Scanner entrada = new Scanner(System.in);
     ArrayList<String> listaNomes = new ArrayList();
     ArrayList<Integer> listaIdades = new ArrayList();
     String nomes;
     Integer idade;

     //Inserir elementos na listaNomes

//
 
     //compara se a variavel nomes é diferente de zero antes de adicionar a lista
            while (!nomes.equals("0")){
            listaNomes.add(nomes);
            listaIdades.add(idade);
            System.out.print("Digite um nome: ");
            nomes = entrada.nextLine();
            System.out.print("Digite uma idade: ");
            idade = Integer.parseInt(entrada.nextLine());
        }
    }
}
