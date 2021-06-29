package AlgoritimoLoiane;

import java.util.Scanner;

public class GrausFarenheit {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit: ");
		double farenheit=leia.nextDouble();
		
		double temperatura;
		
		temperatura=(5*(farenheit-32)/9);
		
		System.out.println("A temperatura em Celcius é de: "+ temperatura );
		
	}

}
