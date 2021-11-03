package xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import xml.model.Produto;

public class SalvandoProduto {

	public static void main(String[] args) throws FileNotFoundException {
		
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("produto", Produto.class);
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");

		Produto sabonete = new Produto(1L, "sabonete", new BigDecimal("2.30"));

		String xml = xstream.toXML(sabonete);
		System.out.println(xml);
		
		OutputStream os = new FileOutputStream("C:\\Users\\012467631\\Desktop\\algaworks-java\\src\\xml/produto1.xml");
		xstream.toXML(sabonete, os);
	}

}
