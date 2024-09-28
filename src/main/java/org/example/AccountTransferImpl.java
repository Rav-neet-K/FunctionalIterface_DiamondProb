package org.example;

public class AccountTransferImpl implements IAccountTransfer,IGlobalMoneyTransfer {

    AccountTransferImpl accountTransfer= new AccountTransferImpl();

    double withdrawl =accountTransfer.withdraw(200.2);
    double deposit = IAccountTransfer.deposit(330.34); //static method implemetation from interface
    @Override
    public void finalBalance() {
        System.out.println("The final balance is : "+(IAccountTransfer.balance -withdrawl+deposit));
    }

    @Override
    public void Conversion() {
        IAccountTransfer.super.Conversion();
    }
//    @Override
//    public void Conversion() {
//        IGlobalMoneyTransfer.super.Conversion();
//    }
}


