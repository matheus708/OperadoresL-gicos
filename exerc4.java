import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		
		
		int x, y, z;
		
		
		Scanner leitor = new Scanner (System.in);
		
		
		System.out.println("Digite o primeiro lado do  tri�ngulo ");
		x = leitor.nextInt();
		System.out.println("Digite o segundo lado do  tri�ngulo ");
		y = leitor.nextInt();
		System.out.println("Digite o terceiro lado do  tri�ngulo ");
		z = leitor.nextInt();
		
		if(x == y && x == z && y == z) 
			System.out.println("O tri�ngulo � equil�tero ");
		
		else if(x == y || x == z || y == z)
			System.out.println("O tri�ngulo � is�sceles  ");
		
		else
			System.out.println("O tri�ngulo � escaleno  ");

	}

}
