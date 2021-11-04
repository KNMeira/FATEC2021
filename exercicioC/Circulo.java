package exercicioC;

public class Circulo extends Figura{
	private float raio;

	public Circulo(String color, float raio) {
		super(color);
		this.raio = raio;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	@Override
	public float area(float raio) {
		float area = (float) (Math.PI * raio * raio);
		return area;
	}
	
}
