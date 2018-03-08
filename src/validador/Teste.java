package validador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import modelo.Lectura;
import modelo.Pedido;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Teste {

	public static void main(String[] args) throws Exception {
		validarXml();
		leerXml();
		escribir();		
	}

	public static void validarXml() {
		Validador validador = new Validador();
		try {
			validador.valida(new File("pedido.xml"), new File("pedido.xsd"));
			System.out.println("validado");					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void leerXml() throws FileNotFoundException {
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("pedido", Pedido.class);
		Pedido p = (Pedido) xstream.fromXML(new FileInputStream("pedido.xml"));
		System.out.println(p.getCliente());
		System.out.println(p.getItem());
		System.out.println(p.getDestino());
	}

	private static void escribir() throws FileNotFoundException {
		List<Lectura> lectura = new ArrayList<>();

		lectura.add(new Lectura("juan", "RUTA1"));
		lectura.add(new Lectura("maria", "RUTA2"));

		XStream xstream = new XStream(new DomDriver());
		xstream.alias("Lectura", Lectura.class);
		xstream.aliasAttribute(Lectura.class, "cliente", "cliente");
		xstream.alias("lectura", List.class);

		OutputStream os = new FileOutputStream("resultadoLeer.xml");
		xstream.toXML(lectura, os);
		System.out.println("Revise el archivo generado");
	}
}
