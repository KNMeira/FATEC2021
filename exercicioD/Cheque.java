package exercicioD;

import java.util.Date;

public class Cheque extends Pagamento {
	private String financeira;
	private String nomeCliente;
	private String numero;
	private Date dataAbertura;

	public Cheque(int valor_pag, String forma_pag, int parcelas_pag, Date data_pag, String banco_pag,
			String agencia_pag, String conta_pag, String financeira, String nomeCliente, String numero,
			Date dataAbertura) {
		super(valor_pag, forma_pag, parcelas_pag, data_pag, banco_pag, agencia_pag, conta_pag);
		this.financeira = financeira;
		this.nomeCliente = nomeCliente;
		this.numero = numero;
		this.dataAbertura = dataAbertura;
	}

	public String getFinanceira() {
		return financeira;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getNumero() {
		return numero;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setFinanceira(String financeira) {
		this.financeira = financeira;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

}
