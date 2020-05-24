/**
 * TALLER 1 - CORTE 3 - ALEJANDRO POTOSI MORENO
 */
package matriz;

/**
 * @author apotosi
 *
 */
public class Validar {
	// DEFINICION VARIABLES
	String informacion;
	int valorValidado;
	// FIN DEFINICION VARIABLES

	// VALIDAR DATOS
	public void validadorDatos(String valor) {
		try {
			if ((Integer.parseInt(valor) >= 0) || ((Integer.parseInt(valor) <= 0))) {
				valorValidado = Integer.parseInt(valor);
				informacion = "El valor " + valor + " se asigno correctamente";
			}
		} catch (Exception e) {
			informacion = "error";
		}

	}
	// FIN VALIDAR DATOS

	// VALIDAR TAMAÑO MATRIZ
	public boolean validadorTamano(String valor) {
		try {
			if (Integer.parseInt(valor) > 0) {
				valorValidado = Integer.parseInt(valor);
				return true;
			} else {
				System.out.println("\nError, el valor debe ser numero entero mayor a 0\n");
				return false;

			}

		} catch (Exception e) {
			System.out.println("\nError, el valor debe ser numero entero mayor a 0\n");
			return false;
		}
	}
	// FIN VALIDAR TAMAÑO MATRIZ

	//VALIDAR OPERACION SUMA O RESTA
	public boolean validarSumaResta(int[][] matrizA, int[][] matrizB, String operacion) {

		if ((matrizA.length == matrizB.length) && (matrizA[0].length == matrizB[0].length)) {
			return true;
		} else {
			System.out.println("\nNo se puede realizar la " + operacion + " debido a lo siguiente:");
			System.out
					.println("Para " + operacion + "r matrices el tamaño de la matriz A y matriz B deben ser iguales");
			System.out.println("");
			System.out.println("Matriz A: Filas " + matrizA.length + " Columnas " + matrizA[0].length);
			System.out.println("Matriz B: Filas " + matrizB.length + " Columnas " + matrizB[0].length);
			System.out.println("");
			System.out.println("No se cumple la condicion\n");

			return false;
		}

	}
	//FIN VALIDAR OPERACION SUMA O RESTA
	
	//VALIDAR OPERACION MULTIPLICACION
	public boolean validarMultiplicacion(int[][] matrizA, int matrizB[][]) {

		if (matrizA[0].length == matrizB.length) {
			return true;
		} else {
			System.out.println("\nNo se puede realizar la multiplicacion debido a lo siguiente:");
			System.out.println(
					"Para multiplicar matrices el tamaño de columnas de la matriz A debe ser igual al numero de filas de la matriz B");
			System.out.println("");
			System.out.println("Matriz A: Columnas " + matrizA[0].length);
			System.out.println("Matriz B: Filas " + matrizB.length);
			System.out.println("");
			System.out.println("No se cumple la condicion Matriz A de tamaño (a*b) Matriz B tamaño (b*c)\n");
			return false;
		}

	}
	//FIN VALIDAR OPERACION MULTIPLICACION
}
