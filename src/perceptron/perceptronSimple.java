package perceptron;

import java.util.InputMismatchException;
import java.util.Scanner;

public class perceptronSimple {

	float peso = 0;
	static int n=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		float[][] matriz = { { 1.58f, 55, 1 }, { (float) 1.60, 50, 1 }, { (float) 1.65, 54, 1 },
				{ (float) 1.70, 56, 1 }, { (float) 1.70, 63, 0 }, { (float) 1.72, 63, 0 }, { (float) 1.74, 66, 0 },
				{ (float) 1.82, 70, 0 }, { (float) 1.83, 80, 0 } };
		
		int opcion; // Guardaremos la opcion del usuario

		while (!salir) {

			System.out.println("1. Entrenar");
			System.out.println("2. Probar");
			System.out.println("3. Salir");

			try {

				System.out.println("Escribe una de las opciones");
				opcion = sn.nextInt();

				switch (opcion) {
				case 1:
					System.out.println("Has seleccionado la opcion 1");
					perceptron(matriz);
					break;
				case 2:
					System.out.println("Has seleccionado la opcion 2");
					break;
				case 3:
					System.out.println("Has seleccionado la opcion 3");
					break;
				case 4:
					salir = true;
					break;
				default:
					System.out.println("Solo números entre 1 y 4");
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un número");
				sn.next();
			}
		}

	}

	public static float perceptron(float[][] matriz) {
		float[][] matrizR = new float[9][9];
		float umbral = (float) 0.1;
		float resultado = 0;
		for (int i = 0; i < matriz.length; i++) {
					System.out.println("fila"+ matriz[i]);
					
					float numero = (float) Math.floor(Math.random() * (90 - 50 + 1) + 50);
					matrizR[i][0]= matriz[i][0];
					matrizR[i][1] =numero;
					matrizR[i][0]= matriz[i][2];
					
						System.out.println("entro al numero"+matriz[i][0]+"con numero"+numero);
						resultado=resultado+matriz[i][0]*numero;
						System.out.println("resultado"+resultado);
								
				
		}
		
		if(resultado>umbral) {
			float resultadoO=1f;

			for (int g = 0; g < matriz.length; g++) {
				if(matriz[g][2]==resultadoO) {
					System.out.println("Mujer");
				}
				else {
					matrizR[g][1]=matrizR[g][1]+1;
					System.out.println("matriz"+matrizR[g][1]);
					System.out.println("umbral"+umbral);
					
					umbral=umbral-1;
					System.out.println("umbral nuevo"+umbral);
					
					perceptron(matrizR);					
				}
			}
			
		}
		else {
			System.out.println("Hombre");
		}
		
						
						
						
//				if ((numero >= 50f && numero <= 60f) && (matriz[i][0] >= 1.50 && matriz[i][0] <= 1.70)) {
//					 System.out.println("if");
//					if (matriz[i][0] * numero > umbral) {
//						resultado = 1;
//						n=1;						
//						System.out.println("Multiplico 1 " + matriz[i][0] + "*" + numero + "espera" + matriz[i][2]
//								+ "obtenido" + resultado);
//					
//					} else {
//						System.out.println("else");
//						umbral = umbral - 10f;
//						numero = numero + 10f;
//						n=1;
//						System.out.println("Multiplico 2 " + matriz[i][0] + "*" + numero + "espera" + matriz[i][2]
//								+ "obtenido" + resultado);
//					}
//					n=1;
//				}
//				else  if ((numero >= 60f && numero <= 90f) && (matriz[i][0] >= 1.70 && matriz[i][0] <= 1.90)) {
//					if (matriz[i][0] * numero < umbral) {
//						resultado = 0;
//						n=1;
//						System.out.println("Multiplico 3 " + matriz[i][0] + "*" + numero + "espera" + matriz[i][2]
//								+ "obtenido" + resultado);
//					} else {
//						System.out.println("Multiplico 4 " + matriz[i][0] + "*" + numero + "espera" + matriz[i][2]
//								+ "obtenido" + resultado);
//						umbral = umbral + 10;
//						numero = numero - 10;
//						n=1;
//						System.out.println("Multiplico 5 " + matriz[i][0] + "*" + numero + "espera" + matriz[i][2]
//								+ "obtenido" + resultado);
//					}
//				//	n=1;
				
			

		return resultado;
		// }
		// return resultado;

	}
}
