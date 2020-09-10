package cadastroAlunoJDEV.thread;

import javax.swing.JOptionPane;

// Exemplo número 1 de Thread
//# Conceito de Thread
//Processamento de dados em paralelo e continuidade de tarefas do sistema.

public class ExemploThread {

	public static void main(String[] args) throws InterruptedException {

		// Thread para execução de envio de email
		Thread threadEmail =  new Thread(thread1); 
		threadEmail.start();// Start liga a Thread que fica processando em paralelo por trás.

		
		// Thread para envio de Nota Fiscal, em forma de Objeto
		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start(); // Start liga a Thread que fica processando em paralelo por trás.

		// Exemplo de um sistema funcionando enquanto a tarefa é executada em 2º plano.
		System.out.println("Fim da Thread");
		JOptionPane.showMessageDialog(null, "Continuidade do Sistema");
	}

	//Método para thread email, Runnable é uma interface proprietária das Thread.
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			// Execução da tarefa, e dentro dele ficará o código de rotina.

			for (int i = 0; i < 10; i++) {

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// Exemplo de uma tarefa que ficará executando quando o sistema roda em paralelo.
				System.out.println("Executar rotina de envio de e-mail.");

			}
		}
	};
	//Método para thread NotaFiscal, Runnable é uma interface proprietária das Thread.
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {// Execução da tarefa, e dentro dele ficará o código de rotina.
			for (int i = 0; i < 10; i++) {

				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// Exemplo de uma tarefa que ficará executando quando o sistema roda em
				// paralelo.
				System.out.println("Executar rotina de envio de Nota Fiscal.");

			}
		}
	};
}
