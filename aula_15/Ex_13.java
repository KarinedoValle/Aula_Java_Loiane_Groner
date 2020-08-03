package aula_15;

import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dia;

		System.out.print("Digite um número de 1 até 7 e veja o dia da semana correspondente: ");
		dia = scan.nextInt();

		switch (dia) {

		case 1:
			System.out.println("\nDomingo.");
			break;
		case 2:
			System.out.println("\nSegunda-feira.");
			break;
		case 3:
			System.out.println("\nTerça-feira.");
			break;
		case 4:
			System.out.println("\nQuarta-feira.");
			break;
		case 5:
			System.out.println("\nQuinta-feira.");
			break;
		case 6: 
			System.out.println("\nSexta-feira.");
			break;
		case 7:
			System.out.println("\nSábado.");
			break;
		default:
			System.out.println("\nNúmero inválido.");
		}

	}

}
