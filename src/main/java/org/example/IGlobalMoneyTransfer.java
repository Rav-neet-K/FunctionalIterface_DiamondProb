package org.example;

public interface IGlobalMoneyTransfer {

    double balance = 10000;
     double conversion_rate_usa = 1.14;
    default void Conversion(){
        System.out.println("The conversion in Different currency");
        double nb = balance*conversion_rate_usa;
    }
}
