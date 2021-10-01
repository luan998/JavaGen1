package f36;

import java.util.Scanner;

public class Classe1 {

	public static void main(String[] args) {
		
		float n1,n2,n3,media;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nEntre com a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = leia.nextFloat();	
		System.out.println("\nEntre com a terceira nota: ");
		n3 = leia.nextFloat();	
		//print f é mais rápido mas ambos printam algo da tela, print f é bom para arredondar
		media = (n1+n2+n3)/3;
		System.out.printf("A média é: %2.2f",media);//numero de casas no % para arredondar, direita e esquerda e o f para falar que é float
	
		//n1=Math.sqrt(n2);//pede pra criar como double para não ter problema de número infinito
		//n2 = Math.pow(n3,3);  para elevar a potência
		//n3 = n1 % n2;
	}
}
