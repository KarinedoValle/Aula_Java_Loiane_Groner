package aula_15;

import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n1, n2, n3;
		
		System.out.print("Digite o primeiro n�mero: ");
		n1 = scan.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		n2 = scan.nextDouble();
		System.out.print("Digite o terceiro n�mero: ");
		n3 = scan.nextDouble();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("\nO maior n�mero �: " + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("\nO maior n�mero �: " + n2);
		} else if (n3 > n1 && n3 > n2) {
			System.out.println("\nO maior n�mero �: " + n3);
		} else {
			System.out.println("\nOs n�mero s�o iguais.");
		}
		
	

	}

}
