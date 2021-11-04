package exercicioA;

import java.util.Date;

public class Pessoa {
	private long id;
	private String nome;
	private String email;
	private String telefone;
	private Date dataNascimento;
	private String usuario;
	private String senha;
	
	public Pessoa(long id, String nome, String email, String telefone, Date dataNascimento, String usuario,
			String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.usuario = usuario;
		this.senha = senha;
	}
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getTelefone() {
		return telefone;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
