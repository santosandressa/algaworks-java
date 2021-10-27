package wrappersAndBoxing;

public class MainTelevisao {

	public static void main(String[] args) {
		Televisao tv = new Televisao();

		// Não deveria mudar o volume e canal
		tv.mudarVolume(20);
		tv.mudarCanal(130);
		
		// Deveria mudar o volume e canal
		tv.mudarVolume(300);
		tv.mudarCanal(10);

	}

}
