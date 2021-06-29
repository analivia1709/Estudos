import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		int idade=leia.nextInt();
		
		if(idade>=18) {
			System.out.println("Você é maior de idade pode entrar");
		}
		
		else {
			System.out.println("Você não é maior de idade");
		}
	}

}
