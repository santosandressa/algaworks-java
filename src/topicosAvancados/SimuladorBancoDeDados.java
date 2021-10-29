package topicosAvancados;

import java.util.HashSet;
import java.util.Set;

import collections.Aluno;

public class SimuladorBancoDeDados {

	public static Set<Aluno> buscarAlunos() {
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(new Aluno("Ricado"));
		alunos.add(new Aluno("Thiago"));
		alunos.add(new Aluno("Maria"));

		return alunos;
	}

}
