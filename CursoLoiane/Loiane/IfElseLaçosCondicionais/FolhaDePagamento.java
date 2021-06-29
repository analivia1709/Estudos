import java.util.Scanner;

public class FolhaDePagamento {

	public static void main(String[] args) {

		Scanner leia= new Scanner (System.in);
		
		System.out.println("Entre com a quantidade de horas trabalhadas: ");
		int horas=leia.nextInt();
		
		System.out.println("Entre com o valor da hora trabalhada: ");
		double valorhora=leia.nextDouble();
		
		double salariobruto= horas * valorhora;
		
		if(salariobruto <= 900) {
			System.out.println("Seu salario não tera nenhum desconto,pois seu salario é de R$" + salariobruto);
		}
		else if(salariobruto >900 && salariobruto<= 1500) {
			double ir1 = (salariobruto * 5) / 100;
			double fgts1 =(salariobruto * 11) / 100;
			double inss1 = (salariobruto * 10) / 100;
			double salariolqd1= salariobruto - ir1- fgts1- inss1;
			double descontos1 = ir1 + fgts1 + inss1;
			System.out.println("O seu salario bruto é de R$"+salariobruto+" o valor do seu IR é de R$"+ir1+
					" o valor do seu FGTS é de R$"+fgts1+
					" o valor do seu INSS é de R$"+ inss1+ " seu salario liquido é de R$"+salariolqd1+
					" a soma de todos os seus descontos é de R$"+ descontos1);
		}
		else if (salariobruto >=1500 && salariobruto<= 2500){
			double ir2 = (salariobruto * 10) / 100;
			double fgts2 =(salariobruto * 11) / 100;
			double inss2 = (salariobruto * 10) / 100;
			double descontos2 = ir2 + fgts2 + inss2;
			double salariolqd2= salariobruto - ir2- fgts2- inss2;
			System.out.println("O seu salario bruto é de R$"+salariobruto+" o valor do seu IR é de R$"+ir2+
					" o valor do seu FGTS é de R$"+fgts2+
					" o valor do seu INSS é de R$"+ inss2+ " seu salario liquido é de R$"+salariolqd2+
					" a soma de todos os seus descontos é de R$"+ descontos2);
			
		}
		else if(salariobruto >=2500) {
		double ir3 = (salariobruto * 20) / 100;
		double fgts3 =(salariobruto * 11) / 100;
		double inss3 = (salariobruto * 10) / 100;
		double descontos3 = ir3 + fgts3 + inss3;
		double salariolqd3= salariobruto - ir3- fgts3- inss3;
		System.out.println("O seu salario bruto é de R$"+salariobruto+"o valor do seu IR é de R$"+ir3+
				" o valor do seu FGTS é de R$"+fgts3+
				" o valor do seu INSS é de R$"+ inss3+ " seu salario liquido é de R$"+salariolqd3+
				" a soma de todos os seus descontos é de R$"+ descontos3);
		}
	}

}
