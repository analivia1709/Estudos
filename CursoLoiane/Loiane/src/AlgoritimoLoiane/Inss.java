package AlgoritimoLoiane;

import java.util.Scanner;

public class Inss {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o valor da hora trabalhada: ");
		double valhora=leia.nextDouble();
		
		System.out.println("Digite o número de horas trabalhadas: ");
		int horastrabalhadas=leia.nextInt();
		
		double salario;
		
		salario= valhora * horastrabalhadas;
				
		double imposto,inss,sindicato;
		
		imposto = (salario * 11 ) /100;
		inss= (salario * 8)/ 100;
		sindicato = (salario * 5)/100;
		
		System.out.println("O salario do mês atual será de: "+salario + "R$"+ " você pagara "+imposto+ 
				"R$ de imposto de renda, "+inss+"R$ de INSS  e "+sindicato+"R$ de sindicato.");
		
		double salarioliquido;
		
		salarioliquido= salario - imposto - inss - sindicato ;
		
		System.out.println("Seu salario liquido sera de : "+salarioliquido+ "R$");
		
		
		System.out.println("");

		
		
		
		
		
		
		
	}

}
