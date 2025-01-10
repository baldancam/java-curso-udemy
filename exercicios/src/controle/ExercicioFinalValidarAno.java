package controle;

import java.util.Calendar;

public class ExercicioFinalValidarAno {

	public static void main(String[] args) {
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        if ((anoAtual % 4 == 0 && anoAtual % 100 != 0) || (anoAtual % 400 == 0)) {
            System.out.println(anoAtual + " é um ano bissexto.");
        } else {
            System.out.println(anoAtual + " não é um ano bissexto.");
        }

	}

}
