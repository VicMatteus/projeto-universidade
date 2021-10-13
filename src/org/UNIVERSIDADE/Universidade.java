package org.UNIVERSIDADE;

public class Universidade implements Expositor
{
	// Atributos
	private String nome;
	private int vagas, vagasF, vagasD;
	private Funcionario[] funcionarios;
	private int indiceF = 0;
	private Aluno[] alunos;
	private int indiceA = 0;
	private Disciplina[] disciplinas;
	private int indiceD = 0;

	// Criador
	public Universidade()
	{
		
	}

	public Universidade(String nome, int vagas)									//TIPO 2 DE POLIMORFISMO
	{
		this.setNome(nome);
		this.setVagas(vagas);
		this.setVagasF(4);
		this.setVagasD(3);
		funcionarios = new Funcionario[4];
		alunos = new Aluno[vagas];
		disciplinas = new Disciplina[3];

		System.out.println("Universidade " + this.getNome() + " criada!");
	}
	
	public Universidade(String nome, int vagas, int vagasF, int vagasD)			//TIPO 2 DE POLIMORFISMO
	{
		this.setNome(nome);
		this.setVagas(vagas);
		this.setVagasF(vagasF);
		this.setVagasD(vagasF);
		funcionarios = new Funcionario[vagasF];
		alunos = new Aluno[vagas];
		disciplinas = new Disciplina[vagasD];
		
		System.out.println("Universidade " + this.getNome() + " criada! A quantidade total de vagas para alunos, disciplinas e funcionarios foi definida pelo usu�rio.");
	}
	
	
	// M�todos GaS b�sicos
	public int getIndiceA()
	{
		return this.indiceA;
	}

	public int getIndiceF()
	{
		return this.indiceF;
	}

