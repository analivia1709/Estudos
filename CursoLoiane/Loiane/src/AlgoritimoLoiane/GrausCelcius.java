package AlgoritimoLoiane;

import java.util.Scanner;

public class GrausCelcius {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celcius: ");
		double celcius=leia.nextDouble();
		
		double f;
		
		f= (celcius)*1.8 +32 ;
		
		System.out.println("A temperatura em farenheit é de: "+ f+ "F");
		
	}

}
