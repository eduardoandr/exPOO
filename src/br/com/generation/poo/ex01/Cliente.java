package br.com.generation.poo.ex01;

public class Cliente {
	
	//Atributos --> variaveis
	
	private String nome;
	private String cpf;
	private String endere�o;
	private int idade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//M�todo 
	void pagar() {
		System.out.println("O cliente esta efetuando o pagamento");
	}
	void reclamacao() {
		System.out.println("O cliente iniciou uma reclama��o");
	}
	

}
