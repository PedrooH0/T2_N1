package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pre,venda,novo_pre;
		char resp = 'S';
		do {
			System.out.println("Digite o preço do produto: ");
			pre = sc.nextDouble();
			System.out.println("Digite o número de vendas mensais: ");
			venda = sc.nextDouble();
			if (venda < 500 || pre < 30) {
				novo_pre = pre + (pre * 10/100);
				System.out.println("O preço do produto sofreu um aumento de 10%, e ficou de: R$ "+(novo_pre));
			}
			else if((venda >= 500) && (venda < 1200) || (pre<=30) && (pre<80)) {
				novo_pre = pre + (pre*15/100);
				System.out.println("O preço do produto sofreu um aumento de 15%, e ficou de: "+(novo_pre));
			}
			else if(venda >= 1200 || pre >= 80) {
				novo_pre = pre - (pre*20/100);
				System.out.println("O preço do produto sofreu uma diminuição de 20%, e ficou de: "+(novo_pre));
			}
			System.out.println("Você deseja rodar o programa novamente? (s/n)");
			resp = sc.next().toUpperCase().charAt(0);
		}
		while (resp == 'S');
		System.out.println("Fim do Programa");
	}

}
