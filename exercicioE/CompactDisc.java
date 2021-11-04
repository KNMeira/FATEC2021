package exercicioE;

public class CompactDisc extends Produto {
	private String artista;
	private String gravadora;

	public CompactDisc(int codigo, double preco, String artista, String gravadora) {
		super(codigo, preco);
		this.artista = artista;
		this.gravadora = gravadora;
	}

	public String getArtista() {
		return artista;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

}
