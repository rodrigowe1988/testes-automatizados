package application;

import entities.Account;
import exceptions.BusinessException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account conta1 = new Account(1001, "Rodrigo", 500.00, 100.00);


//        System.out.println("Enter account data: ");
//        System.out.printf("Number: ");
//        Integer number = sc.nextInt();
//        System.out.printf("Holder: ");
//        String holder = sc.next();
//        System.out.printf("Initial balance: ");
//        Double balance = sc.nextDouble();
//        System.out.printf("Withdraw limit: ");
//        Double withdrawLimit = sc.nextDouble();
//
//        entities.Account conta = new entities.Account(number, holder, balance, withdrawLimit);
//        System.out.println(conta);

        System.out.println("Enter the amount of withdraw: ");
        Double amount = sc.nextDouble();
        try {
            conta1.withdraw(amount);
            System.out.println("New balance: " + conta1.getBalance());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            String msg = e.getMessage();
            System.out.println("Error" + msg);
            e.printStackTrace();
        }

        sc.close();
    }
}
