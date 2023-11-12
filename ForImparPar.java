package LacosRepeticao;

import java.util.Scanner;

public class ForImparPar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num, x, contPar = 0, contImpar = 0;

		System.out.println("Vamos descobrir quais números são pares e ímpares: ");

		for (x = 1; x <= 10; x++) {

			System.out.println("\nInforme os números: ");
			num = scan.nextInt();

			if (num % 2 == 0) {
				contPar += 1;
			} else {
				contImpar += 1;
			}

		}

		System.out.println("\nNúmeros pares:"+contPar+"\nNúmeros impares: "+contImpar);
		
	}

}
