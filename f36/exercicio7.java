package f36;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		int a,b,c,d,e,f;
		double x,y;
		Scanner read = new Scanner(System.in);

		System.out.println("Digite o falor de a: ");
		a = read.nextInt();
		System.out.println("Digite o falor de b: ");
		b = read.nextInt();
		System.out.println("Digite o falor de c: ");
		c = read.nextInt();
		System.out.println("Digite o falor de d: ");
		d = read.nextInt();
		System.out.println("Digite o falor de e: ");
		e = read.nextInt();
		System.out.println("Digite o falor de f: ");
		f = read.nextInt();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));	
		System.out.println("O resultado de x é "+x+" e o resultado de y é "+y+".");
	}

}
