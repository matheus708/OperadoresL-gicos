import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args) {
		
		
		int num;
		
		
		Scanner leitor = new Scanner (System.in);
		
		
		System.out.println("Digite um n�mero ");
		num = leitor.nextInt();
		
		if(num >= 20 && num <= 90)
			System.out.println("O n�mero digitado aparece entre 20 e 90 ");
		
		else 
			System.out.println("O n�mero digitado � menor que 20 ou maior que 90 ");
		

	}

}
