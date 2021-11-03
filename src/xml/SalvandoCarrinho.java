package xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import xml.model.Produto;

public class SalvandoCarrinho {

	public static void main(String[] args) throws FileNotFoundException {
		
		List<Produto> carrinho= new ArrayList<>();
		carrinho.add(new Produto(1L, "condicionador", new BigDecimal("9.50")));
		carrinho.add(new Produto(2L, "shampoo", new BigDecimal("8.20")));
		
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto",Produto.class);
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		xstream.alias("carrinho", List.class);
		
		OutputStream os = new FileOutputStream
				("C:\\Users\\012467631\\Desktop\\algaworks-java\\src\\xml/carrinho.xml");
		xstream.toXML(carrinho, os);
	}

}
