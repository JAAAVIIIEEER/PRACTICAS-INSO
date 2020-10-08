package ule.iso1.singleton;

public class Main {

	public static void main(String[] args) {
		   // Instancia la variable singleton
	       //VATtoApply va1 = VATtoApply.getInstance(0.16);
	       VATtoApply va1 = new VATtoApply(0.16);    // cambiar por la linea anterior para utilizar el patrón Singleton
	 
	      // Intenta instanciar un segundo singleton: debe devolver la misma instancia
	      // VATtoApply va2 = VATtoApply.getInstance(0.20);
	       VATtoApply va2 = new VATtoApply(0.20);    // cambiar por la linea anterior para utilizar el patrón Singleton
	     
	     // Comprueba que ambos objetos son referencias a la misma
	     // instancia, que es única
	     System.out.println("Instancia 1: "+ va1.toString()+" VAT: "+ va1.getVatType());
	     System.out.println("Instancia 2: "+ va2.toString()+" VAT: "+ va2.getVatType());
	     
	     //Modifica el valor del iva en una de las variables
	     
	     va1.setVatType(0.04);
	     
	     // Comprueba que todas las variables acceden a la misma instancia modificada
	     System.out.println("Instancia 1: "+ va1.toString()+" VAT: "+ va1.getVatType());
	     System.out.println("Instancia 2: "+ va2.toString()+" VAT: "+ va2.getVatType());
	    
	     // Intenta instanciar una tercera variable: Todas acceden a la misma instancia
	     //  VATtoApply va3 = VATtoApply.getInstance(0.30);
	     VATtoApply va3 = new VATtoApply(0.30);  // cambiar por la linea anterior para utilizar el patrón Singleton
	     System.out.println("Instancia 3: "+ va3.toString()+" VAT: "+ va3.getVatType());
	}

}
