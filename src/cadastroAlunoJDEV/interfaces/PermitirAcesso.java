package cadastroAlunoJDEV.interfaces;


// Interface para contrato de Autenticação.
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha); // Apenas declaração do método.

	public boolean autenticar();
}
