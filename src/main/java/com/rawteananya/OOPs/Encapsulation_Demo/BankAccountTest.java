package com.rawteananya.OOPs.Encapsulation_Demo;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolder("Ananya");
        bankAccount.setBalance(150000.00);

        System.out.println("Account1 : " + bankAccount.getAccountHolder());
        System.out.println("Account1 : " + bankAccount.getBalance());

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.setAccountHolder("Gaurav");
        bankAccount2.setBalance(-150000.00);

        System.out.println("Account2 : " + bankAccount2.getAccountHolder());
        System.out.println("Account2 : " + bankAccount2.getBalance());
    }
}
