package fundamentos;

public class CalculadoraProfessor {

	public static void main(String[] args) {
		
		float pi = 3.14f;
		float raio= 5.3f;
		float area= (raio * raio) * pi;
		
		System.out.println("Resultado: " + area);
		
		int areaSemCasaDecimais = (int) area;
		System.out.println("Resultado sem casas decimais: " + areaSemCasaDecimais);
	}

}
