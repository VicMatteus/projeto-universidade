package org.UNIVERSIDADE;

public class Administrador extends Funcionario implements Expositor
{
	//ATRIBUTOS
	private int senha;
	private String area;
	private double bonus = 0.1;
	
	//CONSTRUTOR
	public Administrador(String nome, String area, double salario, int senha)
	{
		super(nome, salario);
		this.setSalario(salario);				
		this.setArea(area);
		this.setSenha(senha);
		System.out.println("Administrador " + this.getNome() + " criado!");
	}

	//METODOS BÁSICOS
	public int getSenha()
	{
		return senha;
	}
	public void setSenha(int senha)
	{
		this.senha = senha;
	}

	public String getArea()
	{
		return area;
	}
	public void setArea(String area)
	{
		this.area = area;
	}

	public double getBonus()
	{
		return bonus;
	}
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	//FIM DOS METODOS BÁSICOS
	
	//METODOS ESPECIFICOS
	public void setSalario(double salario)
	{
		this.salario = salario + (salario * this.bonus);
	}
	
	public boolean autenticarFuncionario(int senha)
	{
		if(this.getSenha() == senha)
		{
			System.out.println("Administrador " + this.getNome() +" autenticado com sucesso.");
			return true;
		}
		else
		{
			System.out.println("Erro na autenticação. Tente novamente.");
			return false;
		}
	}
	
	//METODO EXPOSITOR
	public String getInfo()			//TIPO 1 DE POLIMORFISMO
	{
		String infoF = "\nNome do funcionário: " + this.getNome();
		infoF += "\nIdentificação do funcionario: " + Integer.toString(this.getId());
		infoF += "\nSalário do funcionario: R$ " + Double.toString(this.getSalario());
		infoF += "\nÁrea do administrador: " + this.getArea() + "\n";

		return infoF;
	}
}
