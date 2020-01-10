
public class Ejercicio2 {

	public static void main(String[] args) {
		int[] arrayDesordenado = { 121, 24, 1, 258, 0, -3, 8 };
		/* int[] arrayOrdenado = obtenerArrayOrdenado(arrayDesordenado); */
		int[] arrayOrdenado = obtenerArrayOrdenadoPares(arrayDesordenado);
		imprimirArray(arrayOrdenado);
		

	}// main

	private static void imprimirArray(int[] array) {
		for (int c : array) {
			System.out.print(" " + c);
		}
	}

	private static int[] obtenerArrayOrdenado(int[] arrayDesordenado) {
		int[] arrayOrdenado = new int[arrayDesordenado.length];
		int vMax = Integer.MIN_VALUE;
		int posMax = -1;
		int posInser = 0;
		for (int i = 0; i < arrayDesordenado.length; i++) {
			for (int j = 0; j < arrayDesordenado.length; j++) {
				if (vMax < arrayDesordenado[j]) {
					vMax = arrayDesordenado[j];
					posMax = j;
				}

			}
			// vMax y posMax tienen el valor maximo y su posicion
			arrayOrdenado[posInser] = vMax;
			arrayDesordenado[posMax] = Integer.MIN_VALUE;
			posInser++;
			vMax = Integer.MIN_VALUE;
		}
		return arrayOrdenado;
	}

	private static int[] obtenerArrayOrdenadoPares(int[] arrayDesordenado) {
		for (int i = 0; i < arrayDesordenado.length; i++) {
			for (int j = i + 1; j < arrayDesordenado.length; j++) {
				if (arrayDesordenado[i] < arrayDesordenado[j]) {
					int vAux = arrayDesordenado[j];
					arrayDesordenado[j] = arrayDesordenado[i];
					arrayDesordenado[i] = vAux;
				}
			}
		}
		return arrayDesordenado;
	}// obtenerArrayOrdenadoPares

}// class
