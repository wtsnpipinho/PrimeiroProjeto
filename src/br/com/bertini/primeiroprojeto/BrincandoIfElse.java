package br.com.bertini.primeiroprojeto;

public class BrincandoIfElse {

	public static void main(String[] args) {
		
		int idade = 15;
		boolean amigoDono = true;
		if(idade > 18 && amigoDono == true)
		{
			System.out.println("Entra");
			
		}
		else
		{
			System.out.println("Não Entra");
			amigoDono = false;
		}

	}

}
