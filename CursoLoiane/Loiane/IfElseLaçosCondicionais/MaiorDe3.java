import java.util.Scanner;

public class MaiorDe3 {

	public static void main(String[] args) {


		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira o primeiro numero");
		int num1=leia.nextInt();

		
		System.out.println("Insira o segundo numero");
		int num2=leia.nextInt();

		
		System.out.println("Insira o terceiro numero");
		int num3=leia.nextInt();
		
		if(num1 > num2 && num1 >num3) {
			System.out.println("o primeiro numero é o maior"+ num1);
		}
		else if (num2 >num1 && num2 > num3) {
			System.out.println("o segundo numero é o maior "+ num2);

		}
		else if (num3> num2 && num3 > num1) {
			System.out.println("o terceiro numero é o maior"+num3);

		}

	}

}
