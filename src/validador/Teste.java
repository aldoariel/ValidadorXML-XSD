package validador;

import java.io.File;

public class Teste {

	public static void main(String[] args) throws Exception {
		Validador validador = new Validador();
		
		try {
			validador.valida(new File("pedido.xml"), new File("pedido.xsd"));
			System.out.println("validado");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}