package br.com.bertini.primeiroprojeto;

import java.util.ArrayList;
import java.util.List;

public class TesteFor {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente();
		cli1.setNome("Cliente 1");
		
		Cliente cli2 = new Cliente();
		cli2.setNome("Cliente 2");
		
		List<Cliente> listaCliente = new ArrayList<>();
		listaCliente.add(cli1);
		listaCliente.add(cli2);
		
		for (Cliente cliente : listaCliente) 
		{
		
		System.out.println(cliente.getNome());

	    }

	}
	}
