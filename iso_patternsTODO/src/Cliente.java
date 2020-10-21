
public class Cliente {
	
	private Moneda moneda;
	private Lista lista;
	private AbstractFactoryIdiomas factoria;
	
	public Cliente(AbstractFactoryIdiomas a) {
		this.moneda=this.factoria.getMoneda();
		this.lista=this.factoria.getLista();
		this.factoria = a;
	}
	
	public void visualizaElems() {
		moneda.visualizar();
		lista.visualizar();
	}
}
