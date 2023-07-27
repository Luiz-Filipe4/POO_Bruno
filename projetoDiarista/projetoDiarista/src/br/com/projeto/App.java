package br.com.projeto;

import br.com.classes.Atendimento;
import br.com.classes.Cliente;
import br.com.classes.Diarista;

public class App {

	public static void main(String[] args) {
		
		Diarista diarista = new Diarista();
		
		diarista.nome = "João Kleber";
		diarista.telefone = "(11) 98787-8924";
		diarista.endereço = "Avenida Cajamar, Nº 666";
		diarista.chavePix = "123";
		
		System.out.println("Nome Diarista: " + diarista.nome);
		System.out.println("Telefone Diarista: " + diarista.telefone);
		System.out.println("Endereço Diarista: " + diarista.endereço);
		System.out.println("Chave Pix Diarista: " + diarista.chavePix);
		diarista.atender("Daniel Petinice");
		
		Cliente cliente = new Cliente();
		
		System.out.println("====================================================");
		
		cliente.nome = "Daniel Petinice";
		cliente.telefone = "(11) 91283-7293";
		cliente.endereço = "Avenida Pirapora, Nº 333";
		cliente.saldo = 100;
		
		System.out.println("Nome Cliente: " + cliente.nome);
		System.out.println("Telefone Cliente: " + cliente.telefone);
		System.out.println("Endereço Cliente: " + cliente.endereço);
		System.out.println("Saldo Cliente: " + cliente.saldo);
		
		
		System.out.println("====================================================");
		
		Atendimento atendimento = new Atendimento();
		
		atendimento.horas = 10;
		System.out.println(atendimento.horas);
	}

}
