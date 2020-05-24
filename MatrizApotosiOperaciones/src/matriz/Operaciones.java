/**
 * TALLER 1 - CORTE 3 - ALEJANDRO POTOSI MORENO
 */
package matriz;

/**
 * @author apotosimo, walbarracinro
 *
 */
public class Operaciones {

	// SUMA MATRIZ
	public int[][] suma(int[][] matrizA, int matrizB[][]) {

		int nFilas = matrizA.length;
		int nColumnas = matrizA[0].length;
		int matrizC[][] = new int[nFilas][nColumnas];

		for (int ifil = 0; ifil < nFilas; ifil++) {

			for (int jcol = 0; jcol < nColumnas; jcol++) {
				matrizC[ifil][jcol] = matrizA[ifil][jcol] + matrizB[ifil][jcol];
			}
		}

		return matrizC;
	}
	// FIN SUMA MATRIZ

	// RESTA MATRIZ
	public int[][] resta(int[][] matrizA, int matrizB[][]) {
		int nFilas = matrizA.length;
		int nColumnas = matrizA[0].length;
		int matrizC[][] = new int[nFilas][nColumnas];

		for (int ifil = 0; ifil < nFilas; ifil++) {

			for (int jcol = 0; jcol < nColumnas; jcol++) {
				matrizC[ifil][jcol] = matrizA[ifil][jcol] - matrizB[ifil][jcol];
			}
		}
		return matrizC;
	}
	// FIN RESTA MATRIZ

	// MULTIPLICACION MATRIZ
	public int[][] multiplicacion(int[][] matrizA, int matrizB[][]) {

		int matrizC[][] = new int[matrizA.length][matrizB[0].length];
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
				for (int k = 0; k < matrizA[0].length; k++) {

					matrizC[i][j] = matrizC[i][j] + matrizA[i][k] * matrizB[k][j];
				}
			}
		}
		System.out.println(matrizC[0][0]);
		return matrizC;

	}
	// FIN MULTIPLICACION

}
