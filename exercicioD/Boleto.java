package exercicioD;

import java.util.Date;

public class Boleto extends Pagamento {
	private String codCliente;
	private String nomeCliente;

	public Boleto(int valor_pag, String forma_pag, int parcelas_pag, Date data_pag, String banco_pag,
			String agencia_pag, String conta_pag, String codCliente, String nomeCliente) {
		super(valor_pag, forma_pag, parcelas_pag, data_pag, banco_pag, agencia_pag, conta_pag);
		this.codCliente = codCliente;
		this.nomeCliente = nomeCliente;
	}

	public String getCodCliente() {
		return codCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

}
