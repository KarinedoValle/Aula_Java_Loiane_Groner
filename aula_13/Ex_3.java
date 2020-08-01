package aula_13;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n1, n2;
		
		System.out.print("Digite o primeiro número: ");
		n1 = scan.nextDouble();
		System.out.print("Digite o segundo número: ");
		n2 = scan.nextDouble();
		System.out.println("A soma dos números digitados é: " + (n1+n2));


	}

}
