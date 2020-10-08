package ule.iso1.singleton;

import org.junit.Assert;
import org.junit.Test;

public class VAT_Test {

	@Test
	public void test() {
		   
	     // Instancia la variable singleton
	     VATtoApply va1 = VATtoApply.getInstance(0.16);
	 
	 
	     // Intenta instanciar un segundo singleton: debe devolver la misma instancia
	     VATtoApply va2 = VATtoApply.getInstance(0.20);
	 
	     // Comprueba que ambos objetos son referencias a la misma
	     // instancia, que es única
	     Assert.assertEquals(va1.toString(), va2.toString());
	     Assert.assertEquals(va1.getVatType(), va2.getVatType(),0.0);
	     Assert.assertEquals(0.16, va1.getVatType(),0.0);
	     Assert.assertEquals(0.16, va2.getVatType(),0.0);
		   
	   
	     //Modifica el valor del iva en una de las variables (modifica la única instancia que hay) 
	     va1.setVatType(0.04);
	     
	     // Comprueba que todas las variables acceden a la misma instancia modificada
	     Assert.assertEquals(va1.toString(), va2.toString());
	     Assert.assertEquals(va1.getVatType(), va2.getVatType(),0.0);
	     Assert.assertEquals(0.04, va1.getVatType(),0.0);
	     Assert.assertEquals(0.04, va2.getVatType(),0.0);
		   
	    
	     // Intenta instanciar una tercera variable: Todas acceden a la misma instancia
	     VATtoApply va3 = VATtoApply.getInstance(30);
	     Assert.assertEquals(va3.toString(), va2.toString());
	     Assert.assertEquals(0.04, va3.getVatType(),0.0);
	     Assert.assertEquals(0.04, va2.getVatType(),0.0);
	}
	
	

}
