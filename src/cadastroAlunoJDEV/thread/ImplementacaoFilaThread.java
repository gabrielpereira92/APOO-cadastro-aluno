package cadastroAlunoJDEV.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

//Exemplo número 3 de Thread

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		
		pilha_fila.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		while(true) {
		
		Iterator iteracao = pilha_fila.iterator();
		
		synchronized (iteracao) {//Bloquear o acesso a lista por outros processos.
			
		
		while(iteracao.hasNext()) {//Enquanto conter dados  na lista  irá processar.
			
			ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();// Pega objeto atual
			//Exemplo Procesar 10mil  notas fiscais.
			
			
			System.out.println(processar.getEmail());
			System.out.println(processar.getNome());
			iteracao.remove();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
	}
	}
}
