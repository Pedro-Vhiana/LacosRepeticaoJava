package LacosRepeticao;

import java.util.Scanner;

public class DoWhileDigitarZero {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num, contPosi=0;

		do {
			System.out.println("Digite os números: ");
			num = scan.nextInt();

			if (num > 0) {
				contPosi = num + num;
				
			}

			

		} while (num != 0);
		
		System.out.println("Soma dos números positivos: "+contPosi);

	}

	
}
