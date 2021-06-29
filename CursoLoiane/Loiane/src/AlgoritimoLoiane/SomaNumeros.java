package AlgoritimoLoiane;

import java.util.Scanner;

public class SomaNumeros {

	public static void main(String[] args) {

		Scanner leia= new Scanner (System.in);
		
		int soma;
		
		System.out.println("Digite um numero: ");
		int num1= leia.nextInt();
		
		System.out.println("Digite outro numero: ");
		int num2= leia.nextInt();
		
		soma= num1 + num2;
		
		System.out.println("A soma entre os valores " +num1+ " e " +num2+ " é de: " +soma );
		
		
	}

}
