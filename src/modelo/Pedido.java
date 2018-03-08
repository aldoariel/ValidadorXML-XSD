package modelo;
public class Pedido {

	private String cliente;
	private String destino;
	private String item;
	

	public Pedido() {
		
	}

	public Pedido(String cliente, String destino ) {
		super();
		this.cliente = cliente;
		this.destino = destino;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	
}