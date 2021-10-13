package org.UNIVERSIDADE;

public class Professor extends Funcionario implements Expositor
{
	private String formacao;
	private double bonus = 0.2;

	// criador
	public Professor ()
	{
		
	}
	
	public Professor(String nome, String formacao, double salario)
	{
		super(nome, salario);
		this.setSalario(salario);				
		this.setFormacao(formacao);
		System.out.println("Professor " + this.getNome() + " criado!");
	}

	//metodos b�sicos
	public String getFormacao()
	{
		return formacao;
	}

	public void setFormacao(String formacao)
	{
		this.formacao = formacao;
	}
	//Fim metodos b�sicos
	
	public double getSalario()
	{
		return salario;
	}

	public void setSalario(double salario)
	{
		super.salario = salario + (salario * this.bonus);
	}
	//Extrator de dados
	
	public String getInfo()
	{
		String infoF = "\nNome do funcion�rio: " + this.getNome();
		infoF += "\nIdentifica��o do funcionario: " + this.getId();
		infoF += "\nSal�rio do funcionario: R$ " + Double.toString(this.getSalario());
		infoF += "\nForma��o do professor: " + this.getFormacao() + "\n";

		return infoF;
	}

}
