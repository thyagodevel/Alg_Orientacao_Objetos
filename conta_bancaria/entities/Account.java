package entities;

public class Account {
	private int number; //atributo encapsulado
	private String name; //atributo encapsulado
	private double balance; //atributo encapsulado
	
	public Account(int number, String name, double initialDeposit) { //construtor
		this.number = number;
		this.name = name;
		deposit(initialDeposit); //determina que o objeto não inicie sem valor
	}

	public Account(int number, String name) { //construtor com sobrecarga
		this.number = number;
		this.name = name;
	}

	public int getNumber() { //acessa o atributo encapsulado
		return number;
	}

	public String getName() { //acessa o atributo encapsulado
		return name;
	}

	public void setName(String name) { //altera o atributo encapsulado
		this.name = name;
	}

	public double getBalance() { //acessa o atributo encapsulado
		return balance;
	}

	public void deposit(double amount) { //metodo que evetua um deposito ao valor antigo
		balance += amount;
	}

	public void sac(double amount) { //metodo que efetua um saque ao valor antigo, menos uma taxa de saque
		balance -= amount + 5.0;
	}
	
	public String toString() { //metodo que retorna os valores atualizados a mostrar na tela
		return "account "
				+ number
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
	
	
}
