package br.orcgra.domain;

public class TipoServico {
 
	private int id_tipo;
	private String descricao;
	private double valor;
	private int tempo_estimado;
	
	public int getId_tipo() {
		return id_tipo;
	}
	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getTempo_estimado() {
		return tempo_estimado;
	}
	public void setTempo_estimado(int tempo_estimado) {
		this.tempo_estimado = tempo_estimado;
	}
	
	

}
