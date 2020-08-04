package Aula_15;

import java.util.Scanner;

public class Ex_20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char resp, sim = 0;

		System.out.println("Responda �s perguntas a seguir sobre um crime: ");

		do {
			System.out.print("Telefonou para a v�tima [s/n]: ");
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
			System.out.print("Mora perto da v�tima [s/n]: ");
			resp = scan.next().charAt(0);

			if (resp == 'S' || resp == 's') {
				sim++;
			}
		} while (resp != 'S' && resp != 's' && resp != 'N' && resp != 'n');
		
		do {
			System.out.print("Devia para a v�tima [s/n]: ");
			resp = scan.next().charAt(0);

			if (resp == 'S' || resp == 's') {
				sim++;
			}
		} while (resp != 'S' && resp != 's' && resp != 'N' && resp != 'n');
		
		do {
			System.out.print("J� trabalhou com a v�tima [s/n]: ");
			resp = scan.next().charAt(0);

			if (resp == 'S' || resp == 's') {
				sim++;
			}
		} while (resp != 'S' && resp != 's' && resp != 'N' && resp != 'n');
		
		System.out.println();
		
		if(sim == 2) {
			System.out.println("Classifica��o: Suspeito(a).");
		} else if(sim == 3 || sim == 4) {
			System.out.println("Classifica��o: C�mplice.");
		} else if(sim == 5) {
			System.out.println("Classifica��o: Assassino(a).");
		} else {
			System.out.println("Classifica��o: Inocente.");
		}
	}

}
