package AlgoritimoLoiane;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {

		Scanner leia= new Scanner (System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int num1=leia.nextInt();
		
		System.out.println("Digite outro numero inteiro: ");
		int num2=leia.nextInt();
		
		System.out.println("Digite um numero real: ");
		double num3=leia.nextDouble();
				
		int resultado1= (num1 * 2) * (num2/2);
		double resultado2=(num1 * 3) + num3;
		double resultado3= num3 * num3  * num3;
		
		System.out.println("O produto dobro do primeiro com metade do segundo: "+ resultado1);
		
	
		System.out.println("Soma do triplo do  primeiro com o terceiro: "+resultado2);
			
		
		System.out.println("O terceiro elevado ao cubo: "+resultado3);
		
		
	}

}
