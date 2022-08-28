package aplicacao;

import java.util.Scanner;

import entidades.Aluno;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno nome = new Aluno();
		Aluno nota1 = new Aluno();
		Aluno nota2 = new Aluno();
		Aluno nota3 = new Aluno();
		Aluno nota4 = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		nome.setNome(sc.next());
		
		System.out.println("Digite a primeira nota: ");
		nota1.setNota(sc.nextDouble());
		System.out.println("Digite a segunda nota: ");
		nota2.setNota(sc.nextDouble());
		System.out.println("Digite a terceira nota: ");
		nota3.setNota(sc.nextDouble());
		System.out.println("Digite a quarta nota: ");
		nota4.setNota(sc.nextDouble());
		
		System.out.println("Aluno: " + nome.nome + " - Média: " + 
							(nota1.nota + nota2.nota + nota3.nota + nota4.nota)/4);
		
		sc.close();
	}

}
