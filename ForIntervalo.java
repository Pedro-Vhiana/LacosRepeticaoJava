package LacosRepeticao;

import java.util.Scanner;

public class ForIntervalo {

	public static void main(String[] args) {
		
		// 

		int n1, n2, i;

		Scanner scan = new Scanner(System.in);

		System.out.println("Vamos descobrir quais números são múltiplos de 3 e 5 no intervalo definido!");

		System.out.println("\nDigite o primeiro número do intervalo");
		n1 = scan.nextInt();
		System.out.println("\nDigite o segundo número do intervalo");
		n2 = scan.nextInt();

		if (n1 > n2) {
			System.out.println("Intervalo inválido, por favor informe o primeiro número menor que o segundo!!!");
		} else {
			System.out.println("No intervalo entre " + n1 + " e " + n2 + ":");

			for (i = n1; i <= n2; i++) {

				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
					}
					
				}
						
			}
		
	}

}
