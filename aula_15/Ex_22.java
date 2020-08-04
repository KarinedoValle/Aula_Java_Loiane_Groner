package Aula_15;

import java.util.Scanner;

public class Ex_22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double morango, maca, preco = 0;
		
		System.out.print("Digite a quantidade de morangos adquiridos em quilos: ");
		morango = scan.nextDouble();
		System.out.print("Digite a quantidade de maçãs adquiridas em quilos: ");
		maca = scan.nextDouble();
		
		if(morango <= 5) {
			preco += (morango * 2.5);
		} else if(morango > 5) {
			preco += (morango * 2.2);
		}
			
		if(maca <= 5) {
			preco += (maca * 1.8);
		} else if(maca > 5) {
			preco += (maca * 1.5);
		}
		
		if((morango + maca > 8) || (preco > 25)) {
			preco -= (preco*10/100);
		} 
		
		System.out.println("\nO valor a ser pago pelo cliente é: " + preco);
		
	}

}
