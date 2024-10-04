package figuras;

public class Figura2D {
	protected double base;
	protected double altura;
	
	public Figura2D(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public Figura2D() {
		
	}
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
