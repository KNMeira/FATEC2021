package exercicioF;

public class Poligono {
	
	private int vertices;
    private int lado;
    private  double perimetro;
    private double area;
    private int valor;
    
	public Poligono(int vertices) {
		this.vertices = vertices;
	}

	public int getNumVertices() {
		return vertices;
	}

	public void setvertices(int vertices) {
		this.vertices = vertices;
	}
	
	public double perimetro() {
		return 0;
	}
	
	public double area() {
		return 0;
	}


}