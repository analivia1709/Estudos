import java.util.Scanner;

public class MaiorEMenor {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		int num1=leia.nextInt();
		
		System.out.println("entre com o segundo numero: ");
		int num2=leia.nextInt();
		
		System.out.println("Entre com o terceiro numero: ");
		int num3=leia.nextInt();
		
		if(num1 > num2 && num1>num3) {
			
			System.out.println("maior"+ num1);
		}
		else if(num2 > num1 && num2 > num3) {
			
			System.out.println("maior"+num2);
		}
		else if(num3 > num1 && num3 > num2) {
			
			System.out.println("maior"+num3);
		}
		
		
		
		
	}

}
