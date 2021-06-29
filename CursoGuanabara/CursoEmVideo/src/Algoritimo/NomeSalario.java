package Algoritimo;

import java.util.Scanner;

public class NomeSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia= new Scanner(System.in);
		
		String a ;
		int b;
		
		System.out.println("Nome da Funcionaria(o):");
		a=leia.next();
		
		System.out.println("Salario da funcionaria(o):");
		b=leia.nextInt();
		
		System.out.println("A funcionaria " + a + " recebeu o salario de " + b + "R$ no mês de julho");
	}

}
