package modelo;

import java.awt.List;
import java.io.Serializable;

public class Lectura implements Serializable{
	

	private String cliente;
	private String destino;
	private List item;
	

	public Lectura() {
		
	}

	public Lectura(String cliente, String destino ) {
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

	public List getItem() {
		return item;
	}

	public void setItem(List item) {
		this.item = item;
	}
	
	
}