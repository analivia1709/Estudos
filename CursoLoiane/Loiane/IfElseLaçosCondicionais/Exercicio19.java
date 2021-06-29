import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner leia= new Scanner (System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		int num1= leia.nextInt();
		
		System.out.println("Entre com o segundo valor");
		int num2=leia.nextInt();
		
		System.out.println("Que operção voce deseja realizar? \n1)Soma \n2)Subtração \n3)Multiplicação \n4)Divisão");
		int operacao=leia.nextInt();
		
		if(operacao == 1) {
			int soma=num1 + num2;
			
		}
		
	}

}
