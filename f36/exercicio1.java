package f36;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		
		int dia,mes,ano,anores,mesres;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite quantos anos você tem de vida: ");
		ano = read.nextInt();
		System.out.println("Digite quantos meses você tem de vida: ");
		mes = read.nextInt();
		System.out.println("Digite quantos dias você tem de vida: ");
		dia = read.nextInt();
		anores = ano*365;
		mesres = mes*30;
		System.out.printf("O número de dias que você viveu foi de: "+(dia+mesres+anores));
		
	}
}
