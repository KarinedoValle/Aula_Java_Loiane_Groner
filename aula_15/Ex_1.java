package aula_15;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n1, n2;
		
		System.out.print("Digite o primeiro n�mero: ");
		n1 = scan.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		n2 = scan.nextDouble();
		
		if (n1 > n2) {
			System.out.println("\nO maior n�mero digitado foi: " + n1);
		} else if (n2 > n1) {
			System.out.println("\nO maior n�mero digitado foi: " + n2);
		} else {
			System.out.println("\nOs n�meros s�o iguais.");
		}

	}

}
