package f36;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		int x1,y1,x2,y2;
		double d,raizd;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o valor de x1: ");
		x1 = read.nextInt();
		System.out.println("Digite o valor de y1: ");
		y1 = read.nextInt();
		System.out.println("Digite o valor de x2: ");
		x2 = read.nextInt();
		System.out.println("Digite o valor de y2: ");
		y2 = read.nextInt();
		
		d = (Math.pow((x2-x1),2))+(Math.pow((y2-y1), 2));
		raizd=Math.sqrt(d);
		
		System.out.println("O resultado da equação é: "+raizd);
	}

}
