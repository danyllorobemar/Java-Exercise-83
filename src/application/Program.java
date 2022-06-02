package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account number: ");
		int accNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Account holder: ");
		String accHolder = sc.nextLine();
		System.out.println("Is there a initial deposit? (y/n)");
		char option = sc.next().charAt(0);
		
		Account account;
		
		if(option == 'y') {
			System.out.println("Enter the initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accNumber, accHolder, initialDeposit);
		}else {
			account = new Account(accNumber, accHolder);
		}
		
		System.out.println("** Account data **");
		System.out.println(account);
		System.out.println();
		
		System.out.println("Select an operation: ");
		System.out.println("[1]Deposit");
		System.out.println("[2]WithDraw");
		System.out.println("[3]Exit");
		int option2 = sc.nextInt();
		
		switch(option2) {
		
		case 1:
			System.out.println("Enter a deposit: ");
			account.deposit(sc.nextDouble());
			System.out.println("Update account data: ");
			System.out.println(account);
			break;
			
		case 2:
			System.out.println("Enter a withdraw: ");
			account.withDraw(sc.nextDouble());
			System.out.println("Update account data: ");
			System.out.println(account);
			break;
			
		case 3:
			System.out.println("***Finished operation***");
			
		default:
			System.out.println("Invalid option! Aborted operation.");
		}

		
		sc.close();

	}

}
