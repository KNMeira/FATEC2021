package exercicioB;

public class JogoDeTabuleiro extends Jogo {
	private int qntdePecas;

	public JogoDeTabuleiro(String nomeJogo, String categoria, String fornecedor, char genero, float preco,
			int qntdePecas) {
		super(nomeJogo, categoria, fornecedor, genero, preco);
		this.qntdePecas = qntdePecas;
	}

	public int getQntdePecas() {
		return qntdePecas;
	}

	public void setQntdePecas(int qntdePecas) {
		this.qntdePecas = qntdePecas;
	}
	
	
}
