package br.orcgra.domain;

public class Cliente {

	private String nome;
	private String telefone;
	private String cpf_cnpj;
	private char tipo_pessoa;
	private String email;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public char getTipo_pessoa() {
		return tipo_pessoa;
	}
	public void setTipo_pessoa(char tipo_pessoa) {
		this.tipo_pessoa = tipo_pessoa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}