package aula_13;

import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valorHora, horasMes;
		
		System.out.print("Digite o valor que voc� ganha por hora: ");
		valorHora = scan.nextDouble();
		System.out.print("Digite quantas horas voc� trabalhou neste m�s: ");
		horasMes = scan.nextDouble();
		
		System.out.println("O valor do seu sal�rio para este m�s �: " + (valorHora*horasMes));
		

	}

}
