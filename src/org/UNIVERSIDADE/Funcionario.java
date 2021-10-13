package org.UNIVERSIDADE;

public abstract class Funcionario
{
	// Atributos
	protected String nome;
	protected int id;
	protected double salario;
	protected double bonus = 1;

	// criador
	public Funcionario()
	{
	
	}

	public Funcionario(String nome, double salario)
	{
		this.setNome(nome);
		this.setSalario(salario);
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

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public double getSalario()
	{
		return salario;
	}

	public void setSalario(double salario)
	{
		this.salario = salario;
	}
	
	//Fim métodos básicos

	// extrator de dados
	public abstract String getInfo();
	

}
