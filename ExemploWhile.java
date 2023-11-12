package LacosRepeticao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		
		int num,somaPar=0,contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		num = leia.nextInt();//6
		
		while(num != 0) {
			
			if(num % 2 == 0) {
				somaPar += num; // somaPar = somaPar + num
			}else {
				contImpar++; // contImpar = contImpar + 1
			}
			
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();//5 0
		}
		
		System.out.println("\nSomatório dos números pares: "+somaPar);
		System.out.println("\nQuantidade de números ímpares: "+contImpar);

	}

}
			
			
		