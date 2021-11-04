package exercicioD;

import java.util.Date;

public class Deposito extends Pagamento {
	private String idDeposito;

	public Deposito(int valor_pag, String forma_pag, int parcelas_pag, Date data_pag, String banco_pag,
			String agencia_pag, String conta_pag, String idDeposito) {
		super(valor_pag, forma_pag, parcelas_pag, data_pag, banco_pag, agencia_pag, conta_pag);
		this.idDeposito = idDeposito;
	}

	public String getIdDeposito() {
		return idDeposito;
	}

	public void setIdDeposito(String idDeposito) {
		this.idDeposito = idDeposito;
	}

}
