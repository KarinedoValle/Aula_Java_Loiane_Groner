package aula_13;

import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numero;
		
		System.out.print("Digite o tamanho em metros: ");
		numero = scan.nextDouble();
		
		System.out.println("Este mesmo tamanho em centímetros é: " + (numero*100));
	}
}
