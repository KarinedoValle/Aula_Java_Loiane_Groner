package aula_15;

import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double a = 0, b = 0, c = 0, delta, x1, x2;

		System.out.print("Digite o valor de 'a': ");
		a = scan.nextDouble();

		// Testa se a==0 e mostra uma mensagem de erro
		if (a == 0) {
			System.out.println("\n'a' não pode ser igual a zero. Tente novamente!\n");
		} else {

			System.out.print("Digite o valor de 'b': ");
			b = scan.nextDouble();
			System.out.print("Digite o valor de 'c': ");
			c = scan.nextDouble();

			delta = Math.pow((b), 2) - (4 * (a) * (c));
			x1 = (-(b) + Math.sqrt(delta)) / (2 * (a));
			x2 = (-(b) - Math.sqrt(delta)) / (2 * (a));

			System.out.println();

			System.out.println("A equação calculada foi: \n(" + a + ")x² + (" + b + ")x + (" + c + ") = 0\n\n");

			if (delta < 0) {
				System.out.println("Não existem raízes reais.");
			} else {
				System.out.println("x1 = " + x1 + "\n");
				System.out.println("x2 = " + x2 + "\n");
			}
		}
	}

}
