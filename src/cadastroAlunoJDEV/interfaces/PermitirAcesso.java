package cadastroAlunoJDEV.interfaces;


// Interface para contrato de Autentica��o.
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha); // Apenas declara��o do m�todo.

	public boolean autenticar();
}
