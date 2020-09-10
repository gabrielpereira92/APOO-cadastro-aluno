package cadastroAlunoJDEV.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cadastroAlunoJDEV.classes.Aluno;
import cadastroAlunoJDEV.classes.Disciplina;
import cadastroAlunoJDEV.classes.Secretario;
import cadastroAlunoJDEV.classesauxiliar.FuncaoAutenticacao;
import cadastroAlunoJDEV.constantes.StatusAluno;
import cadastroAlunoJDEV.interfaces.PermitirAcesso;


public class AlunoDAO {

	/* Main método auto executável em Java */
	public static void main(String[] args) {
		
		try {
		String login = JOptionPane.showInputDialog("Login: ");
		String senha =  JOptionPane.showInputDialog("Senha: ");
		
		if (new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) {
			
		// lista para inserir no Objeto Aluno.
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		// hashmap é uma lista que dentro dela temos uma chave que identifica uma sequência de valores.
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();	// Declaração do map
		
//		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
//		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
//		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		

		for (int qtd = 1; qtd <= 2; qtd++) {

			String nomeAluno = JOptionPane.showInputDialog("Nome do Aluno");
//		String idadeAluno = JOptionPane.showInputDialog("Idade do Aluno");
//		String dataNascAluno = JOptionPane.showInputDialog("Data de Nascimento do Aluno");
//		String rgAluno = JOptionPane.showInputDialog("RG do Aluno");
//		String cpfAluno = JOptionPane.showInputDialog("CPF do Aluno");
//		String maeAluno = JOptionPane.showInputDialog("Nome da mãe do Aluno");
//		String paiAluno = JOptionPane.showInputDialog("Nome do pai do Aluno");
//		String dataMatriculaAluno = JOptionPane.showInputDialog("Data de Mátricula do Aluno");
//		String nomeEscolaAluno = JOptionPane.showInputDialog("Nome da Escola");
//		String serieAluno = JOptionPane.showInputDialog("Qual a série que o Aluno foi matriculado");

//		String materia1 = JOptionPane.showInputDialog("Nome da 1ª Disciplina");
//		String av1 = JOptionPane.showInputDialog("Nota 1º semestre");
//		String materia2 = JOptionPane.showInputDialog("Nome da 2ª Disciplina");
//		String av2 = JOptionPane.showInputDialog("Nota 2º semestre");
//		String materia3 = JOptionPane.showInputDialog("Nome da 3ª Disciplina");
//		String av3 = JOptionPane.showInputDialog("Nota terceiro semestre");
//		String materia4 = JOptionPane.showInputDialog("Nome da 4ª Disciplina");
//		String av4 = JOptionPane.showInputDialog("Nota quarto semestre");

			// new Aluno() é uma instancia(Criação de Objetos)
			// aluno1 é uma referencia para objeto aluno
			Aluno aluno1 = new Aluno();
			// Exemplo do conceito Equals e Hashcode que diferencia e compara Objetos.
			// Java diferencia o Objeto com código de memória, devido a isso tem que
			// sobrescrever o código invocando o método Equals e Hashcode.
//		
//		aluno1.setNome("Bento");
//		aluno1.setNumeroCpf("1234");
//		
//		Aluno aluno2 = new Aluno();
//		aluno2.setNome("Bento");
//		aluno2.setNumeroCpf("1234");
//		
//		if (aluno1.equals(aluno2)) {
//			System.out.println("Alunos com dados repetidos.");
//		} else {
//			System.out.println("Alunos diferentes.");
//		}

			// Entidade(objeto) Aluno
		aluno1.setNome(nomeAluno);
//		aluno1.setIdade(Integer.valueOf(idadeAluno)); // conversão string para inteiro
//		aluno1.setDataNascimento(dataNascAluno);
//		aluno1.setRegistroGeral(rgAluno);
//		aluno1.setNumeroCpf(cpfAluno);
//		aluno1.setNomeMae(maeAluno);
//		aluno1.setNomePai(paiAluno);
//		aluno1.setDataMatricula(dataMatriculaAluno);
//		aluno1.setNomeEscola(nomeEscolaAluno);
//		aluno1.setSerieMatriculado(serieAluno);

			// Entidade(objeto) Disciplina
//		aluno1.getDisciplina().setNota1(Double.parseDouble(av1));  conversão string para double
//		aluno1.getDisciplina().setNota2(Double.parseDouble(av2)); // chama objeto disciplina e aponta dentro o atributo que será inserido.
//		aluno1.getDisciplina().setNota3(Double.parseDouble(av3));
//		aluno1.getDisciplina().setNota4(Double.parseDouble(av4));
//		aluno1.getDisciplina().setDisciplina1(materia1);
//		aluno1.getDisciplina().setDisciplina2(materia2);
//		aluno1.getDisciplina().setDisciplina3(materia3);
//		aluno1.getDisciplina().setDisciplina4(materia4);
			
			// Inserção em lista para entidade disciplina
			for (int position = 1; position <= 1; position++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + position);
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + position);

				Disciplina disciplina = new Disciplina(); // instancia o objeto
				disciplina.setDisciplina(nomeDisciplina);
				//disciplina.setNota(Double.valueOf(notaDisciplina)); // conversão string para double

				aluno1.getDisciplinas().add(disciplina); // inserir dentro da lista

			}

			int choose = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (choose == 0) {

				int removeDiscipline = 0;
				int position = 1;
				while (removeDiscipline == 0) {
					String removerDisciplina = JOptionPane.showInputDialog("Qual a disciplina que deseja remover 1, 2 ,3 ,4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() - position);// removendo dentro da lista recebendo uma string e convertendo para inteiro.
					position++;
					removeDiscipline = JOptionPane.showConfirmDialog(null, "Deseja remover outra disciplina?");

				}
			}
			alunos.add(aluno1); // comando para adicionar na lista.
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>()); // inicializa o MAP
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {
			if (aluno.getAprovacaoAluno().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno); // Insere dentro do MAP
			} else if (aluno.getAprovacaoAluno().equalsIgnoreCase(StatusAluno.REPROVADO)){
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}else {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}
		}
		
		System.out.println("* Lista dos Alunos Aprovados *");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {//recupera dentro do map
			System.out.println("Nome: " + aluno.getNome()+" Resultado = "+ aluno.getAprovacaoAluno() + " Média= "+ aluno.getMediaAluno());
		}
		System.out.println(" ");
		System.out.println("* Lista dos Alunos Reprovados *");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Nome: " +aluno.getNome()+ " Resultado = "+ aluno.getAprovacaoAluno() + " Média= "+ aluno.getMediaAluno());
		}
		System.out.println(" ");
		System.out.println("* Lista dos Alunos Recuperação *");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Nome: " +aluno.getNome() + " Resultado = "+ aluno.getAprovacaoAluno() + " Média= "+ aluno.getMediaAluno());
		}
		//Exemplo Utilizando foreach para recuperar informações do aluno na lista.
