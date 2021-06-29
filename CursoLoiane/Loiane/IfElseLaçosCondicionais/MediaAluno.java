import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com a primeira nota do aluno:");
		double nota1=leia.nextDouble();
		
		System.out.println("Entre com a segunda nota do aluno: ");
		double nota2=leia.nextDouble();
		
		double media= (nota1 + nota2) / 2;
		
		if (media >9 && media<=10 ) {
			System.out.println("Aprovado, sua media foi de: "+media+ " e o seu conceito final foi A, suas notas foram "+nota1 +" e " + nota2);
		}
		else if(media >=7.5 && media <=9) {
			System.out.println("Aprovado, sua media foi de: "+media+ " e o seu conceito final foi B, suas notas foram "+nota1 +" e " + nota2);
		}
		else if(media >=6 && media <7.5) {
			System.out.println("Aprovado, sua media foi de: "+media+ " e o seu conceito final foi C, suas notas foram "+nota1 +" e " + nota2);
		}
		else if(media >4 && media <6) {
			System.out.println("Reprovado, sua media foi de: "+media+ " e o seu conceito final foi D, suas notas foram "+nota1 +" e " + nota2);
		}
		else if (media == 4 && media==0) {
			System.out.println("Reprovado, sua media foi de: "+media+ " e o seu conceito final foi E, suas notas foram "+nota1 +" e " + nota2);
		}
	}
	

}
