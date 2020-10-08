package ule.iso1.singleton;

public class Main {

	public static void main(String[] args) {
		 // Instancia la variable singleton
	     VATtoApply va1 = VATtoApply.getInstance(0.16);
	      
	      // Intenta instanciar un segundo singleton: debe devolver la misma instancia
	     VATtoApply va2 = VATtoApply.getInstance(0.20);
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
	     VATtoApply va3 = VATtoApply.getInstance(0.30);
	     System.out.println("Instancia 3: "+ va3.toString()+" VAT: "+ va3.getVatType());
	}

}
