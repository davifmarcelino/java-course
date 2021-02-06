package model.services;

public class Paypal implements PagamentoServico{
	
	public double pagamento(double valor,  int meses) {
		return (valor+(valor*0.01*meses))*1.02;
	}

}
