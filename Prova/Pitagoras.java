package Prova;

public class Pitagoras  extends Trigonometria{

	public Pitagoras(double hipotenusa, double cateto_oposto, double cateto_adjacente) {
		super(hipotenusa, cateto_oposto, cateto_adjacente);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double calcular_Trigonometria(double catAdjacente, double catOposto) {
		double hipotenusaCorreta = Math.hypot(catAdjacente, catOposto);	
		this.setHipotenusa(hipotenusaCorreta);
			return this.getHipotenusa();
	}
	
}
