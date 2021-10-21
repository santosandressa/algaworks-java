package orientacaoObjeto;

public class TestePaciente {

	public static void main(String[] args) {
		//metodos com retorno
		Paciente p = new Paciente();
		p.peso = 100.0;
		p.altura = 1.65;
		
		IMC imc = p.calcularIndiceDeMassaCorporal();
		
		System.out.println("Abaixo do peso ideal: " + imc.abaixoDoPesoIdeal);
		System.out.println("Peso ideal: " + imc.pesoIdeal);
		System.out.println("Obeso: " + imc.obeso);
		System.out.println("Grau de obesidade: " + imc.grauObesidade);

	}

}
