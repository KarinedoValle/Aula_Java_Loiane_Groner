package aula_13;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double altura, pesoIdeal;
		
		System.out.print("Digite sua altura: ");
		altura = scan.nextDouble();
		
		pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal é: " + pesoIdeal);

	}

}
