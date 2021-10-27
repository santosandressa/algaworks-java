package wrappersAndBoxing;

public class TesteClassesWrapper {

	@SuppressWarnings({ "unused" })
	public static void main(String[] args) {
		//Em <WrapperType> pode ser Byte, Short, Integer, Long, Float, 
		//Double, Boolean ou Character.

		//Em <primitiveType> deve ser colocado o valor desejado do tipo primitivo 
		//equivalente. Também pode ser colocada uma string, 
		//desde que seja compatível com o tipo do wrraper.
		
		byte x = 100;
		String s = Byte.toString(x);
		byte y = Byte.parseByte(s);
		
		
		int a = 100;
		Integer b = Integer.valueOf(a);
		int c = b.intValue();
		
		String idade = "18";
		Integer novaIdade = Integer.valueOf(idade);
		System.out.println(novaIdade + 3);
		

		long d = 1000;
		Long e = Long.valueOf(d);
		String f = e.toString();
		Long g = Long.valueOf(f);
		

	}

}
