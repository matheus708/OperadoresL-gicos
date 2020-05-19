import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {
		
		
		int num = 15, num2 = 7 ;
		float salario, corrigido, percentual = 0;
		
		Scanner leitor = new Scanner (System.in);
		
		
		System.out.println("Digite seu salário ");
		salario = leitor.nextFloat();
		
		if(salario >= 0 && salario <= 1000) {
			percentual = salario * num /100;
			corrigido = percentual + salario;
				System.out.println("O percentual de seu aumento é igual a " +percentual+ "e o salário corrigido é de " +corrigido);}
			
		else if(salario >= 1000.01 && salario <= 2500) {
			percentual = salario * num2 /100;
			corrigido = percentual + salario;
				System.out.println("O percentual de seu aumento é igual a " +percentual+ "e o salário corrigido é de " +corrigido);}
			
		else {
				System.out.println("Seu salario continuará o mesmo ");
		}
			


	}

}
