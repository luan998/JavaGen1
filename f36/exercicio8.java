package f36;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		float cfab,cdist,cimp;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o pre�o de f�brica do carro");
		cfab = read.nextFloat();
		cdist=(float) (cfab*0.28);
		cimp=(float) (cfab*0.45);
		System.out.println("O valor do custo do consumidor � de: "+(cfab+cdist+cimp));
	}

}
