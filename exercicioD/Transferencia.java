package exercicioD;

import java.util.Date;

public class Transferencia extends Pagamento {
	private String tipo;
	private String codIdentificacao;
	
	public Transferencia(int valor_pag, String forma_pag, int parcelas_pag, Date data_pag, String banco_pag,
			String agencia_pag, String conta_pag, String tipo, String codIdentificacao) {
		super(valor_pag, forma_pag, parcelas_pag, data_pag, banco_pag, agencia_pag, conta_pag);
		this.tipo = tipo;
		this.codIdentificacao = codIdentificacao;
	}
	
	public String getTipo() {
		return tipo;
	}
	public String getCodIdentificacao() {
		return codIdentificacao;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setCodIdentificacao(String codIdentificacao) {
		this.codIdentificacao = codIdentificacao;
	}
	
	
}
