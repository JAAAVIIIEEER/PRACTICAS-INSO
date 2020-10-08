package ule.iso1.singleton;



public class VATtoApply {
	private VATtoApply uniqueInstance = null; 
  	private double vatType;

  	private VATtoApply(double vat) {
    		vatType = vat;
   	}
  	public static VATtoApply getInstance(double vatType) {
		if(uniqueInstance == null) {
			VATtoApply uniqueInstance = new VATtoApply(vatType);
		}
		return uniqueInstance;
   	}	

	public double getVatType() {
		return vatType;
	}

	public void setVatType(double vatType) {
		this.vatType = vatType;
	}
}