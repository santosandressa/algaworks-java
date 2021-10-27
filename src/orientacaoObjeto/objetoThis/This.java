package orientacaoObjeto.objetoThis;


public class This {
	
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.modelo= "Palio";
		System.out.println("Modelo antes: " + carro.modelo);
		
		carro.alterarModelo("Civic");
		System.out.println("Modelo depois: " + carro.modelo);
	}

}
