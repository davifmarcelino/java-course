package model.entities;

import java.util.Date;

public class Parcelas {
	
	private Date dataDePagamento;
	private double valorDaParcela;
	
	public Parcelas(Date dataDePagamento, double valorDaParcela) {
		this.dataDePagamento = dataDePagamento;
		this.valorDaParcela = valorDaParcela;
	}
	
	public Date getDataDePagamento() {
		return dataDePagamento;
	}
	public void setDataDePagamento(Date dataDePagamento) {
		this.dataDePagamento = dataDePagamento;
	}
	public double getValorDaParcela() {
		return valorDaParcela;
	}
	public void setValorDaParcela(double valorDaParcela) {
		this.valorDaParcela = valorDaParcela;
	}
	
	
}
