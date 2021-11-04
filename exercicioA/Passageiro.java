package exercicioA;

import java.util.Date;

public class Passageiro extends Pessoa {
	private String numeroCartao;
	private String documento;
	
	public Passageiro(long id, String nome, String email, String telefone, Date dataNascimento, String usuario,
			String senha) {
		super(id, nome, email, telefone, dataNascimento, usuario, senha);
	}
	
	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public String getDocumento() {
		return documento;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	
}
