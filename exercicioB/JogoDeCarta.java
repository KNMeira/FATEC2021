package exercicioB;

public class JogoDeCarta extends Jogo {
	private int qntdeCartas;
	

	public JogoDeCarta(String nomeJogo, String categoria, String fornecedor, char genero, float preco,
			int qntdeCartas) {
		super(nomeJogo, categoria, fornecedor, genero, preco);
		this.qntdeCartas = qntdeCartas;
	}

	public int getQntdeCartas() {
		return qntdeCartas;
	}

	public void setQntdeCartas(int qntdeCartas) {
		this.qntdeCartas = qntdeCartas;
	}
	
	
}
