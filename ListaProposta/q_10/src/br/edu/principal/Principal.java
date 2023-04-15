package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resp = 'S';
		do {
			double valorFabric,dist,impost,valorConsum;
			System.out.println("Custo de fábrica --> Custo ao consumidor");
			System.out.println("Digite o valor de fábrica do veículo");
			valorFabric = sc.nextDouble();
			if (valorFabric <= 12000) {
				dist = valorFabric * 0.05;
				valorConsum = valorFabric + dist;
				System.out.println("O preço final do veículo será de " + valorConsum);
			}
			else if (12000 < valorFabric & valorFabric <= 25000) {
				dist = valorFabric * 0.10;
				impost = valorFabric * 0.15;
				valorConsum = valorFabric + dist + impost;
				System.out.println("O preço final do veículo será de " + valorConsum);
			}
			else if (valorFabric > 25000) {
				dist = valorFabric * 0.15;
				impost = valorFabric * 0.20;
				valorConsum = valorFabric + dist + impost;
				System.out.println("O preço final do veículo será de " + valorConsum);
			}
			System.out.println("Você deseja rodar o programa novamente? (s/n)");
			resp = sc.next().toUpperCase().charAt(0);
			System.out.println();
			
		}
		while (resp == 'S');
		System.out.println("Fim do Programa");
	}

}
