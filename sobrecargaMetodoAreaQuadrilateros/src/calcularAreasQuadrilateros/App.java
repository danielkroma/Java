package calcularAreasQuadrilateros;

/*Criar uma aplicação java, usando sobrecarga de método para 
calcular a área de três quadriláteros notáveis, quadrado, retângulo e trapezio.*/


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("A área do quadrado é " + calculaAreaQuadrilateros.calculaAreaQuadrilaterosGenerico(1.5));
        System.out.println("A área do retangulo é " + calculaAreaQuadrilateros.calculaAreaQuadrilaterosGenerico(1.5,2));
        System.out.println("A área do trapézio é " + calculaAreaQuadrilateros.calculaAreaQuadrilaterosGenerico(2,2,2));
    }
}