	public int getIndiceD()
	{
		return this.indiceD;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public int getVagas()
	{
		return vagas;
	}

	public void setVagas(int vagas)
	{
		this.vagas = vagas;
	}

	public int getVagasD()
	{
		return vagasD;
	}

	public void setVagasD(int vagasD)
	{
		this.vagasD = vagasD;
	}

	public int getVagasF()
	{
		return vagasF;
	}

	public void setVagasF(int vagasF)
	{
		this.vagasF = vagasF;
	}

	public String getFuncionario()
	{
		String funcInfo = "";
		for (int i = 0; i < indiceF; i++)
		{
			funcInfo += this.funcionarios[i].getInfo();
		}
		return funcInfo;
	}

	public boolean setFuncionario(Funcionario funcionario)
	{
		if (indiceF < vagasF) // <--necessita de altera��o em caso de mudan�a na quantidade de vagas para
							// funcionarios
		{
			funcionarios[indiceF] = funcionario;
			indiceF++;
			return true;
		} else
		{
			System.out.print("Imposs�vel contratar novos funcion�rios por insufici�ncia de vagas, ");
			return false;
		}
	}

	public Aluno[] getAluno()
	{
		return alunos;
	}

	public boolean setAluno(Aluno aluno)
	{
		if (indiceA < vagas)
		{
			alunos[indiceA] = aluno;
			indiceA++;
			return true;
		} else
		{
			System.out.print("Imposs�vel Matricular novos alunos por insufici�ncia de vagas, ");
			return false;
		}
	}

	// DISCIPLINA
	public String getDisciplina()
	{
		String discInfo = "";
		for (int i = 0; i < indiceD; i++)
		{
			discInfo += this.disciplinas[i].getInfo();
		}
		return discInfo;
	}

	public boolean setDisciplina(Disciplina disciplina)
	{
		if (indiceD < vagasD) // <--necessita de altera��o em caso de mudan�a na quantidade de vagas para
							// disciplinas - pode ser resolvido criando uma �nica vari�vel
		{
			disciplinas[indiceD] = disciplina;
			indiceD++;
			return true;
		} else
		{
			System.out.println("Imposs�vel cadastrar novas disciplinas por insufici�ncia de espa�os.");
			return false;
		}
	}

	private boolean procurarAlunoBoolean(Aluno aluno)
	{
		for (int j = 0; j < getIndiceA(); j++)
		{
			if (alunos[j] == aluno)
			{
				return true;
			}
		}
		return false;
	}
	private int procurarAlunoVetor(Aluno aluno)
	{
		for (int j = 0; j < getIndiceA(); j++)
		{
			if (alunos[j] == aluno)
			{
				return j;
			}
		}
		return -1;
	}
	
	private boolean procurarFuncionarioBoolean(Funcionario funcionario)
	{
		for (int j = 0; j < getIndiceF(); j++)
		{
			if (funcionarios[j] == funcionario)
			{
				return true;
			}
		}
		return false;
	}
	private int procurarFuncionarioVetor(Funcionario funcionario)
	{
		for (int j = 0; j < getIndiceF(); j++)
		{
			if (funcionarios[j] == funcionario)
			{
				return j;
			}
		}
		return -1;
	}

	// FIM_DISCIPLINA
	// FIM METODOS BASICOS

	// Metodos expostos para uso da universidade
	public void contratarFuncionario(Funcionario funcionario)
	{
		if (this.setFuncionario(funcionario))
		{
			funcionario.setId(indiceF);
			System.out.println("Funcionario " + funcionario.getNome() + " contratado!");
		} else
		{
			System.out.println(funcionario.getNome() + ".");
		}
	}

	public void matricularAluno(Aluno aluno)
	{
		if (this.setAluno(aluno))
		{
			System.out.println("Aluno " + aluno.getNome() + " matriculado!"); // corrigir
		} else
		{
			System.out.println(aluno.getNome() + ".");
		}
	}

	public void cadastrarDisciplina(Disciplina disciplina)
	{
		if (this.setDisciplina(disciplina))
		{
			System.out.println("Disciplina " + disciplina.getNome() + " cadastrada!");
		} else
		{

		}
	}

	public boolean procurarAluno(Aluno aluno)
	{
		System.out.println("Procurando aluno " + aluno.getNome() + " na universidade " + this.getNome() + ".");
		
		if(procurarAlunoBoolean(aluno))
		{
			System.out.println("Aluno encontrado. Seguem seus dados abaixo: \n" + aluno.getInfo());
			return true;
		}
		
		System.out.println("Aluno n�o matr�culado na universidade.");
		return false;
	}

	public boolean tornarBolsista(Aluno aluno)
	{
		if (procurarAlunoBoolean(aluno))
		{
			aluno.tornarbolsista(400);
			System.out.println("Encontrado.\nAluno " + aluno.getNome() + " ganhou uma bolsa no valor de R$ 400.");
			return true;
		} else
		{
			System.out.println("Aluno nao encontrado na universidade.");
			return false;
		}
	}

	public void expulsarAluno(Aluno aluno)
	{
		if (procurarAlunoBoolean(aluno))
		{
			alunos[procurarAlunoVetor(aluno)] = null;
			indiceA--;
			System.out.println("Aluno exclu�do com sucesso.");
		} else
		{
			System.out.println("Aluno n�o encontrado na universidade.");
		}
	}

	public void procurarFuncionario(Funcionario funcionario)
	{
		if(procurarFuncionarioBoolean(funcionario))
		{
			System.out.println("Funcionario encontrado. Seguem seus dados abaixo: \n" + funcionario.getInfo());
		}
		else
		{
			System.out.println("Funcion�rio " + funcionario.getNome() + " n�o encontrado no banco de dados.");
		}
	}

	public void demitirFuncionario(Funcionario funcionario)
	{
		if(procurarFuncionarioBoolean(funcionario))
		{
			funcionarios[procurarFuncionarioVetor(funcionario)] = null;
			indiceF--;
			System.out.println("Funcion�rio demitido com sucesso.");
		}
	}
	// metodo de informa��es completas da universidade
	public String getInfo()
	{
		String uniInfo = "Seguem abaixo os dados da universidade consultada:\n";
		uniInfo += "\nNome da Universidade: " + this.getNome();
		uniInfo += "\nTotal de vagas: " + this.getVagas() + "      Vagas ocupadas: " + this.getIndiceA();
		uniInfo += "\nEspa�o total para disciplinas: "+ this.getVagasD() + "   Quantidade de disciplinas cadastradas: "
				+ this.getIndiceD(); // <--necessita de altera��o em caso de mudan�a na quantidade de vagas para
										// funcionarios
		uniInfo += "\nDisciplinas disponiveis: \n" + this.getDisciplina();
		
		uniInfo += "\nVagas para funcion�rios: " + this.getVagasF() + " Funcion�rios contratados: " + this.getFuncionario();

		return uniInfo;
	}

	// metodos para alunos

	public void cadastrarCadeira(Graduando aluno, Disciplina disciplina)
	{
		if (aluno.cadastrarCadeira(disciplina))
		{
			System.out.println("Cadeira " + disciplina.getNome() + " cadastrada com sucesso, " + aluno.getNome() + ".");
		} else
		{
			System.out.println(
					"Imposs�vel cadastrar " + disciplina.getNome() + " por falta de espa�o, " + aluno.getNome() + ".");
		}
	}

}
