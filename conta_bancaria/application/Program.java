package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //determina o local para mudança de pontuação numérica
		Scanner teclado = new Scanner(System.in); //estancia a entrada de dados pelo teclado
		
		Account account; //variavel para instanciamento, foi colocada aqui porque no IF ficaria limitada ao escopo do IF
		
		System.out.print("Enter account number: ");
		int number = teclado.nextInt(); //variavel temporária para entrada de dados
		System.out.print("Enter account holder: ");
		teclado.nextLine(); //variavel temporária para entrada de dados
		String name = teclado.nextLine(); //variavel temporária para entrada de dados
		System.out.print("Is there na initial deposit? (y/n) ");
		char yOurN = teclado.next().charAt(0);  //variavel temporária para entrada de dados
		if (yOurN == 'y') { //condição para determinar qual construtor rodar
			System.out.println("Enter initialdeposit value: ");
			double initialDeposit = teclado.nextDouble(); //variavel temporária para entrada de dados
			
			account = new Account(number, name, initialDeposit); //instanciamento da classe Account que a variavel foi declara logo acima, acessando um construtor
		}
		else {
			account = new Account(number, name); //instanciamento da classe Account que a variavel foi declara logo acima, acessando outro construtor
		}
		
		System.out.println();
	    System.out.println("Account data:");
	    System.out.println(account); //mostra na tela o resultado

	    System.out.println();
	    System.out.print("Enter a deposit value: ");
	    double depositValue = teclado.nextDouble(); //variavel temporária para entrada de dados para deposito
	    account.deposit(depositValue); //chama o metodo de deposito
	    System.out.println("Updated account data:");
	    System.out.println(account); //mostra na tela o resultado

	    System.out.println();
	    System.out.print("Enter a withdraw value: ");
	    double withdrawValue = teclado.nextDouble(); //variavel temporária para entrada de dados para saque
	    account.sac(withdrawValue); //chama o metodo de saque
	    System.out.println("Updated account data:");
	    System.out.println(account); //mostra na tela o resultado
		
		
		teclado.close();
	}
}
