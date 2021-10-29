package topicosAvancados.ordenandoObjetos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPeloNome {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Joao", 23);
		Pessoa p2 = new Pessoa("Adriana", 22);
		Pessoa p3 = new Pessoa("Bruno", 21);

		List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
		IdadeComparator idadeComparator = new IdadeComparator();
		Collections.sort(pessoas, idadeComparator);

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}

	}
}
