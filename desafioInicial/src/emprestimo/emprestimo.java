package emprestimo;

public class emprestimo {

    public static int getDuasParcelas() {
        return 2;
    }
    public static int getTresParcelas() {
        return 3;
    }    
    public static double getTaxaDuasParcelas() {
        return 0.9;
    }
    public static double getTaxaTresParcelas() {
        return 0.5;
    }

    public static void calcular(double valor, int parcelas){

        if (parcelas == 2){

            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Valor final do emprestimo para duas parcelas: R$"+valorFinal);

        }
        else if (parcelas == 3){

            double valorFinal = valor + (valor * getTaxaTresParcelas());

            System.out.println("Valor final do emprestimo para duas parcelas: R$"+valorFinal);

        }
        else{
            System.out.printf("%d é uma quantidade de parcelas não aceita",parcelas);
        }

    }
}
