package aula_15;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double nota1, nota2, media;
		String conceito = "";
		
		System.out.print("Digite a primeira nota parcial: ");
		nota1 = scan.nextDouble();
		System.out.print("Digite a segunda nota parcial: ");
		nota2 = scan.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		if(media > 9 && media <= 10) {
			conceito = "A";
		} else if(media > 7.5 && media <= 9) {
			conceito = "B";
		} else if(media > 6 && media <= 7.5) {
			conceito = "C";
		} else if(media > 4 && media <= 6) {
			conceito = "D";
		} else if(media > 0 && media <= 4) {
			conceito = "E";
		}
		
		
		System.out.println("\nNotas 1: " + nota1 + ", Nota 2: " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);
		
switch (conceito) {
		
		case "A":
			System.out.println("Aprovado!");
			break;
		case "B":
			System.out.println("Aprovado!");
			break;
		case "C":
			System.out.println("Aprovado!");
			break;
		case "D":
			System.out.println("Reprovado!");
			break;
		case "E":
			System.out.println("Reprovado!");
			break;
		default:
			System.out.println("--");
		}
		

	}

}
