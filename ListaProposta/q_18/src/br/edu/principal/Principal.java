package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		if (idade < 18) {
			System.out.println("Você ainda é de menor =)");
		} else if (idade == 18){
			System.out.println("Parabens! Tens a maioridade.");
		} else {
			System.out.println("Ta ficando velho...");
		}
	}

}
