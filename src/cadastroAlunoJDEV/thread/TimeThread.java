package cadastroAlunoJDEV.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//Exemplo número 2 de Thread
public class TimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout());//Painel de componentes.
	
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				mostraTempo2.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private Thread thread1Time;
	private Thread thread2Time;
	
	public TimeThread() {//Conceito de "Construtor" executa o que estiver dentro do Objeto.
		setTitle("Tela de TimeThread");
		setSize(new Dimension(250, 250));
		setLocationRelativeTo(null);
		
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); //Controlador de posicionamento de componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = gridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension( 200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);
		gridBagConstraints.gridy ++;
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagConstraints);
		gridBagConstraints.gridy ++;
		
		descricaoHora2.setPreferredSize(new Dimension( 200, 25));
		jPanel.add(descricaoHora2, gridBagConstraints);
		gridBagConstraints.gridy ++;
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, gridBagConstraints);
		gridBagConstraints.gridy ++;
		
		
		gridBagConstraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension(92, 25));
		jPanel.add(jButton,gridBagConstraints);
		gridBagConstraints.gridx ++;
		
		jButton2.setPreferredSize(new Dimension(92,25));
		jPanel.add(jButton2, gridBagConstraints);
		gridBagConstraints.gridy ++;
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { // Executa o clique do botão

				thread1Time = new Thread(thread1);
				thread1Time.start();
				
				thread2Time = new Thread(thread2);
				thread2Time.start();
				
				jButton.setEnabled(false);
				jButton2.setEnabled(true);
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				thread2Time.stop();
				
				jButton.setEnabled(true);
				jButton2.setEnabled(false);
			}
		});
		
		jButton2.setEnabled(false);
		add(jPanel, BorderLayout.WEST);
		setVisible(true);//Último comando para executar, para tornar visível a tela.
	}

}
