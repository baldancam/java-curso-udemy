package controle;

import java.util.Scanner;

public class TesteDesafio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidade = entrada.nextInt();

		String palavra = "";

		for (int i = 1; i <= quantidade; i++) {

			palavra += "Ho";
			if (i < quantidade) {
				palavra += " ";
			}
		}

		System.out.println(palavra + "!");

		entrada.close();

	}

}
