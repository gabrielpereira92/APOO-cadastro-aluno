package cadastroAlunoJDEV.classesauxiliar;

import cadastroAlunoJDEV.interfaces.PermitirAcesso;

// recebe alguém que tenha o contrato da interface PermitirAcesso e chamar o método autenticar.
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;

	public boolean autenticar() {
		
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
