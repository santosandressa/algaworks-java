package topicosAvancados;

import java.util.Set;

import collections.Aluno;

public class TesteEqualsAndHashCode {

	public static void main(String[] args) {

		Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();

		Aluno alunoSorteado = new Aluno("Maria");

		if (alunos.contains(alunoSorteado)) {
			System.out.println("Parabens " + alunoSorteado.getNome() + " voce foi sorteado(a) ");
		} else {
			System.out.println("Aluno nao cadastrado no banco de dados");
		}

	}

}
