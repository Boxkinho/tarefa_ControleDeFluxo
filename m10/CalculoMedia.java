package m10;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
				
		double nota1, nota2, nota3, nota4;
		
		System.out.println("Digite a nota 1: ");
		nota1 = s.nextDouble();
		System.out.println("Digite a nota 2: ");
		nota2 = s.nextDouble();
		System.out.println("Digite a nota 3: ");
		nota3 = s.nextDouble();
		System.out.println("Digite a nota 4: ");
		nota4 = s.nextDouble();
				
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
				
				System.out.println("A média das notas é igual a: " + media);
				
		if (media >= 7) {
			System.out.println("APROVADO!");
			
		} else if (media < 7 && media >= 5) {
			System.out.println("RECUPERAÇÃO!");
			
		} else {
			System.out.println("REPROVADO!");	
		}
	}

}
