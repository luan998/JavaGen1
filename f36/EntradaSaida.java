package f36;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a,b,soma;
		//final int c=3; cria uma constante que não muda
		
		System.out.println("Entre com o primeiro valor: ");
		a = ler.nextInt();
		System.out.println("Entre com o segundo valor: ");
		b = ler.nextInt();
		soma = a+b;
		System.out.println("O valor da soma foi: "+soma);//a virgula não funciona para o println, tem que ser o +
		
		/*a++ mostra e dps incrementa
		 * ++a incrementa o numero e depois mostra a variável
		 */
	}

}
