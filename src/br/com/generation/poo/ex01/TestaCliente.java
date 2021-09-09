package br.com.generation.poo.ex01;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Robinson");
		cliente1.setCpf("999.999.999.99");
		cliente1.setEndereço("Rua da Babilônia");
		cliente1.setIdade(48);
		
		System.out.println("O nome do cliente é: " + cliente1.getNome());
		System.out.println("O CPF do cliente é: " + cliente1.getCpf());
		System.out.println("O END do cliente é: " + cliente1.getEndereço());
		System.out.println("A idade do cliente é: " + cliente1.getIdade());
		
		cliente1.pagar();
		cliente1.reclamacao();
		
		

	}

}
