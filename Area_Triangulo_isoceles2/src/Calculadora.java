

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
				System.out.println("Fala os bang que serão pedidos");

				while(base <= 0) {
					System.out.println("Fala o valor da base aí");
					base = tcd.nextDouble();
				}
				while(lado <= 0) {
					System.out.println("Manda o valor do lado meu chapa");
					lado = tcd.nextDouble();
				}
			}

			System.out.println("Acabou o programa");
			
		} catch (Exception e) {
			System.out.println("Calma que deu merda!!");
		}

	}
}
