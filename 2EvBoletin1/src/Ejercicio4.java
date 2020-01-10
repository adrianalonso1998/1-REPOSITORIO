
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = crearArray();
		rellenarArray(array);
		calcularEImprimir(array);
	}// main

	private static int[][] crearArray() {
		int filas;
		int columnas;

		System.out.println("Indica el valor de dimension para las filas:");
		filas = UtilObtencionDatos.obtenerValorEntero("indica un valor entero positivo");
		System.out.println("Indica el valor de dimension para las columnas:");
		columnas = UtilObtencionDatos.obtenerValorEntero("indica un valor entero positivo");

		int[][] array = new int[filas][columnas];
		return array;
	}//crearArray

	private static int[][] rellenarArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				int valor = UtilObtencionDatos.obtenerValorEntero(String.format("Indica el valor [%d][%d]", i, j));
				array[i][j] = valor;
			}
		}
		return array;
	}//rellenaeArray

	private static void calcularEImprimir(int[][]array)
	{
		int suma;
		for(int i=0;i<array.length;i++)
		{
			suma=0;
			for(int j=0; j<array[i].length;j++) 
			{
				suma=suma+array[i][j];
			}
			System.out.printf("La suma para la fila %d es %d\n",i,suma);
			
		}
	}
	
	
}// class
