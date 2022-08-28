package aplicacao;

import java.util.Scanner;

import entidades.Gerador;
import entidades.Gerador;
public class Verificador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gerador senhaT = new Gerador();
		
		do {
			System.out.println("Digite a senha: ");
			senhaT.setSenhaTentada(sc.next());
			System.out.println(senhaT.senhaTentada);
			
			if (senhaT.senhaTentada.equals(Gerador.senha)) {
				System.out.println("Acesso permitido!!");
			} else {
				System.out.println("Acesso negado! Tente novamente");
			}
			
		} while (!senhaT.senhaTentada.equals(Gerador.senha));
		
		sc.close();
	}

}
