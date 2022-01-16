package com.dio.order;

import javax.management.RuntimeErrorException;

/**
 * @author Daniel Macedo Rodrigues
 * @version 1.0.0
 * @see int
 * @see String
 * @since 1.0.0 release
 */

public class Order {

    private final String code;
    private int valor;

    /**
     * 
     * @param code representa o codigo do pedido
     * @param valor representa o valor do pedido
     */


    public Order(String code,int valor){

        this.code=code;
        this.valor=valor;

    }
    
    /**
     * 
     * @param valor valor recebido para aplicacaoo de um fator multiplicador representando a taxa cobrada
     * @return o valor que sera calculado da taxa
     * @throws RuntimeErrorException caso o valor seja menor do que zero
     */

    public int calculateFeesIfElse(int valor)throws RuntimeException{
        if(valor>100){
        return valor * 2;
        }
        if(valor<0){
            throw new RuntimeErrorException(null, "O valor nao pode ser negativo");
            }
        else{
            return valor;
        }

    }

    /**
     * 
     * @param valor valor recebido para aplicacao de um fator multiplicador representando a taxa cobrada
     * @return  o valor que sera calculado da taxa se o metodo chamado for calculateFeesCase
     */

    public double calculateFeesCase(int valor){
        switch(valor){
            case 100:
            return valor * 1.1;
            case 200:
            return valor * 2.2;
            default:
            return valor * 3.3;
        }
        

    }
    /**
     * @return descricao para saida do valor com codigo e taxa aplicada para o main 
     */
    @Override
    public String toString() {
        
        return "Order={"+
               "code:'"+ code +"'" +
               " valor:'"+String.valueOf(calculateFeesIfElse(valor)) + "' }";
    }

}
