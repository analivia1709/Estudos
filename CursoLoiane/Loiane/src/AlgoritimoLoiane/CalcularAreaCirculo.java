package AlgoritimoLoiane;

import java.util.Scanner;

public class CalcularAreaCirculo {

	public static void main(String[] args) {

		Scanner leia= new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio do circulo: ");
		double raio=leia.nextDouble();
		
		double area= Math.PI * Math.pow(raio, 2);
		
		
		System.out.println("A área do circulo é de: "+area);
	}

}
