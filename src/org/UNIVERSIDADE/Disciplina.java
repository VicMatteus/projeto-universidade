package org.UNIVERSIDADE;

public class Disciplina implements Expositor
{
	// Atributos
	private String nome;
	private String cargaHorariaString;
	private Professor professor;

	// Criador
	public Disciplina()
	{

	}

	public Disciplina(String nome, String cargaHorariaString, Professor professor)
	{
		this.setNome(nome);
		this.setCargaHorariaString(cargaHorariaString);
		this.setProfessor(professor);

		System.out.println("Disciplina " + this.getNome() + " criada!");
	}

	// Metodos b�sicos
	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getCargaHorariaString()
	{
		return cargaHorariaString;
	}

	public void setCargaHorariaString(String cargaHorariaString)
	{
		this.cargaHorariaString = cargaHorariaString;
	}

	public Professor getProfessor()
	{
		return professor;
	}

	public void setProfessor(Professor professor)
	{
		this.professor = professor;
	}
	//fim dos m�todos b�sicos
	
	
	// info da disciplina
	public String getInfo()
	{
		String info = "Nome da disciplina: " + this.getNome();
		info += "\nA carga hor�ria �: " + this.getCargaHorariaString() + " horas.";
		info += "\nProfessor(a): " + getProfessor().getNome() + "\n";

		return info;
	}

}
