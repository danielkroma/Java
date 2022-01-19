package calcularAreasQuadrilateros;

public class calculaAreaQuadrilateros {


   public static double calculaAreaQuadrilaterosGenerico(double lado){

        double area = lado * lado;

        return area;
    
   }

   public static double calculaAreaQuadrilaterosGenerico(double lado, double altura){

    double area = lado * altura;

    return area;

   }

   public static double calculaAreaQuadrilaterosGenerico(double baseMaior, double baseMenor,double altura){

    double area =( baseMaior + baseMenor)/altura;

    return area;

   }


    
}
