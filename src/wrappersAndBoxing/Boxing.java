package wrappersAndBoxing;

public class Boxing {

	public static void main(String[] args) {
		// Boxing
		Integer i = 10;

		// Unboxing
		int x = i;
		System.out.println(x);

		Integer i1 = 127;
		Integer i2 = 127;

		Integer i3 = 128;
		Integer i4 = 128;

		System.out.println(i1.equals(i2));
		System.out.println(i3.equals(i4));
	}

}
