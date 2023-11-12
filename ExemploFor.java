package LacosRepeticao;

import java.util.Scanner;

public class ExemploFor {
	
	public static void main(String[] args) {
		
		// Operadores de incremento > ++ ( Adicionar valor ao contador ) 
		// Operadores de incremento > -- ( Subtrair valor ao contador  )
		// For tem três parâmetos: Inicio do loop, Fim do loop e condição de loop
		
			float n1,n2,n3,media,somaMedia=0,mediaGeral;
			int x,na;
			
			Scanner leia = new Scanner(System.in);
			System.out.println("\nDigite quantos alunes que iremos calcular a média: ");
			na = leia.nextInt();//5
			if(na<1) {
				System.out.println("\nNúmero inexistente de alunes!!!");
			}else {
			for(x=1;x<=na;x++) { //x = x + 1  x-- x = x -1 x = x + 5
				
				System.out.println("\nEntre com a primeira nota: ");
				n1 = leia.nextFloat();
				System.out.println("\nEntre com a segunda nota: ");
				n2 = leia.nextFloat();
				System.out.println("\nEntre com a terceira nota: ");
				n3 = leia.nextFloat();
				
				media = (n1+n2+n3)/3;//7,5 6,5 5
				System.out.println("\nMédia do alune "+x+" : "+media);
				somaMedia += media; //somaMedia = somaMedia + media;
			}
			}
			mediaGeral = somaMedia / na;
			System.out.printf("\nMédia geral: %.2f",mediaGeral);
		
		
		
		
		
		
		
		
	}

}
