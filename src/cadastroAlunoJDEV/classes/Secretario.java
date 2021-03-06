package cadastroAlunoJDEV.classes;

import cadastroAlunoJDEV.interfaces.PermitirAcesso;

//Classe filha que herda da classe pai Pessoa
public class Secretario extends Pessoa implements PermitirAcesso {
	
	String registro;
	String nivelCargo;
	String experiencia;

	private String login;
	private String senha;
	
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Secretario() {
	
	}
	
	// M�todo do contrato de autentica��o.
	
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		
		return login.equalsIgnoreCase("Admin") && senha.equalsIgnoreCase("Admin");
	}
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	@Override
	public double salario() {
		
		return 3500.78;
	}


	

	
	

}
