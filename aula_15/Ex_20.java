package Aula_15;

import java.util.Scanner;

public class Ex_20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char resp, sim = 0;

		System.out.println("Responda às perguntas a seguir sobre um crime: ");

		do {
			System.out.print("Telefonou para a vítima [s/n]: ");
			resp = scan.next().charAt(0);

			if (resp == 'S' || resp == 's') {
				sim++;
			}
		} while (resp != 'S' && resp != 's' && resp != 'N' && resp != 'n');
		
		do {
			System.out.print("Esteve no local do crime [s/n]: ");
			resp = scan.next().charAt(0);

			if (resp == 'S' || resp == 's') {
				sim++;
			}
		} while (resp != 'S' && resp != 's' && resp != 'N' && resp != 'n');

		do {
			System.out.print("Mora perto da vítima [s/n]: ");
			resp = scan.next().charAt(0);

			if (resp == 'S' || resp == 's') {
				sim++;
			}
		} while (resp != 'S' && resp != 's' && resp != 'N' && resp != 'n');
		
		do {
			System.out.print("Devia para a vítima [s/n]: ");
			resp = scan.next().charAt(0);

			if (resp == 'S' || resp == 's') {
				sim++;
			}
		} while (resp != 'S' && resp != 's' && resp != 'N' && resp != 'n');
		
		do {
			System.out.print("Já trabalhou com a vítima [s/n]: ");
			resp = scan.next().charAt(0);

			if (resp == 'S' || resp == 's') {
				sim++;
			}
		} while (resp != 'S' && resp != 's' && resp != 'N' && resp != 'n');
		
		System.out.println();
		
		if(sim == 2) {
			System.out.println("Classificação: Suspeito(a).");
		} else if(sim == 3 || sim == 4) {
			System.out.println("Classificação: Cúmplice.");
		} else if(sim == 5) {
			System.out.println("Classificação: Assassino(a).");
		} else {
			System.out.println("Classificação: Inocente.");
		}
	}

}
