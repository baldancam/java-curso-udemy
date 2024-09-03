package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {

		double media = 7.99;

		String resultadoParcial = media >= 5.0 ? "Recuperação!" : "Reprovado!";
		String resultadoFinal = media >= 7.0 ? "Aprovado!" : resultadoParcial;

		System.out.println("Resultado final: " + resultadoFinal);

	}

}
