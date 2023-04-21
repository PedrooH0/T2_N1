package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int cod_prod, peso_quilo, peso_gramas, pre_total,
		 valor_total, pre_grama, cod_pais;
		double imposto;
		
		System.out.println("Digite o código do produto comprado: ");
		cod_prod = sc.nextInt();
		System.out.println("Digite o peso do produto em quilos: ");
		peso_quilo = sc.nextInt();
		System.out.println("Digite o código do país de origem: ");
		cod_pais = sc.nextInt();
		peso_gramas = peso_quilo * 1000;
		System.out.println("\n-Peso do produto em gramas: " + peso_gramas);
		
		if (cod_prod >= 1 & cod_prod <= 4){
			pre_grama = 10;
			pre_total = peso_gramas * pre_grama;
			System.out.println("\n-Preço Total: " + pre_total);
		} if (cod_prod >= 5 & cod_prod <= 7){
			pre_grama = 25;
			pre_total = peso_gramas * pre_grama;
			System.out.println("\n-Preço Total: " + pre_total);
		} if (cod_prod >= 8 & cod_prod <= 10){
			pre_grama = 35;
			pre_total = peso_gramas * pre_grama;
			System.out.println("\n-Preço Total: " + pre_total);
		}
		
		if (cod_pais == 1 ) {
			imposto = 0;
			System.out.println("\n-Valor do imposto: " + imposto);
		} else if (cod_pais == 2) {
			imposto = pre_total * (15/100.0);
			System.out.println("\n-Valor do imposto: " + imposto);
		} else if (cod_pais == 3) {
			imposto = pre_total * (25/100.0);
			System.out.println("\n-Valor do imposto: " + imposto);
		} valor_total = pre_total + imposto;
	}		
	    System.out.println("\n-Valor Total: " + valor_total);

	}

}
