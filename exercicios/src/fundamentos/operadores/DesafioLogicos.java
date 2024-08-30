package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {

		boolean trabalho1 = true;
		boolean trabalho2 = true;

		if (trabalho1 == true && trabalho2 == true) {
			System.out.println("uhulll tv de 50´, bora no shopping tomar sorverte ");
		} else if (trabalho1 == true || trabalho2 == true) {
			System.out.println("uhulll tv de 32´, bora no shopping tomar sorverte ");
		} else {
			System.out.println("Deu Ruim nem tv nem sorvete! kkkk");
		}

		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;

		boolean maisSAudavel = !comprouSorvete;

		System.out.println("Comprou TV 50\"?" + comprouTV50);
		System.out.println("Comprou TV 32\"?" + comprouTV32);
		System.out.println("Comprout sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSAudavel);

	}

}
