package aula_13;

import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double raio, area;
		
		System.out.print("Digite o raio do círculo: ");
		raio = scan.nextDouble();
		
		area = Math.PI * Math.pow(raio,2);

		System.out.println("A área de um círculo de raio " + raio + " é: " + area);
	}

}
