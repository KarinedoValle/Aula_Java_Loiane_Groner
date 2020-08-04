package Aula_15;

import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int op;
		double quantidade, preco = 0, desc = 0.00;
		char cartao = '-';
		String carne = "--", resp = "--";

		System.out.println("Escolha qual carne deseja comprar: ");
		System.out.println("1 - Fil� duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		System.out.print("Op��o: ");
		op = scan.nextInt();

		// Op��o inv�lida para as carnes
		if (op < 1 || op > 3) {
			System.out.println("\nOp��o inv�lida.");

		} else {

			System.out.print("Digite a quantidade que deseja comprar em quilos: ");
			quantidade = scan.nextDouble();

			System.out.print("A compra ser� feita com o cart�o Tabajara [S/N]? ");
			cartao = scan.next().charAt(0);

			// Op��o inv�lida para os cart�es
			if (cartao != 'S' && cartao != 's' && cartao != 'N' && cartao != 'n') {
				System.out.println("\nOp��o inv�lida.");

			} else {
				if (quantidade <= 5) {

					switch (op) {
					case 1:
						carne = "Fil� duplo";
						preco = quantidade * 4.9;
						break;
					case 2:
						carne = "Alcatra";
						preco = quantidade * 5.9;
						break;
					case 3:
						carne = "Picanha";
						preco = quantidade * 6.9;
						break;
					}

				} else if (quantidade > 5) {
					switch (op) {
					case 1:
						carne = "Fil� duplo";
						preco = quantidade * 5.8;
						break;
					case 2:
						carne = "Alcatra";
						preco = quantidade * 6.8;
						break;
					case 3:
						carne = "Picanha";
						preco = quantidade * 7.8;
						break;
					}

					if (cartao == 'S' || cartao == 's') {
						desc = preco * 5 / 100;
						preco -= desc;
						resp = "Sim";
					} else {
						resp = "N�o";
					}

					System.out.println("\n----------Cupom Fiscal----------");
					System.out.println("Carne escolhida: " + carne);
					System.out.println("Quantidade adquirida: " + quantidade);
					System.out.println("Utilizou o cart�o Tabajara: " + resp);
					System.out.println("Valor do desconto: " + desc);
					System.out.println("valor a pagar: " + preco);
				}
			}
		}
	}
}
