package aula_13;

import java.util.Scanner;

public class Ex_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double grausF, grausC;
		
		System.out.print("Digite a temperatura em Farenheit: ");
		grausF = scan.nextDouble();
		
		grausC = (5 * (grausF-32)/9);
		
		System.out.println(" " + grausF + "� Farenheit convertido para Celsius �: " + grausC + "�C");

	}

}
