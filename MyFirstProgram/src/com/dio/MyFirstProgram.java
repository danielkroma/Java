package com.dio;
import java.math.BigDecimal;

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
        
        final double endTime, startTime = System.nanoTime();

        Order order = new Order("123",102);

        System.out.println(order  );

        endTime = System.nanoTime();
        
        System.out.println("Code took "+((endTime-startTime)/1000000000)+" seconds");
    }
    


}
