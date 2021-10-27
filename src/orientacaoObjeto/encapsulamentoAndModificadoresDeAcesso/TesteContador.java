package orientacaoObjeto.encapsulamentoAndModificadoresDeAcesso;



public class TesteContador {
	public static void main(String[] args) {
		ContadorStatic c = new ContadorStatic();
		c.incrementar();
//		System.out.println(Contador.COUNT);
		
		ContadorStatic.COUNT++;
//		System.out.println(Contador.COUNT);
		
		ContadorStatic.imprimirContador();
	}
}
