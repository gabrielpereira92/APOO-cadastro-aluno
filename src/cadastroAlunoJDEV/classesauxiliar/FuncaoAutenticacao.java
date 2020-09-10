package cadastroAlunoJDEV.classesauxiliar;

import cadastroAlunoJDEV.interfaces.PermitirAcesso;

// recebe algu�m que tenha o contrato da interface PermitirAcesso e chamar o m�todo autenticar.
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;

	public boolean autenticar() {
		
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
