import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int num1=leia.nextInt();
		
		System.out.println("Digite outro numero: ");
		int num2=leia.nextInt();
		
		if(num1 > num2) {
			System.out.println("O primeiro numero foi maior "+num1);
		}
		else if(num2 > num1) {
			System.out.println("O segundo numero foi o maior "+ num2);
		}
	}

}
