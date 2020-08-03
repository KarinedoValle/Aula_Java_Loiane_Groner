package aula_15;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double salarioI, salarioF = 0;
		double percentual = 0;
		
		System.out.print("Digite o salário do colaborador: ");
		salarioI = scan.nextDouble();
		
		if(salarioI <= 280) {
			salarioF = salarioI + (salarioI * 0.2);
			percentual = 20;
		} else if(salarioI > 280 && salarioI <= 700) {
			salarioF = salarioI + (salarioI * 0.15);
			percentual = 15;
		} else if(salarioI > 700 && salarioI <= 1500) {
			salarioF = salarioI + (salarioI * 0.1);
			percentual = 10;
		} else if (salarioI > 1500) {
			salarioF = salarioI + (salarioI * 0.05);
			percentual = 5;
		}
		
		System.out.println("\nSalário do colaborador antes do reajuste: " + salarioI);
		System.out.println("Percentual aplicado: " + percentual + "%");
		System.out.println("Valor do aumento: " + (salarioI * percentual / 100));
		System.out.println("Salário depois do reajuste: " + salarioF);

	}

}
