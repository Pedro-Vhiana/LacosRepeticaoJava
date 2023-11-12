package LacosRepeticao;

import java.util.Scanner;
	
public class WhileIdade {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int idade=0,menor=0,maior=0,cont=2;
		
		cont++;
		
		System.out.println("\nInforme sua idade ");
		idade = scan.nextInt();
		
		// Enquanto minha idade for igual ou maior do que zero, eu continuo rodando o loop
		while(idade>=0) {
			
			if(idade<21) {
				menor += 1;
			}else if(idade>60) {
				maior += 1;
			}
			
			System.out.println("\nInforme a idade da próxima pessoa: ");
			idade = scan.nextInt();
			
		}
		
		System.out.println("Menor que 21: "+menor);
		System.out.println("Maior que 60: "+maior);
		
	}

}
