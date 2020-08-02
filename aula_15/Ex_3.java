package aula_15;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 char sexo;
		 
		 System.out.print("Digite o sexo: ");
		 sexo = scan.next().charAt(0);
		 
		 if (sexo == 'F' || sexo == 'f') {
			 System.out.println("\nSexo feminino.");
		 } else if (sexo == 'M' || sexo == 'm') {
			 System.out.println("\nSexo masculino.");
		 } else {
			 System.out.println("\nSexo inválido.");
		 }

	}

}
