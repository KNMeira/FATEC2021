package exercicioB;

public class VideoGame extends Jogo {
	private String paisDeOrigem;
	private String modelo;
	
	public VideoGame(String nomeJogo, String categoria, String fornecedor, char genero, float preco,
			String paisDeOrigem, String modelo) {
		super(nomeJogo, categoria, fornecedor, genero, preco);
		this.paisDeOrigem = paisDeOrigem;
		this.modelo = modelo;
	}
	
	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}
	public String getModelo() {
		return modelo;
	}
	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
