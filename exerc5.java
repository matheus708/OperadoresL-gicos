import java.util.Scanner;

public class exerc5 {

	public static void main(String[] args) {
		
		
		
		float w, x, y, z;
		int matricula;
		float media, nt;
		
		
		Scanner leitor = new Scanner (System.in);
		
		
		System.out.println("Digite sua matr�cula ");
		matricula = leitor.nextInt();
		System.out.println("Digite a primeira nota ");
		w = leitor.nextFloat();
		System.out.println("Digite a segunda nota ");
		x = leitor.nextFloat();
		System.out.println("Digite a terceiro nota ");
		y = leitor.nextFloat();
		System.out.println("Digite a quarta nota ");
		z = leitor.nextFloat();
		
		nt = w+x+y+z; 
		media = nt / 4;
		
		if(media >= 7)
			System.out.println("Sua matr�cula � " +matricula+ " sua m�dia � " +media+ " Aluno Aprovado ");
		
		else if(media >= 3.5 && media < 7)
			System.out.println("Sua matr�cula � " +matricula+ " sua m�dia � " +media+ " Aluno est� de Recupera��o  ");
		
		else
			System.out.println("Sua matr�cula � " +matricula+ " sua m�dia � " +media+ " Aluno Reprovado  ");

	}

}
