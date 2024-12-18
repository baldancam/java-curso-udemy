package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String texto = "";

		do {

			System.out.println("Diga as palavras mágicas...");
			System.out.print("Quer sair?");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("sim"));

		System.err.println("saiu mané!");
		entrada.close();

	}

}
