package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resp = 'S';
		System.out.println("Calculo da Função do Segundo Grau\n");
		do {
			double a,b,c,delta,x1,x2;
			System.out.println("Digite o valor de a: ");
			a = sc.nextDouble();
			System.out.println("Digite o valor de b: ");
			b = sc.nextDouble();
			System.out.println("Digite o valor de c: ");
			c = sc.nextDouble();
			if (a == 0) {
				System.out.println("Esses valores não formam uma equação do segundo grau, tente novamente.\n");
				continue;
			} 
		    else {
				delta = (b * b) - (4 * a *  c);
				if (delta < 0) {
					System.out.println("Não existe raiz real\n");
				}
				if (delta == 0) {
					System.out.println("Existe uma raiz real\n");
					x1 = -b / 2*a;
					System.out.println("x1 é igual a: "+x1);
				}
				if (delta > 0) {
					System.out.println("Existem duas raízes reais");
					x1 = (-b + Math.sqrt(delta)) / (2 * a);
					x2 = (-b - Math.sqrt(delta)) / (2 * a);
					System.out.println("x1 é igual a: "+x1+"\nx2 é igual a: "+x2+"\n");
				}
			}
			System.out.println("Você deseja rodar o programa novamente? (s/n)");
			resp = sc.next().toUpperCase().charAt(0);
		}
		while (resp == 'S');
		System.out.println("Fim do Programa");
	}

}