//		for (Aluno aluno : alunos) {
//			//linha de comando para remoção de aluno com nome específico e tbm instrução para retornar da lista um nome específico.
//			if (aluno.getNome().equalsIgnoreCase("bento")) {
//				alunos.remove(aluno);
//				break;
//			}else {
//				
//			System.out.println(aluno.toString()); // Descrição do objeto na memória
//			System.out.println("A média do Aluno foi: " + aluno.getMediaAluno());
//			System.out.println("O aluno foi: " + (aluno.getAprovacaoAluno())); // exemplo utilizando operador ternário// (? "Aprovado" : "Reprovado")
//			System.out.println("====================================================");
//		}
//		
//			
//		}
//		for (Aluno aluno : alunos) {
//			System.out.println("Alunos que sobraram na lista");
//			System.out.println(aluno.getNome());
//			System.out.println("Suas Materias são:");
//			//foreach para percorrer a lista de disciplinas e recuperar nome das disciplinas e notas
//			for (Disciplina disciplina : aluno.getDisciplinas()) {
//				System.out.println(disciplina.getDisciplina() + " " + disciplina.getNota());
//				
//			}
//			System.out.println("---------------------------------------------------------");
//		}
		
		
		//Exemplo recuperando informações do aluno por posição na memória da lista.
		
//		for (int posi = 0; posi < alunos.size(); posi++) {
//			
//			Aluno aluno = alunos.get(posi);
//			// Exemplo fazer substituição dentro da lista
//			if (aluno.getNome().equalsIgnoreCase("adam")) {
//				// entidade aluno
//				Aluno trocar = new Aluno();
//				trocar.setNome("Gabriel Ramon");
//				// entidade disciplina
//				Disciplina disciplina = new Disciplina();
//				disciplina.setDisciplina("Física");
//				disciplina.setNota(98);
//				
//				trocar.getDisciplinas().add(disciplina);
//				
//				alunos.set(posi, trocar);
//				aluno = alunos.get(posi);
//				
//			}
//			System.out.println("Nome do aluno: "+ aluno.getNome());
//			System.out.println("Média do aluno: "+ aluno.getMediaAluno());
//			System.out.println("Resultado:  "+ aluno.getAprovacaoAluno());
//			
//			for(int posid = 0; posid < aluno.getDisciplinas().size(); posid ++) {
//				Disciplina disc = aluno.getDisciplinas().get(posid);
//				System.out.println("Disciplina: "+ disc.getDisciplina() + " Nota: "+ disc.getNota() );
//			}
//			
//		}
				
		}
		else {
			JOptionPane.showMessageDialog(null, "Acesso negado.");
		}
		
		}catch (Exception e) {
			e.printStackTrace(); // imprime erro dentro do console
			JOptionPane.showMessageDialog(null, "Erro ao processar Notas");
		}	finally {
			JOptionPane.showMessageDialog(null, "Obrigado por aprender Java");
		}
		
	}

}
