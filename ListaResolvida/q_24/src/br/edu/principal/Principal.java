package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pre, valor_adic = 0, imposto, pre_custo, desconto, novo_pre;
		char tipo, refrig;
		System.out.println("Qual o preço do produto?");
		pre = sc.nextDouble();
		System.out.println("Qual o tipo do produto?"
				+ "\nA = Alimentação"
				+ "\nL = Limpeza"
				+ "\nV = Vestuário");
		tipo = sc.next().toUpperCase().charAt(0);
		System.out.println("Qual o tipo de refrigeração?"
				+ "\nS = Produto que necessita de refrigeração"
				+ "\nN = Produto que não necessita de refrigeração");
		refrig = sc.next().toUpperCase().charAt(0);
		if (refrig == 'N') {
			if (tipo == 'A') {
				if (pre < 15) {
					valor_adic = 2;
				}
				else {
					valor_adic = 5;
				}
			}
			else if (tipo == 'L') {
				if (pre < 10) {
					valor_adic = 1.50;
				}
				else {
					valor_adic = 2.50;
				}
			}
			else if (tipo == 'V') {
				if (pre < 30) {
					valor_adic = 3;
				}
				else {
					valor_adic = 2.5;
				}
			}
		}
		
		else {
			if(tipo == 'A') {
				valor_adic = 8;
			}
			else if (tipo == 'L') {
				valor_adic = 0;
			}
			else if (tipo =='V') {
				valor_adic = 0;
			}
		}
		
		System.out.println("--------------------------------");
		System.out.println("Esse é o seu valor adicional R$ " + valor_adic);
		 
		if (pre < 25) {
			imposto = (5/100.0) * pre;
		}
		else {
			imposto = (8/100.0) * pre;
		}
		
		System.out.println("--------------------------------");
		System.out.println("Esse o imposto do produto: R$ " + imposto);
		
		pre_custo = pre + imposto;
		
		System.out.println("--------------------------------");
		System.out.println("Preço do produto mais os impostos: " + pre_custo);
		
		if (tipo != 'A' & refrig != 'S') {
			desconto = (3/100.0) * pre_custo;
			System.out.println("--------------------------------");
			System.out.println("Desconto do produto: R$ " + desconto);
		}
		else {
			desconto = 0;
			System.out.println("--------------------------------");
			System.out.println("Esse produto não tem desconto");
		}
		
		novo_pre = pre + valor_adic - desconto;
		
		System.out.println("--------------------------------");
		System.out.println("Novo preço do produto: " + novo_pre);
		
		if (novo_pre <= 50) {
			System.out.println("--------------------------------");
			System.out.println("Seu Produto é Barato");
		}
		else if (novo_pre < 100) {
			System.out.println("--------------------------------");
			System.out.println("Seu Produto é Normal");
		}
		else {
			System.out.println("--------------------------------");
			System.out.println("Seu Produto é Caro");
		}

	}

}
