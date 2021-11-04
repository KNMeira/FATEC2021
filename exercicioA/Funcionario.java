package exercicioA;

import java.util.Date;

public class Funcionario extends Pessoa {
	private String codigo;
	private String contaCorrente;
	
		public Funcionario(long id, String nome, String email, String telefone, Date dataNascimento, String usuario,
			String senha, String codigo, String contaCorrente) {
		super(id, nome, email, telefone, dataNascimento, usuario, senha);
		this.codigo = codigo;
		this.contaCorrente = contaCorrente;
	}
		
	public String getCodigo() {
		return codigo;
	}
	public String getContaCorrente() {
		return contaCorrente;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setContaCorrente(String contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	
	

}
