package org.UNIVERSIDADE;

public class Aluno implements Expositor
{
	// Atributos
	private String nome;
	private String matricula;
	private boolean bolsista;
	private double bolsa;

	// criador
	public Aluno(String nome, String matricula)
	{
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setBolsista(false);
	}

	
	// Métodos básicos
	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getMatricula()
	{
		return matricula;
	}

	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}
	
	public boolean isBolsista()
	{
		return bolsista;
	}
	public void setBolsista(boolean bolsista)
	{
		this.bolsista = bolsista;
	}

	public double getBolsa()
	{
		return bolsa;
	}
	public void setBolsa(double bolsa)
	{
		this.bolsa = bolsa;
	}
	//Fim dos métodos básicos
	
	public void tornarbolsista(double valor)
	{
		this.setBolsista(true);
		this.setBolsa(valor);
	}
	//Método extrator de informações
	public String getInfo()								//polimorfismo tipo 1 para graduando
	{
		String dados = "O nome do aluno é: " + this.getNome();
		dados += "\nMatricula: " + this.getMatricula();

		return dados;
	}
}
