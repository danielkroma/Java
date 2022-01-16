package com.dio;
import com.dio.order.*;

/**
 * @author Daniel Macedo Rodrigues
 * @version 1.0.0
 * @since 1.0.0 release
 * 
 */

public class MyFirstProgram {

    /**
     * 
     * @param args e uma forma do mundo externo comunicar-se com a aplicacao atraves de argumentos
     */
    public static void main(String[] args) {

        Order order = new Order("123",-1);

        System.out.println(order  );
    }
    


}
