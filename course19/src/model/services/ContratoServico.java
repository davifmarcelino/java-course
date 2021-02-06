package model.services;

import model.entities.Contrato;

public class ContratoServico {
	
	private Contrato contrato;
	private int meses;
	
	private PagamentoServico pagamento;

	public ContratoServico(Contrato contrato, int meses, PagamentoServico pagamento) {
		this.contrato = contrato;
		this.meses = meses;
		this.pagamento = pagamento;
	}
	
	public double valor = pagamento.pagamento(contrato.getValor(),meses);
	
}
