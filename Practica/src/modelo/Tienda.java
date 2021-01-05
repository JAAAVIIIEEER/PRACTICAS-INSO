package modelo;

public class Tienda {
	
	private int id;
	private String via;
	private String provincia;
	private String municipio;
	private int numero;
	
	public Tienda(String via, String provincia, String municipio, int numero) {
		this.via = via;
		this.provincia = provincia;
		this.municipio = municipio;
		this.numero = numero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
