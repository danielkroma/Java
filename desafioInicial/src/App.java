import operacoesBasicas.operacoesBasicas;
import operacoesBasicas.mensagem;
import emprestimo.emprestimo;

import java.util.Scanner;
  


public class App {
    public static void main(String[] args) throws Exception {
        //solicita o primeiro valor e atribui a variavael valor1
        Scanner  primeiroValorPassado  = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Insira o primeiro valor");
        String valor1 = primeiroValorPassado.nextLine();

        //solicita o segundo valor e atribui a variavel valor2
        Scanner  segundoValorPassado  = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Insira o segundo valor");
        String valor2 = segundoValorPassado.nextLine();

        //solicita o o tipo de operacao a ser realizada
        Scanner  tipoOperacao  = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Informe o tipo de operacao: \r\n" +
        "1 - soma \r\n" + 
        "2 - subtrai \r\n" + 
        "3 - multiplica \r\n" + 
        "4 - divide");
        String opercaoDesejada = tipoOperacao.nextLine();

        //instancia as operacoes basicas
        operacoesBasicas operacao= new operacoesBasicas();

        if(opercaoDesejada == "1"){
            
        }
        switch (opercaoDesejada) {
            case "1":
            System.out.printf("A operação selecionada foi soma, o resultado é: %d",
            operacao.somarValores(Integer.valueOf(valor1), Integer.valueOf(valor2)));
                break;
            case "2":
            System.out.printf("A operação selecionada foi subtracao, o resultado é: %d",
            operacao.subtraiValores(Integer.valueOf(valor1), Integer.valueOf(valor2)));
                break;
            case "3":
            System.out.printf("A operação selecionada foi multiplicacao, o resultado é: %d",
            operacao.multiplicaValores(Integer.valueOf(valor1), Integer.valueOf(valor2)));
                break;
            case "4":
            System.out.printf("A operação selecionada foi divisao, o resultado é: %d",
            operacao.divideValores(Integer.valueOf(valor1), Integer.valueOf(valor2)));
                break;        
            default:
            System.out.println("Operacao nao encontrada! por favor insira uma operacao valida");
                break;
        }
        
   
        mensagem msg= new mensagem();
        msg.mensagemExibir();

        int parcelas = 5;
        double valor= 100;
        emprestimo.calcular(valor, emprestimo.getDuasParcelas());
        emprestimo.calcular(valor, emprestimo.getTresParcelas());
        emprestimo.calcular(valor, parcelas );;

    }
}
