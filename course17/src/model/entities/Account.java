package model.entities;

import model.exceptions.Regras;

public class Account {
	private Integer numero;
	private String nome;
	private Double saldo;
	private Double limite;	
	
	public Account(Integer numero, String nome, Double saldo, Double limite) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}


	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	public void deposito(Double valor) {
		saldo+=valor;
	}
	
	public void saque(Double valor) throws Regras {
	if(limite<valor) {
			throw new Regras("Saque maior que o limite permitido"); 
		}
	if(saldo<valor) {
		throw new Regras("Saldo insuficiente para saque");
	}
		saldo-=valor;
	}
	
	@Override
	public String toString() {
		return "Saldo atualizado: "+getSaldo();
	}
	
}
