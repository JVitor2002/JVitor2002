package figuras;

public class Triangulo  extends Figura2D{
	private String tipo;
	
	public Triangulo(double base, double altura, String tipo) {
		super(base, altura);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double calcularArea() {
		double calculo = base * altura / 2;
		return calculo;
	}
}
