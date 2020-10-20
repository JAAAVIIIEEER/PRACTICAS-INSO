import java.util.ArrayList;

public abstract class Lista {
	
	public ArrayList<Integer> elementos;
	
	public Lista() {
		elementos = new ArrayList<Integer>();
	}
	
	// En caso de no encontrarse el elemento en la lista se devolverá null
	public Integer getElemento(int ele) {
		for (Integer elemento: elementos) {
			if (elemento.equals(ele)) {
				return elemento;
			}
		}
		return null;
	}
	
	public void insertarElemento(Integer ele) {
		elementos.add(ele);
	}
	
	public void visualizar() {
		for (Integer elemento: elementos) {
			System.out.println(elemento + "\n");
		}
	}
	
	public abstract void configurar();
}
