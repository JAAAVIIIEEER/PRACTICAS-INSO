
public class ConcretaFactoryEspañol implements AbstractFactoryIdiomas{
	
	private Moneda moneda;
	private Lista lista;
	
	public ConcretaFactoryEspañol() {
		this.moneda = new MonedaEspaña();
		this.lista = new ListaEspañol();
	}
	
	public Moneda getMoneda() {
		return this.moneda;
	}
	
	public Lista getLista() {
		return this.lista;
	}
}
