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
		//print f � mais r�pido mas ambos printam algo da tela, print f � bom para arredondar
		media = (n1+n2+n3)/3;
		System.out.printf("A m�dia �: %2.2f",media);//numero de casas no % para arredondar, direita e esquerda e o f para falar que � float
	
		//n1=Math.sqrt(n2);//pede pra criar como double para n�o ter problema de n�mero infinito
		//n2 = Math.pow(n3,3);  para elevar a pot�ncia
		//n3 = n1 % n2;
	}
}
