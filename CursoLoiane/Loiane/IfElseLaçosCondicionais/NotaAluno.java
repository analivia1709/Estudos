import java.util.Scanner;

public class NotaAluno {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com a primeira nota: ");
		double nota1=leia.nextDouble();
		
		System.out.println("Entre com a segunda nota: ");
		double nota2=leia.nextDouble();
		
		double media= (nota1 + nota2) / 2;
		
		if(media > 7) {
			
			System.out.println("Aluno aprovado, parabens");
		}
		else if (media < 7) {
			System.out.println("Aluno reprovado");
		}
		else if (media  == 10) {
			System.out.println("Aluno aprovado com distinção");
		}
	}
}
