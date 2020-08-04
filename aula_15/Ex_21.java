package Aula_15;

import java.util.Scanner;

public class Ex_21 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double litros, preco = 0;
		char tipo;
		
		System.out.print("Digite o número de litros vendidos: ");
		litros = scan.nextDouble();
		System.out.print("Digite o tipo de combustível vendido [A - Álcool ou G - Gasolina]: ");
		tipo = scan.next().charAt(0);
		
		if(tipo == 'A' || tipo == 'a') {
			preco = litros * 1.9;
			if(litros <= 20) {
				preco -= (preco * 3/100);
			} else if(litros > 20) {
				preco -= (preco * 5/100);
			}
		} else if(tipo == 'G' || tipo == 'g') {
			preco = litros * 2.5;
			if(litros > 20) {
				preco -= (preco * 6/100);
			} 
		} else {
			System.out.println("\nTipo de combustível inválido.");
		}
		
		System.out.println("\nO valor a ser pago pelo cliente é: R$ " + preco + ".");
		
		
	} 

}
