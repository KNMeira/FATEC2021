package exercicioE;

public class Livro extends Produto {
	private String autor;
	private long isbn;

	public Livro(int codigo, double preco, String autor, long isbn) {
		super(codigo, preco);
		this.autor = autor;
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

}
