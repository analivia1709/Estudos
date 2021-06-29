package Algoritimo;

import java.util.Scanner;

public class Somatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia= new  Scanner(System.in);
		
		int a,b,soma;
		
		System.out.println("Digite um valor: ");
		a=leia.nextInt();
		
		System.out.println("Digite outro valor: ");
		b=leia.nextInt();
		
		soma= a + b;
		
		System.out.println("A soma entre os valores "+a+ " e "+b+" é igual a "+ soma);
		
		
	}

}
