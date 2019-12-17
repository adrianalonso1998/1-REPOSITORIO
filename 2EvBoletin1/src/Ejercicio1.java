import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto = null;
		texto = obtenerTexto(texto);
		char[] miArray = new char[texto.length()];
		miArray = obtenerArray(texto);
		imprimirArray(miArray);
		sc.close();

	}// main

	private static String obtenerTexto(String texto) {
		Scanner sc = new Scanner(System.in);
		String textoDevuelto = sc.nextLine();
		sc.close();
		return textoDevuelto;
	}

	private static char[] obtenerArray(String texto) {
		char[] miArray2 = texto.toCharArray();
		return miArray2;
	}

	private static void imprimirArray(char[] miArray) {
		for (int i = 0; i < miArray.length; i++) {
			System.out.println(miArray[i]);
		}
	}

}// class
