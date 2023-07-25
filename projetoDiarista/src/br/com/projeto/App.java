package br.com.projeto;

import br.com.classes.Cliente;
import br.com.classes.Pessoa;

public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente();
		
		cliente.nome = "Daniel";
		cliente.telefone = "(11) 777-777";
		cliente.endereco = "Rua das Americas";
		
		
		System.out.println("Nome Cliente: " + cliente.nome);
		System.out.println("Telefone Cliente: " + cliente.telefone);
		System.out.println("Endereço Cliente: " + cliente.endereco);
		System.out.println("Endereço Cliente: " + cliente.saldo);
		
		Diarista diarista = new Diarista();
		
		diarista.nome = "João";
		diarista.telefone = "(11) 555-555";
		diarista.endereco = "Av, Cajamar, 111";
		
		System.out.println("Nome Diarista: " + cliente.nome);
		System.out.println("Telefone Diarista: " + cliente.telefone);
		System.out.println("Endereço Diarista " + cliente.endereco);
		System.out.println("Endereço Diarista: " + cliente.chavepix);
		
	
	}
	
	
	
	
	
}
