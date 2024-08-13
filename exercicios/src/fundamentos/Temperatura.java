package fundamentos;

public class Temperatura {

	public static void main(String[] args) {

		// (ºF - 32) * 5/9 = ºC

		final int AJUSTE = 32;
		final double FATOR = 5 / 9.0;

		double fahrenheit = 86;
		double conversao = (fahrenheit - AJUSTE) * FATOR;

		System.out.println(conversao + "ºC");

		fahrenheit = 0;
		conversao = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println(conversao + "ºC");
	}

}
