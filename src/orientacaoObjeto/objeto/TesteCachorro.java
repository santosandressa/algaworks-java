package orientacaoObjeto.objeto;

import orientacaoObjeto.classe.Cachorro;

public class TesteCachorro {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.nome = "Bento";
		cachorro.raca = "SRD";
		cachorro.idade = 2;
		cachorro.sexo = 'M';
		
		System.out.println("Nome: " + cachorro.nome);
		System.out.println("Raca: " + cachorro.raca);
		System.out.println("Idade: " + cachorro.idade + " anos");
		System.out.println("Sexo: " + cachorro.sexo);

	}

}
