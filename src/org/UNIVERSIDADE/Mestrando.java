package org.UNIVERSIDADE;

public class Mestrando extends Aluno
{
	//Atributos
	private String temaDoMestrado;
	private String semestreAtual;
	private String semestresTotais;
	
	//construtor
	public Mestrando(String nome, String matricula, String tema, String atual, String total)
	{
		super(nome, matricula);
		this.setTemaDoMestrado(tema);
		this.setSemestreAtual(atual);
		this.setSemestresTotais(total);
		this.setBolsista(true);
		this.setBolsa(1800.00);
		
		System.out.println("Aluno de mestrado " + this.getNome() + " criado!");
	}

	//M�todos

	public String getTemaDoMestrado()
	{
		return temaDoMestrado;
	}
	public void setTemaDoMestrado(String temaDoMestrado)
	{
		this.temaDoMestrado = temaDoMestrado;
	}
	public String getSemestreAtual()
	{
		return semestreAtual;
	}
	public void setSemestreAtual(String semestreAtual)
	{
		this.semestreAtual = semestreAtual;
	}
	public String getSemestresTotais()
	{
		return semestresTotais;
	}
	public void setSemestresTotais(String semestresTotais)
	{
		this.semestresTotais = semestresTotais;
	}
	
	//M�todo extrator de informa��es
	public String getInfo()
	{
		String dados = "O nome do aluno �: " + this.getNome();
		dados += "\nMatricula: " + this.getMatricula();
		dados += "\nTema do mestrado: " + this.getTemaDoMestrado();
		dados += "\nSemestre atual: " + this.getSemestreAtual() + "   Semestres at� a conclus�o: " + this.getSemestresTotais();
		dados += "\nRecebe R$ " + Double.toString(this.getBolsa()) + " por sua pesquisa.";
		
		return dados;
	}
	
	
}
