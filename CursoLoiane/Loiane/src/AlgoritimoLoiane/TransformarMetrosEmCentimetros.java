package AlgoritimoLoiane;

import java.util.Scanner;

public class TransformarMetrosEmCentimetros {

	public static void main(String[] args) {

		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite a quantidade de metros: ");
		double metros= leia.nextDouble();
		
		double transformar;
		
		transformar = metros *100;
		
		System.out.println(metros+" metros, tem  "+transformar + " centimetros.");
		
		
	}

}
