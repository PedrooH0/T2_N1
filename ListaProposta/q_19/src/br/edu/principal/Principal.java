package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura, peso;
		char sexo;
		System.out.println("Digite seu sexo: "
				+ "\n(M) - Mulher \n(H) - Homem");
		sexo = sc.next().charAt(0);
		System.out.println("Digite sua altura: ");
		altura = sc.nextDouble();
		if ( sexo == 'M') {
		    peso = (62.1 * altura) - 44.7;
		    int pesoInt =(int)peso;
		    System.out.println("Esse é o seu peso ideal: " + pesoInt + "kg");
		} else if ( sexo == 'H') {
		    peso = (72.7 * altura) - 58;
		    int pesoInt =(int)peso;
		    System.out.println("Esse é o seu peso ideal: " + pesoInt + "kg");
	    } else {
	        System.out.println("Coloque uma resposta válida!");
	    }
	}

}
