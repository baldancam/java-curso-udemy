package controle;

import java.util.Scanner;

public class ExercicioFinalValidarPar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int NumberEntrada = entrada.nextInt();
		
		if(NumberEntrada % 2 == 0) {
			System.out.println(NumberEntrada + " é PAR!");
		} else {
			System.out.println(NumberEntrada + " não é PAR!");
		}
		
		
		
		entrada.close();

	}

}
