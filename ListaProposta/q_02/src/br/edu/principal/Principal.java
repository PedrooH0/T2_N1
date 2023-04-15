package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resp = 'S';
		do {
			double nota1,nota2,nota3,media,nota_exam;
			System.out.println("Digite a 1° nota: ");
			nota1 = sc.nextDouble();
			System.out.println("Digite a 2° nota: ");
			nota2 = sc.nextDouble();
			System.out.println("Digite a 3° nota: ");
			nota3 = sc.nextDouble();
			if (nota1 > 10 | nota2 > 10 | nota3 > 10) {
				System.out.println("\nÉ impossível tirar uma nota maior que 10, tente novamente\n");
				continue;
			}
			media = (nota1 + nota2 + nota3)/3;
			System.out.println("Média aritmética: "+new DecimalFormat(".##").format(media));
			if(media >= 0 && media < 3) {
				System.out.println("Você está reprovado\n");
			}
			else if(media >= 3 && media < 7) {
				System.out.println("Exame");
				nota_exam = 12 - media;
				System.out.println("Você deve tirar nota "+ new DecimalFormat(".##").format(nota_exam) + " para ser aprovado\n");
			}
			else if(media >= 7 && media <= 10) {
				System.out.println("Você está aprovado\n");
			}
			System.out.println("Você deseja rodar o programa novamente? (s/n)");
			resp = sc.next().toUpperCase().charAt(0);
		}
		while (resp == 'S');
		System.out.println("Fim do Programa");
	}

}
