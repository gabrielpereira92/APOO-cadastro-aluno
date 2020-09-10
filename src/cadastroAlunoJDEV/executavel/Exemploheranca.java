package cadastroAlunoJDEV.executavel;

import cadastroAlunoJDEV.classes.Aluno;
import cadastroAlunoJDEV.classes.Diretor;
import cadastroAlunoJDEV.classes.Secretario;

public class Exemploheranca {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Adam");
		aluno.setIdade(16);

		Diretor diretor = new Diretor();
		diretor.setTitulacao("Sênior");
		diretor.setIdade(45);
		
		Secretario secretario = new Secretario();
		secretario.setNivelCargo("Alto");
		secretario.setIdade(2);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - "+ aluno.msgMaiorIdade() );
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salário Aluno: " + aluno.salario());
		System.out.println("Salário Diretor: " + diretor.salario());
		System.out.println("Salário Secretário: " + secretario.salario());
	}

}
