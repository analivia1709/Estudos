package Algoritimo;

import java.util.Scanner;

public class EquaçãoDoSegundoGrau {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int a, b, c, delta;
		double x, x1, x2;

		System.out.println("Digite um valor para variavel A:");
		a = leia.nextInt();

		System.out.println("Digite um valor para variavel B:");
		b = leia.nextInt();

		System.out.println("Digite um valor para variavel C:");
		c = leia.nextInt();

		System.out.println("sua equação é:" + a + "x^2 + " + b + "x + " + c + " =0");

		delta = b * b - 4 * a * c;

		System.out.println("O Valor dessa equação é:" + delta + "x");
		
		
		if(delta >= 0) {
			
			x1= -b + Math.sqrt(delta) / 2 * a ;
			
			x2= -b - Math.sqrt(delta) / 2 * a ; ;
			
			System.out.println("O valor de x1 foi" + x1 + "o valor de x2 foi" +x2);
			
		}
		
		else if(delta <0) {
			System.out.println("Não existe raiz");
		}
		
		
		

	}

}
