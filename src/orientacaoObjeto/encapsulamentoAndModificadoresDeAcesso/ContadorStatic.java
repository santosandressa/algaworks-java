package orientacaoObjeto.encapsulamentoAndModificadoresDeAcesso;

import orientacaoObjeto.classe.Contador;

public class ContadorStatic {
	public static int COUNT = 0;
	public static final double PI = 3.14;
	
	public void incrementar() {
		COUNT++;
	}
	
	public static void imprimirContador() {
		System.out.println("O valor do contador agora é: " + Contador.COUNT);
	}
}
