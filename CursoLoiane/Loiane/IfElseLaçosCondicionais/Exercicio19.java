import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner leia= new Scanner (System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		int num1= leia.nextInt();
		
		System.out.println("Entre com o segundo valor");
		int num2=leia.nextInt();
		
		System.out.println("Que oper��o voce deseja realizar? \n1)Soma \n2)Subtra��o \n3)Multiplica��o \n4)Divis�o");
		int operacao=leia.nextInt();
		
		if(operacao == 1) {
			int soma=num1 + num2;
			
		}
		
	}

}
