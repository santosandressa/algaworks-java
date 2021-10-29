package collections;

import java.util.ArrayList;
import java.util.List;

public class TesteListArrayList {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("Pedro");
		Aluno a4 = new Aluno("Caique");

		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);

		imprimirAlunos(alunos);
	}

	public static void imprimirAlunos(List<Aluno> alunos) {
		// Aluno a1 = alunos.get(0);
		for (Aluno a : alunos) {
			System.out.println("Nome: " + a.getNome());
		}
	}

}
