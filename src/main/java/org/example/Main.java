package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountTransferImpl accountTransfer= new AccountTransferImpl();

        accountTransfer.Conversion();
        System.out.println("What is the type of transfer: Global or Country-Wide");

    }
}