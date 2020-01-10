import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = obtenerTexto();
		String[][] array = obtenerArrayConteo(texto);
		imprimir(array);

	}// main

	private static String obtenerTexto() {
		System.out.println("Introduce un texto");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}/// obtenerTexto

	private static void imprimir(String[][] array) {
		System.out.println("Resultado conteo");
		for (int i = 0; i < array[0].length; i++) {
			if (array[0][i] != null && " ".compareTo(array[0][i]) != 0) {
				System.out.printf("El caracter %s aparece %s veces\n", array[0][i], array[1][i]);
			}
		}
		// System.out.println(Arrays.deepToString(array));
	}// imprimir

	private static int obtenerNumeroApariciones(char c, String texto) {
		int cont = 0;
		for (int i = 0; i < texto.length(); i++) {
			if (Character.compare(c, texto.charAt(i)) == 0)
				cont++;
		}
		return cont;
	}// obtenerNumeroApariciones

	private static boolean existeCaracter(char c, String[] array) {
		boolean existe = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null && array[i].charAt(0) == c) {
				existe = true;
				break;
			}
		}
		return existe;
	}

	private static String[][] obtenerArrayConteo(String texto) {
		String[][] arrayConteo = new String[2][texto.length()];
		int posInsert = 0;
		for (int i = 0; i < texto.length(); i++)// recorrer texto
		{
			char caracter = texto.charAt(i);
			if (!existeCaracter(caracter, arrayConteo[0])) {
				arrayConteo[0][posInsert] = String.valueOf(caracter);
				arrayConteo[1][posInsert] = String.valueOf(obtenerNumeroApariciones(caracter, texto));
				posInsert++;
			}
		}
		return arrayConteo;
	}

}
