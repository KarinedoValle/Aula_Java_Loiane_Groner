package aula_15;

import java.util.Scanner;

public class Ex_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double lado1, lado2, lado3;
		boolean triangulo;
		
		System.out.print("Digite o valor do primeiro lado: ");
		lado1 = scan.nextDouble();
		System.out.print("Digite o valor do segundo lado: ");
		lado2 = scan.nextDouble();
		System.out.print("Digite o valor do terceiro lado: ");
		lado3 = scan.nextDouble();
		
		if(((lado1+lado2)>lado3) && ((lado1+lado3)>lado2) && ((lado2+lado3)>lado1)) {
			triangulo = true;
		} else {
			triangulo = false;
			System.out.println("N�o � um tri�ngulo.");
		}
		
		if(triangulo) {
			if(lado1 == lado2 && lado2 == lado3) {
				System.out.println("\nEste � um tri�ngulo equil�tero.");
			} else if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
				System.out.println("\nEste � um tri�ngulo escaleno.");
			} else {
				System.out.println("\nEste � um tri�ngulo is�sceles.");
			}
		}

	}

}
