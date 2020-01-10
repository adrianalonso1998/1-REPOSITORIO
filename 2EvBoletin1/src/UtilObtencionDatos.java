

import java.util.Scanner;

public class UtilObtencionDatos {

	public static int obtenerValorEntero(String mensaje)
	{
		Scanner sc;
		sc = new Scanner(System.in);
		boolean valorCorrecto = true;
		int a = 0;
				
		do {
			System.out.println(mensaje);
			if (sc.hasNextInt())
			{
				a = sc.nextInt();
			
	
				if (a <= 0)
				{
					System.out.println(" introduce número  positivo ");
					valorCorrecto=false;
				}
				if(a>0)
				{
					valorCorrecto=true;
				}
			}
			else 
			{
				sc.next();
				valorCorrecto=false;				
				System.out.println(" Introduce número entero ");
			}

		} while (valorCorrecto == false);

		return a;
	}//metodo
}
