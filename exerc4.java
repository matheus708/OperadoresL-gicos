import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		
		
		int x, y, z;
		
		
		Scanner leitor = new Scanner (System.in);
		
		
		System.out.println("Digite o primeiro lado do  triângulo ");
		x = leitor.nextInt();
		System.out.println("Digite o segundo lado do  triângulo ");
		y = leitor.nextInt();
		System.out.println("Digite o terceiro lado do  triângulo ");
		z = leitor.nextInt();
		
		if(x == y && x == z && y == z) 
			System.out.println("O triângulo é equilátero ");
		
		else if(x == y || x == z || y == z)
			System.out.println("O triângulo é isósceles  ");
		
		else
			System.out.println("O triângulo é escaleno  ");

	}

}
