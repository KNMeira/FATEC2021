package exercicioD;

import java.util.Date;

public class Pagamento {
	private int valor_pag;
	private String forma_pag;
	private int parcelas_pag;
	private Date data_pag;
	private String banco_pag;
	private String agencia_pag;
	private String conta_pag;

	public Pagamento(int valor_pag, String forma_pag, int parcelas_pag, Date data_pag, String banco_pag,
			String agencia_pag, String conta_pag) {
		this.valor_pag = valor_pag;
		this.forma_pag = forma_pag;
		this.parcelas_pag = parcelas_pag;
		this.data_pag = data_pag;
		this.banco_pag = banco_pag;
		this.agencia_pag = agencia_pag;
		this.conta_pag = conta_pag;
	}

	public int getValor_pag() {
		return valor_pag;
	}

	public String getForma_pag() {
		return forma_pag;
	}

	public int getParcelas_pag() {
		return parcelas_pag;
	}

	public Date getData_pag() {
		return data_pag;
	}

	public String getBanco_pag() {
		return banco_pag;
	}

	public String getAgencia_pag() {
		return agencia_pag;
	}

	public String getConta_pag() {
		return conta_pag;
	}

	public void setValor_pag(int valor_pag) {
		this.valor_pag = valor_pag;
	}

	public void setForma_pag(String forma_pag) {
		this.forma_pag = forma_pag;
	}

	public void setParcelas_pag(int parcelas_pag) {
		this.parcelas_pag = parcelas_pag;
	}

	public void setData_pag(Date data_pag) {
		this.data_pag = data_pag;
	}

	public void setBanco_pag(String banco_pag) {
		this.banco_pag = banco_pag;
	}

	public void setAgencia_pag(String agencia_pag) {
		this.agencia_pag = agencia_pag;
	}

	public void setConta_pag(String conta_pag) {
		this.conta_pag = conta_pag;
	}

}
