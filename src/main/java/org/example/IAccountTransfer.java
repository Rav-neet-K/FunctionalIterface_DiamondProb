package org.example;

@FunctionalInterface

public interface IAccountTransfer {
     double balance= 1000; //static so not going to have storage in instance.

      void finalBalance();
     default void Conversion(){
          System.out.println("The conversion in same currency");
          double nb =balance*1;
     }
     default double withdraw(double amount){
          double nb= balance-amount;
          System.out.println("The money after withdrawl is" +nb);
      return nb;
     }

     static double deposit(double amount){
          double nb= balance+amount;
          System.out.println("The money after deposit is" +nb);
return nb;
     }

     default void comment(){
          System.out.println("Arnab has balance ");
     }
}
