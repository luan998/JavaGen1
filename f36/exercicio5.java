package f36;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		double n1,n2,n3,media;
		Scanner read = new  Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		n1 = read.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		n2 = read.nextDouble();
		System.out.println("Entre com a terceira nota: ");
		n3 = read.nextDouble();
		media = ((n1*2)+(n2*3)+(n3*5))/10;
		System.out.println("O resultado da média é: "+media);
	}

}
