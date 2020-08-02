package aula_15;

import java.util.Scanner;

public class Ex_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n1, n2, n3, maior = 0, menor = 0, meio = 0;
		
		System.out.print("Digite o primeiro número: ");
		n1 = scan.nextDouble();
		System.out.print("Digite o segundo número: ");
		n2 = scan.nextDouble();
		System.out.print("Digite o terceiro número: ");
		n3 = scan.nextDouble();
		
		if (n1 > n2 && n1 > n3) {
			maior = n1;
		} else if (n2 > n1 && n2 > n3) {
			maior = n2;
		} else if (n3 > n1 && n3 > n2) {
			maior = n3;
		} 
		
		if (n1 < n2 && n1 < n3) {
			menor = n1;
		} else if (n2 < n1 && n2 < n3) {
			menor = n2;
		} else if (n3 < n1 && n3 < n2) {
			menor = n3;
		} 

		if (n1 != maior && n1 != menor){
			meio = n1;
		} else if (n2 != maior && n2 != menor){
			meio = n2;
		} else if (n3 != maior && n3 != menor){
			meio = n3;
		}
		
		System.out.println("\nNúmeros digitados em ordem decrescente: " + maior + ", " + meio + ", " + menor + ".");
	}
}