package com.dio.order;

public class Order {

    private final String code;
    private int valor;


    public Order(String code,int valor){

        this.code=code;
        this.valor=valor;

    } 

    public int calculateFeesIfElse(int valor){
        if(valor>100){
        return valor * 2;
        }
        else{
            return valor;
        }

    }
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
    @Override
    public String toString() {
        
        return "Order={"+
               "code:'"+ code +"'" +
               " valor:'"+String.valueOf(calculateFeesCase(valor)) + "' }";
    }

}
