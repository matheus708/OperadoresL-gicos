import java.util.Scanner;

public class exerc5 {

	public static void main(String[] args) {
		
		
		
		float w, x, y, z;
		int matricula;
		float media, nt;
		
		
		Scanner leitor = new Scanner (System.in);
		
		
		System.out.println("Digite sua matrícula ");
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
			System.out.println("Sua matrícula é " +matricula+ " sua média é " +media+ " Aluno Aprovado ");
		
		else if(media >= 3.5 && media < 7)
			System.out.println("Sua matrícula é " +matricula+ " sua média é " +media+ " Aluno está de Recuperação  ");
		
		else
			System.out.println("Sua matrícula é " +matricula+ " sua média é " +media+ " Aluno Reprovado  ");

	}

}
