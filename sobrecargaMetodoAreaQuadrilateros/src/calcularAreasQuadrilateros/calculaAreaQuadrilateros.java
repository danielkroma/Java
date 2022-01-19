package calcularAreasQuadrilateros;

public class calculaAreaQuadrilateros {


   public static void calculaAreaQuadrilaterosGenerico(double lado){

        double area = lado * lado;

        System.out.println("A área do quadrado é " + area);
    
   }

   public static void calculaAreaQuadrilaterosGenerico(double lado, double altura){

    double area = lado * altura;

    System.out.println("A área do retangulo é " + area);

   }

   public static void calculaAreaQuadrilaterosGenerico(double baseMaior, double baseMenor,double altura){

    double area =( baseMaior + baseMenor)/altura;

    System.out.println("A área do trapézio é " + area);

   }


    
}
