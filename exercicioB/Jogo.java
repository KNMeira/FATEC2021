package exercicioB;

public class Jogo {
	private String nomeJogo;
	private String categoria;
	private String fornecedor;
	private char genero;
	private float preco;
	
	public Jogo(String nomeJogo, String categoria, String fornecedor, char genero, float preco) {
		this.nomeJogo = nomeJogo;
		this.categoria = categoria;
		this.fornecedor = fornecedor;
		this.genero = genero;
		this.preco = preco;
	}
	
	public String getNomeJogo() {
		return nomeJogo;
	}
	public String getCategoria() {
		return categoria;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public char getGenero() {
		return genero;
	}
	public float getPreco() {
		return preco;
	}
	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	
	
}
