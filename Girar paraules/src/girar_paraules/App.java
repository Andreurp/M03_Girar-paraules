package girar_paraules;

import java.util.Scanner;

public class App {

	private static Scanner llegir;

	public static void main(String[] args) {
		String CadenaEntrada, CadenaSortida;
		String[] talls;
		
		CadenaSortida="";
		
		System.out.println("Escriu una frase");
		llegir = new Scanner(System.in);
		CadenaEntrada = llegir.nextLine();
		talls = CadenaEntrada.split(" ");
		for (int i=talls.length-1;i>=0;i--) {
			CadenaSortida = CadenaSortida + talls[i] + " ";
		}
		System.out.println(CadenaSortida);
	}

}