
public class ConcretaFactoryEspañol implements AbstractFactoryIdiomas{
	
	private ConcretaFactoryEspañol moneda;
	
	public ConcretaFactoryEspañol() {
		
	}
	
	public Moneda getMoneda() {
		return new MonedaEspaña();
	}
	
	public Lista getLista() {
		return null;
	}
}
