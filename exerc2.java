import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {
		
		
		int num;
		
		
		Scanner leitor = new Scanner (System.in);
		
		
		System.out.println("Digite sua idade ");
		num = leitor.nextInt();
		
		if(num >= 5 && num <= 10)
			System.out.println("Sua categoria é infantil ");
		else if(num >= 11 && num <= 17)
			System.out.println("Sua categoria é juvenil ");
		else if (num >= 18)
			System.out.println("Sua categoria é adulto ");
		
		else 
			System.out.println("Sua categoria não foi encontrada ");
		
		

	}

}
