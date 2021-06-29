import java.util.Scanner;

public class Tabajara {

	public static void main(String[] args) {

		Scanner leia= new Scanner(System.in);
		
		System.out.println("Entre com o valor do seu salario: ");
		double salario=leia.nextDouble();
		
		if(salario == 280) {
			
			double reajuste= (salario * 20) /100;
			double valor = salario + reajuste;
			System.out.println("O valor do reajuste foi de: R$"+reajuste + " seu salario atual será de valor: R$"+valor+
					" seu salario antes do reajuste era de: R$"+salario+ " seu percentual de aumeto foi de 20%");
		}
		else if(salario > 280 && salario <700) {
			
			double reajuste2=(salario * 15) / 100;
			double valor2= salario+ reajuste2;
			System.out.println("O valor do reajuste foi de: R$"+reajuste2+ " seu salario atual será no valor de: R$"+ valor2+
					" seu salario antes do reajuste era de: R$"+salario+ " seu percentual de aumeto foi de 15%");
		}
		else if(salario > 700 && salario < 1500) {
			
			double reajuste3=(salario * 10) / 100;
			double valor3=salario+reajuste3;
			System.out.println("O valor do reajuste foi de: R$"+reajuste3+ " seu salario atual será no valor de: R$"+ valor3+
					" seu salario antes do reajuste era de: R$"+salario+ " seu percentual de aumeto foi de 10%");
		}
		else if(salario > 1500) {
			double reajuste4=(salario * 5) / 100;
			double valor4=salario +reajuste4;
			System.out.println("O valor do reajuste foi de: R$"+reajuste4+ " seu salario atual será no valor de: R$"+ valor4+
					" seu salario antes do reajuste era de: R$"+salario+" seu percentual de aumeto foi de 5%");
		}
			
	}

}
