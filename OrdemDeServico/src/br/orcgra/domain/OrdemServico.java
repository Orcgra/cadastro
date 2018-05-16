package br.orcgra.domain;

import java.util.Date;

public class OrdemServico {

	private int ticket;
	private Date data;
	private double valor;
	private String descricao;
	private double valor_total;
	private int tempo_utilizado;

	public OrdemServico() {
	 
}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor_total() {
		return valor_total;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}

	public int getTempo_utilizado() {
		return tempo_utilizado;
	}

	public void setTempo_utilizado(int tempo_utilizado) {
		this.tempo_utilizado = tempo_utilizado;
	}
	
}