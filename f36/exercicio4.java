package f36;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		int a,b,c;
		double r,s,d;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A:");
		a = read.nextInt();
		System.out.println("Entre com o valor de B:");
		b = read.nextInt();
		System.out.println("Entre com o valor de C:");
		c = read.nextInt();
		
		r= Math.pow((a+b),2);
		s= Math.pow((b+c),2);
		d = (r+s)/2;
		System.out.println("O resultado da equação é: "+d);
	}

}
