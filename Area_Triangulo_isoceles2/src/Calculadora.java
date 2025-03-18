

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;


public class Calculadora {

	public static boolean verificarExistencia(double base , double lado1 , double lado2) {
		return (base >= lado1+lado2);
	}

	public static void main(String[] args) {

		try {

			System.out.println("Programa calcula área TRI Isosceles");
			Scanner tcd = new Scanner(System.in);

			double base = -1;
			double lado = -1;

			while(verificarExistencia(base, lado, lado)) {
				System.out.println("Insira os dados pedidos:");

				while(base <= 0) {
					System.out.println("informe o valor da base:");
					base = tcd.nextDouble();
				}
				while(lado <= 0) {
					System.out.println("Informe o valor do lado:");
					lado = tcd.nextDouble();
				}
			}

			System.out.println("Fim do programa");
			
		} catch (Exception e) {
			System.out.println("Falha ao processar!!");
		}

	}
}
