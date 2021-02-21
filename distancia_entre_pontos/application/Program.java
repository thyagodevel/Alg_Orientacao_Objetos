package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Coordenadas;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a coordenada X1: ");
		double x1 = teclado.nextDouble();
		System.out.print("Digite a coordenada Y1: ");
		double y1 = teclado.nextDouble();
		System.out.print("Digite a coordenada X2: ");
		double x2 = teclado.nextDouble();
		System.out.print("Digite a coordenada Y2: ");
		double y2 = teclado.nextDouble();
		
		Coordenadas calculo = new Coordenadas(x1, y1, x2, y2);
		
		System.out.println();
		System.out.printf("A distancia entre os pontos é de: %.2f", calculo.calc());
		
		teclado.close();
	}
}
