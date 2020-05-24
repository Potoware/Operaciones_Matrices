/**
 * TALLER 1 - CORTE 3 - ALEJANDRO POTOSI MORENO
 */
package matriz;

/**
 * @author apotosi
 *
 */
public class Pintar {
	
	public void Pintar(int[][] matriz, String lMatriz,String oMatriz) {
		try {
		int nFilas = matriz.length;
		int nColumnas = matriz[0].length;
		
	// PINTAR MATRIZ
	
		switch(oMatriz){
		case "1":  
			System.out.println("Matriz C = Matriz A + Matriz B");
		break;
		case "2":
			System.out.println("Matriz C = Matriz A - Matriz B");
		break;
		case "3":
			System.out.println("Matriz C = Matriz A * Matriz B");
		break;
		}
		
		System.out.println("\nMatriz " + lMatriz);
		// RECORRIDO FILAS
		for (int ifil = 0; ifil < nFilas; ifil++) {
			System.out.print("|");
			// RECORRIDO COLUMNAS
			for (int jcol = 0; jcol < nColumnas; jcol++) {
				System.out.print(" "+matriz[ifil][jcol]+" ");
				if (jcol != nFilas - 1) {
					System.out.print("\t");
				}
			}
			// FIN RECORRIDO COLUMNAS
			System.out.println("|");
		}
		// FIN RECORRIDO FILAS

		// FIN PINTAR MATRIZ
	}catch(Exception e) {
		System.out.println("No se puede pintar la matriz");	
	}
		
	}

}
