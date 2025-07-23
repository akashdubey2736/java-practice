package practice.java.oop.classandinheritence;

public class ComplexNumber {
	
	private double real;
	private double imaginary;
	
	public ComplexNumber(double real, double imaginary) {
		this.real=real;
		this.imaginary=imaginary;
		
	}
	
	public double getReal() {
		return this.real;
	}
	
	public double getImaginary() {
		return this.imaginary;
	}
	
	public void add(double real, double imaginary) {
		 this.real+=real ;
		 this.imaginary+=imaginary ;
		 
		}
	
	public void add(ComplexNumber compNumber) {
		this.real+=compNumber.real;
		this.imaginary+=compNumber.imaginary;
		
	}
	
	public void subtract(double real, double imaginary) {
		 this.real-=real ;
		 this.imaginary-=imaginary ;
		 
		}
	
	public void subtract(ComplexNumber compNumber) {
		this.real-=compNumber.real;
		this.imaginary-=compNumber.imaginary;
		
	}

}
