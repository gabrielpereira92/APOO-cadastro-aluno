package cadastroAlunoJDEV.executavel;

import javax.swing.JOptionPane;

import cadastroAlunoJDEV.classes.Aluno;
import cadastroAlunoJDEV.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas1 = { 6.7, 8.9, 5.5, 10.0 };
		double[] notas2 = { 7.8, 8.5, 3.4, 6.5 };

		Aluno aluno = new Aluno();
		aluno.setNome("Gabriel R. F. Pereira");
		aluno.setNomeEscola("Universidade Infantil");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Lógica de programação");
		disciplina.setNota(notas1);

		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Banco de dados");
		disciplina2.setNota(notas2);

		aluno.getDisciplinas().add(disciplina2);
		
		
		double[] notas12 = { 8.7, 7.9, 6.5, 9.5 };
		double[] notas22 = { 6.8, 9.5, 8.4, 5.5 };

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Bento L. S. Pereira");
		aluno2.setNomeEscola("Universidade Infantil");

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Lógica de programação");
		disciplina3.setNota(notas12);

		aluno2.getDisciplinas().add(disciplina3);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Banco de dados");
		disciplina4.setNota(notas22);

		aluno2.getDisciplinas().add(disciplina4);
		
		//Exemplo utilizando array de Objetos.
		Aluno[] arrayAlunos = new Aluno[2];
		
		arrayAlunos[0]= aluno;
		arrayAlunos[1]= aluno2;
		
		for (int pos = 0 ; pos < arrayAlunos.length; pos++ ) {
			
		System.out.println("Nome do aluno: " + arrayAlunos[pos].getNome() + "/ Nome da Escola: " + arrayAlunos[pos].getNomeEscola());
		System.out.println("Disciplinas: ");

		
		for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
			System.out.println(d.getDisciplina());
			System.out.println("Nota da Disciplina");

			double notaMax = 0.0;
			double notaMin = 0.0;

			for (int i = 0; i < d.getNota().length; i++) {
				System.out.println("Nota " + (1 + i) + "º semestre: " + d.getNota()[i]);

				if (i == 0) {
					notaMax = d.getNota()[i];
				} else {
					if (d.getNota()[i] > notaMax) {
						notaMax = d.getNota()[i];
					}
				}	
				if (i == 0) {
					notaMin = d.getNota()[i];
				} else {
					if (d.getNota()[i] < notaMin) {
						notaMin = d.getNota()[i];
					}
				}	
			}
			System.out.println("A maior nota da Disciplina "+d.getDisciplina() +" é :" +notaMax);
			System.out.println("A menor nota da Disciplina "+d.getDisciplina() +" é :" +notaMin);
			System.out.println("--------------------------------------------------");
		}
		}
		// Exemplo de utilização do Array
//		String  z = JOptionPane.showInputDialog("Qual o tamanho do Array");
//					
//		double[] valor = new double[Integer.parseInt(posicoes)];
//		
//		for (int pos = 0; pos < valor.length; pos++) {
//			String notas = JOptionPane.showInputDialog("Digite a nota: "+ (pos + 1));
//			valor[pos] = Double.valueOf(notas);
//			}
//		for (int pos = 0; pos< valor.length; pos++) {
//			System.out.println("Nota "+ (pos+1)+ " é: " +valor[pos]);
//		}

	}

}
