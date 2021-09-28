package pedrapapeltesoura;

import java.util.Scanner;

public class Jogo {
	public static void main(String[] args) {
		int jogador, computador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("__The_Game__");
		System.out.println("");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.print("Digite a opção desejada: ");

		jogador = teclado.nextInt();
		System.out.println("");
		switch (jogador) {
		case 1:
			System.out.println("jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("jogador escolheu TESOURA");
			break;
		default:
			System.out.println("Opção inválida.");
			break;

		}

		computador = (int) (Math.random() * 3 + 1);
		teclado.close();
		switch (computador) {
		case 1:
			System.out.println("computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("computador escolheu TESOURA");
			break;

		}

		System.out.println();
		if (jogador == computador) {
			System.out.println("EMPATE");
		} else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
					|| (jogador == 3 && computador == 2)) {
				System.out.println("JOGADOR VENCEU");
			} else {
				System.out.println("COMPUTADOR VENCEU");
			}
		}
	}
}
