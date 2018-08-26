package forma;

public class Triangulo implements FormaGeometrica{
	
	private double altura;
	private double base;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return (this.base * this.altura) / 2;
	}
	
}