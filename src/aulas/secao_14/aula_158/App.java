package aulas.secao_14.aula_158;

import aulas.secao_14.aula_158.entities.Account;
import aulas.secao_14.aula_158.entities.BusinessAccount;
import aulas.secao_14.aula_158.entities.SavingsAccount;

public class App {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withDraw(200.0);
		System.out.println(acc1.getBalance());
		
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withDraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withDraw(200.0);
		System.out.println(acc3.getBalance());
		
	}

}