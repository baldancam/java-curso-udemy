package controle;

import java.util.Scanner;

public class DesafioWhile1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Palavra magica: ");

		String valor = "";

		while (!valor.equalsIgnoreCase("porfavor")) {

			valor = entrada.next();

			System.out.print("Palavra magica: ");

		}

		System.out.println("Fim");
		entrada.close();
	}
}
