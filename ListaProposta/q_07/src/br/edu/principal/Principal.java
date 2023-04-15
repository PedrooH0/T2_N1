package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resp = 'S';
		do {
			System.out.println("Digite o valor do seu salário: ");
			double valor = sc.nextDouble();
			if (valor >= 500) {
				System.out.println("Pelo seu salário ser maior ou igual a R$ 500 a empresa não poderá lhe dar o aumento de 30% no seu salário atual.\n");
			}
			if (valor < 500) {
				valor = valor + (valor * 30/100);
				System.out.println("Pelo seu salário ser menor que R$ 500 a empresa irá lhe dar um aumento de 30% no seu salário atual, passando a ser R$ " + valor +"\n");
			}
			System.out.println("Você deseja rodar o programa novamente? (s/n)");
			resp = sc.next().toUpperCase().charAt(0);
			
		} 
		while (resp == 'S');
		System.out.println("Fim do Programa");
	}

}
