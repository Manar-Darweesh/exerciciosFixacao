package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número inteiro diferente de 0: ");
		numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("O número digitado é positivo!");
		} else {
			System.out.println("O número digitado é negativo!");
		}
		
		sc.close();
	}

}
