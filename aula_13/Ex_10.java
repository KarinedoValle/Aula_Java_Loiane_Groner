package aula_13;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double grausC, grausF;
		
		System.out.print("Digite a temperatura em Celsius: ");
		grausC = scan.nextDouble();
		
		grausF = (grausC*9/5 + 32);
		
		System.out.println(" " + grausC + "º Celsius convertido para Farenheit é: " + grausF + "ºF");

	}

}
