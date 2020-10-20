
public class ConcretaFactoryIngles implements AbstractFactoryIdiomas {
	
	private Moneda moneda;
	private Lista lista;
	private final int valor = 3;
	
	public ConcretaFactoryIngles() {
		this.moneda = new MonedaUSA(valor);
		this.lista = new ListaIngles();
	}
	
	public Moneda getMoneda() {
		return this.moneda;
	}
	
	public Lista getLista() {
		return this.lista;
	}
	
}
