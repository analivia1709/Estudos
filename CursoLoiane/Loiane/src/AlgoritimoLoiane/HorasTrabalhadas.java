package AlgoritimoLoiane;

import java.util.Scanner;

public class HorasTrabalhadas {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o valor da hora trabalhada: ");
		double valor=leia.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
		int horas=leia.nextInt();
		
		double salario;
		
		salario= valor * horas;
		
		System.out.println("O salario desse mês será de: "+ salario);
		
		
	}

}
