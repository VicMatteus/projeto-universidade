package org.UNIVERSIDADE;

public class Graduando extends Aluno
{
	//Atributos
	private String curso;
	private String semestreAtual;
	private String semestresTotais;
	private Disciplina[] disciplinas;
	private int indice = 0;

	
	//criador
	public Graduando(String nome, String matricula, String curso, String semestreAtual, String semestresTotais)
	{
		super(nome, matricula);
		this.setCurso(curso);
		this.setSemestreAtual(semestreAtual);
		this.setSemestresTotais(semestresTotais);
		disciplinas = new Disciplina[7];
		
		System.out.println("Aluno de gradua��o " + this.getNome() + " criado!");
	}
	
	//M�todos
	public String getCurso()
	{
		return curso;
	}
	public void setCurso(String curso)
	{
		this.curso = curso;
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
	//fim metodos b�sicos
	
	//Metodos especificos de cadeiras
	public boolean cadastrarCadeira(Disciplina disciplina)
	{
		if (indice < 7)
		{
			disciplinas[indice] = disciplina;
			indice++;
			return true;
		} else
		{
			return false;
		}
	}
	public void mostrarCadeiras()
	{
		
		System.out.println("\nAs cadeiras em que o/a aluno(a) " + this.getNome() + " est� matriculado(a) s�o: ");
		for(int i = 0; i<indice; i++)         
		{
			System.out.println(disciplinas[i].getInfo());
		}
	}
	public String getCadeiras()
	{
		String cadeirasI = "";
		for(int i = 0; i<indice; i++)         
		{
			cadeirasI += disciplinas[i].getInfo() + "\n";
		}
		return cadeirasI;
	}
	
	//fim das cadeiras
	
	//M�todo extrator de informa��es
		public String getInfo()								//polimorfismo tipo 1 para aluno
		{
			String dados = "O nome do aluno �: " + this.getNome();
			dados += "\nMatricula: " + this.getMatricula();
			dados += "\nCurso: " + this.getCurso();
			dados += "\nSemestre atual: " + this.getSemestreAtual() + "   Semestres at� a conclus�o: " + this.getSemestresTotais();
			dados += "\nEst� matriculado nas seguintes cadeiras: \n" + this.getCadeiras();
			if(this.isBolsista())
			{
				dados += "\nEste aluno recebe uma bolsa de R$ " + Double.toString(this.getBolsa());
			}
			
			return dados;
		}
	
}
