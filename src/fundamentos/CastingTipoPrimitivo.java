package fundamentos;

public class CastingTipoPrimitivo {

	public static void main(String[] args) {

		long x = 10l;

		// CASTING
		int y = (int) x;

		System.out.println(y);
		
		
		// DONT DO IT
		// perde a precisao
		long a = 9300000035L;
		int b = (int) a;
		System.out.println(b);

	}

}
