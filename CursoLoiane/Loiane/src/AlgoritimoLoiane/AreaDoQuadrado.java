package AlgoritimoLoiane;

import java.util.Scanner;

public class AreaDoQuadrado {

	public static void main(String[] args) {

		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite a area do quadrado: ");
		int area=leia.nextInt();
		
		int area2, dobro;
		
		area2= area * area;
		
		dobro= area2 * 2;
		
		System.out.println("A area do quadrado é de: "+ area2+ " o dobro dessa area é de: "+ dobro);
		
		
	}

}
