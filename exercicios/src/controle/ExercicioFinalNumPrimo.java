package controle;

import java.util.Scanner;

public class ExercicioFinalNumPrimo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (isPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }

    public static boolean isPrimo(int n) {
        if (n <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Se for divisível por i, não é primo
            }
        }
        return true; // Não foi divisível por nenhum número

	}

}
