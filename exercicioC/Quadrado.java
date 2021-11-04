package exercicioC;

public class Quadrado extends Figura{
	private float lado;

	public Quadrado(String color, float lado) {
		super(color);
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	@Override
	public float area(float lado) {
		float area = lado * lado;
		return area;
	}
}
