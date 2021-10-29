package collections;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("Pedro");
		Aluno a4 = new Aluno("Caique");

		Map<String, Aluno> alunos = new HashMap<String, Aluno>();

		alunos.put("1", a1);
		alunos.put("2", a2);
		alunos.put("3", a3);
		alunos.put("4", a4);
		alunos.put("5", a4);

		imprimirAlunos(alunos);
		
		Aluno alunoKey = alunos.get("3");
		System.out.println("Codigo do aluno: " + alunoKey.getNome());

	}

	private static void imprimirAlunos(Map<String, Aluno> alunos) {
		for (Aluno a : alunos.values()) {
			System.out.println("Nome: " + a.getNome());
		}

	}

}
