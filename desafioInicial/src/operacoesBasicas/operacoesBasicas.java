package operacoesBasicas;


public class operacoesBasicas {


    private int valor1;
    private int valor2;

    public operacoesBasicas() {
    }

    public int somarValores(int valor1,int valor2) {
        this.valor1= valor1;
        this.valor2= valor2;
        return valor1 + valor2;
        
    }
    public int subtraiValores(int valor1,int valor2) {
        this.valor1= valor1;
        this.valor2= valor2;
        return valor1 - valor2;
        
    }
    public int multiplicaValores(int valor1,int valor2) {
        this.valor1= valor1;
        this.valor2= valor2;
        return valor1 * valor2;
        
    }
    public int divideValores(int valor1,int valor2) {
        this.valor1= valor1;
        this.valor2= valor2;
        return valor1 / valor2;
        
    }

}
