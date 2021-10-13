package org.UNIVERSIDADE;
import java.util.Scanner;
public class Principal
{

	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		try
		{
			//Set básico da universidade
			//CRIAÇÃO DAS ENTIDADES
			//Este código possui um "CRUD". É possível criar, procurar, atualizar
			//(basta atualizar os dados individualmente por meio do comando especifico da claase) e apagar.
			
	//CRIAÇÃO DA UNIVERISDADE
			//tente passar como parâmetro paraa criação da universidade o seguinte: ("UFC", 4, 5, 4), para ver uma diferença no resto do código inteiro
			Universidade u1 = new Universidade("UFC", 3);
			
			System.out.println("===================================================");
			
	//CRIAÇÃO DOS PROFESSORES
			Professor p1 = new Professor("Ciro", "Matemática" , 12000);
			Professor p2 = new Professor("Hilma", "Física num sei das quanta", 12500);
			Professor p3 = new Professor("João", "Analise de Sistemas" , 14000);
			Professor p4 = new Professor("Josefino", "Química" , 10000);
			
	//CRIAÇÃO DOS ADMINISTRADORES
			Administrador a1 = new Administrador("Rosicreusa da Adm", "RH", 6000, 1324);
			
	//CRIAÇÃO DAS DISCIPLINAS
			System.out.println("==========================================================================================");
			Disciplina d1 = new Disciplina("Cálculo Vetorial Aplicado", "96", p1);
			Disciplina d2 = new Disciplina("Eletromagnetismo Básico", "96", p2);
			Disciplina d3 = new Disciplina("Programação orientada a objeto", "64", p3);
			Disciplina d4 = new Disciplina("Química Geral", "128", p4);
	
	//CRIAÇÃO DOS ALUNOS
			System.out.println("==========================================================================================");
			Graduando g1 = new Graduando("Vitor Mateus", "470879", "Engenharia de Computação","3", "10");
			Graduando g2 = new Graduando("Karen Pereira", "470880", "Engenharia de Computação","1", "10");
			Aluno m1 = new Mestrando("José Maria", "470881", "Utilização total de energia elétrica","1", "4");    //TIPO 3 DE POLIMORFISMO
			Aluno g3 = new Graduando("Diogines Abastado", "470882", "Engenharia aeroespacial","1", "10");
			
	//   FIM CRIAÇÃO DAS ENTIDADES
		
	//CONTRATAÇÕES DE FUNCIONARIOS
			System.out.println("==========================================================================================");
			u1.contratarFuncionario(p1);
			u1.contratarFuncionario(p2);
			u1.contratarFuncionario(p3);
			u1.contratarFuncionario(a1);
			u1.contratarFuncionario(p4); //insuficiencia de vagas
	
	//CADASTROS DE CADEIRAS NA UNIVERSIDADE		
			System.out.println("==========================================================================================");
			u1.cadastrarDisciplina(d1);
			u1.cadastrarDisciplina(d2);
			u1.cadastrarDisciplina(d3);
			u1.cadastrarDisciplina(d4);  //insuficiencia de vagas
			
	//MATRICULAR ALUNOS NA UNIVERSIDADE
			System.out.println("==========================================================================================");
			u1.matricularAluno(g1);
			u1.matricularAluno(g2);
			u1.matricularAluno(m1);   
			u1.matricularAluno(g3);		//o programa deve informar que é impossível fazer isso
			
	//CADASTRAR ALUNOS NAS CADEIRAS
			System.out.println("============================================================");
			u1.cadastrarCadeira(g1, d1);
			u1.cadastrarCadeira(g1, d2);
			u1.cadastrarCadeira(g1, d3);
			
			u1.cadastrarCadeira(g2, d1);
			u1.cadastrarCadeira(g2, d2);
			
			
			
	//EXIBIR CADEIRAS DE CADA ALUNO
			System.out.println("==========================================================================================");
			g1.mostrarCadeiras();
			g2.mostrarCadeiras();
	
	//MOSTRAR INFORMAÇÕES GERAIS DA UNIVERSIDADE
			System.out.println("==========================================================================================");
			System.out.println(u1.getInfo());
	
	//TESTE DA BUSCA DE ALUNOS NA UNIVERSIDADE
			System.out.println("==========================================================================================");
			u1.procurarAluno(g1);
			u1.procurarAluno(m1);
			
	//TESTE DE TORNAR UM ALUNO BOLSISTA BOLSISTA	
			System.out.println("==========================================================================================");
			u1.tornarBolsista(g1);
			u1.tornarBolsista(g3);
			
	//TESTE AUTENTICAÇÃO
			System.out.println("==========================================================================================");
			a1.autenticarFuncionario(1234);
			a1.autenticarFuncionario(1324);
			
	//TESTE EXPULSAR ALUNO
			System.out.println("==========================================================================================");
			u1.expulsarAluno(m1);
			u1.procurarAluno(m1);
	
	//TESTE DEMITIR FUNCIONARIO
			System.out.println("==========================================================================================");
			u1.demitirFuncionario(p3);
			u1.procurarFuncionario(p3);
			
	//TESTE DO TRY E CATCH
			System.out.println(1/0);
			System.out.println("Teste se o código continua após um catch.");
	//não continua
		}
		
		catch(java.lang.ArithmeticException e)
		{
			System.out.println("Você realizou uma operação matemática imprópria. Para resolver isso, executamos algumas ações.");
		}
		
		catch(Exception e)
		{
			System.out.println("Você realizou algum comando impróprio. Se a mensagem persistir, entre em contato com o setor responsável.");
		}
		
		System.out.println("Teste se o código continua após um catch.");
	}

}
