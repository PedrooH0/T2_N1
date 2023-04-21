package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		char turno, categoria = 0;
		
		double sal_min, sal_bruto, sal_liquido, nht, coeficiente = 0, auxilio, grat, pecent, imposto = 0;
		
		System.out.println("Digite a letra correpodente ao seu Turno: "
				+ "\n(M) - Matutinno | (V) - Vespertino | (N) - Noturno ");
		turno = sc.nextLine().toUpperCase().charAt(0);
		
		System.out.println("Digite a letra correspondente a sua Categoria: "
				+ "\n(O) - Operário | (G) - Gerente ");
		categoria = sc.nextLine().toUpperCase().charAt(categoria);
		
		System.out.println("Digite o valor do seu Salário: ");
		sal_min = sc.nextDouble();
		
		System.out.println("Digite o número de horas trabalhadas:");
		nht = sc.nextInt();
	
		if (turno == 'M'){
			coeficiente = ((double)((10/100.0) * sal_min));
			System.out.println("Esse é seu coeficiente: " + coeficiente);
		  } 
		  else if (turno == 'V') {
			  coeficiente = (double)((15/100.0) * sal_min);
			  System.out.println("Esse é seu coeficiente: " + coeficiente);
		  } 
		  else if (turno == 'N') {
			  coeficiente = (double)((12/100.0) * sal_min);
			  System.out.println("Esse é seu coeficiente: " + coeficiente);
		  }
		 
		  sal_bruto = (double)(nht * coeficiente);
		  System.out.println("Esse é seu Salário Bruto: " + sal_bruto);
		  
		  if (categoria == 'O') {
		  	if (sal_bruto >= 300) {
		  		imposto = (double)((5/100.0) * sal_bruto);
		  	} else {
		  		imposto = (double)((3/100.0) * sal_bruto);
		  	}
		  	
		}  if (categoria == 'N') {
			if (sal_bruto >= 400) {
		  		imposto = (double)((6/100.0) * sal_bruto);
		  	} else {
		  		imposto = (double)((4/100.0) * sal_bruto);
		  	}
		}
			System.out.println("Este é seu imposto: " + imposto);
		  
			if (turno == 'N' & nht > 80) {
			  grat = 50;
		  } else {
			  grat = 30;
		  } System.out.println("Esse é a sua gratificação: " + grat);
		  
		  if (categoria == 'O' && coeficiente <= 25) {
			  auxilio = (double)((1/3) * sal_bruto);
		  } else {
			  auxilio = (double)((1/2) * sal_bruto);
		  } System.out.println("Este é seu auxílio: " + auxilio);
		  
		  sal_liquido = sal_bruto - imposto + grat + auxilio;
		  System.out.println("Esre é o seu Salário Liquido: " + sal_liquido);
		  
		  if (sal_liquido < 350) {
			  System.out.println("Mal Remunerado");
		  } else if (sal_liquido >= 350 & sal_liquido <= 600) {
			  System.out.println("Normal");
		  } else if (sal_liquido > 600) {
			  System.out.println("Bem Remunerado");
		  }
	}

}
