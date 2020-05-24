/**
 * TALLER 1 - CORTE 3 - ALEJANDRO POTOSI MORENO
 */
package matriz;

import java.util.Scanner;

/**
 * @author apotosi
 *
 */
public class Main {

	public static void main(String[] args) {
		//DEFINICION DE VARIABLES
		Scanner teclado = new Scanner(System.in);
		String tempTamanoFilas;
		String tempTamanoColumnas;
		String menuOperacion = null;
		
		int matrizA[][] = new int[0][0];
		int matrizB[][] = new int[0][0];
		int matrizC[][] = new int[0][0];
		
		boolean siguiente = false;
		//FIN DEFINICION DE VARIABLES
		
		//INSTANCIA DE CLASES
		Construir construir = new Construir();
		Pintar pintar = new Pintar();
		Validar validar = new Validar();
		Operaciones operaciones = new Operaciones();
		//FIN INSTANCIA DE CLASES
		
		//INICIO PROGRAMA
		while (siguiente == false) {
			
			//INGRESO Y VALIDACION TAMAÑO MATRIZ A
			while (siguiente == false) {
				System.out.println("Por favor indique el tamaño deseado de la matriz A");
				System.out.print("Numero de filas: ");
				tempTamanoFilas = teclado.nextLine();
				if (validar.validadorTamano(tempTamanoFilas) == true) {
					System.out.print("Numero de columnas: ");
					tempTamanoColumnas = teclado.nextLine();
					if (validar.validadorTamano(tempTamanoColumnas) == true) {
						matrizA = new int[Integer.parseInt(tempTamanoFilas)][Integer.parseInt(tempTamanoColumnas)];
						siguiente = true;
					}
				}
			}
			siguiente = false;
			//FIN INGRESO VALIDACION TAMAÑO MATRIZ A
			
			//INGRESO Y VALIDACION TAMAÑO MATRIZ B			
			while (siguiente == false) {
				System.out.println("\nPor favor indique el tamaño deseado de la matriz B");
				System.out.print("Numero de filas: ");
				tempTamanoFilas = teclado.nextLine();
				if (validar.validadorTamano(tempTamanoFilas) == true) {
					System.out.print("Numero de columnas: ");
					tempTamanoColumnas = teclado.nextLine();
					if (validar.validadorTamano(tempTamanoColumnas) == true) {
						matrizB = new int[Integer.parseInt(tempTamanoFilas)][Integer.parseInt(tempTamanoColumnas)];
						siguiente = true;
					}
				}
			}
			siguiente = false;
			//FIN INGRESO Y VALIDACION TAMAÑO MATRIZ A
			
			//MENU OPERACIONES DE MATRIZ
			System.out.println("\nIndique que tipo de operacion desea realizar\n" + "-Para sumar, presione 1\n"
					+ "-Para restar, presione 2\n" + "-Para multiplicar, presione 3\n"
					+ "Para continuar presione enter...");
			menuOperacion = teclado.nextLine();

			switch (menuOperacion) {
			case "1":
				if (validar.validarSumaResta(matrizA, matrizB, "Suma") == true) {
					matrizA = construir.GenerarMatriz(matrizA, "A");
					matrizB = construir.GenerarMatriz(matrizB, "B");
					matrizC = operaciones.suma(matrizA, matrizB);
					siguiente = true;
				} else {
					siguiente = false;
				}
				break;
			case "2":
				if (validar.validarSumaResta(matrizA, matrizB, "Resta") == true) {
					matrizA = construir.GenerarMatriz(matrizA, "A");
					matrizB = construir.GenerarMatriz(matrizB, "B");
					matrizC = operaciones.resta(matrizA, matrizB);
					siguiente = true;

				} else {
					siguiente = false;
				}
				break;
			case "3":
				if (validar.validarMultiplicacion(matrizA, matrizB) == true) {
					matrizA = construir.GenerarMatriz(matrizA, "A");
					matrizB = construir.GenerarMatriz(matrizB, "B");
					matrizC = operaciones.multiplicacion(matrizA, matrizB);
					siguiente = true;

				} else {
					siguiente = false;
				}
				break;
			default:
				System.out.println("Ingrese una opcion valida");
				siguiente = false;

			}
			//FIN MENU OPERACIONES DE MATRIZ
		}
		//PINTAR MATRICES
		pintar.Pintar(matrizA, "A", "");
		pintar.Pintar(matrizB, "B", "");
		System.out.println("\nRESULTADO \n");
		pintar.Pintar(matrizC, "C", menuOperacion);
		//FIN PINTAR MATRICES

	}
	//FIN PROGRAMA
}
