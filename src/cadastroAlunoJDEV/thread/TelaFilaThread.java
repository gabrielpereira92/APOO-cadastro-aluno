package cadastroAlunoJDEV.thread;

//Exemplo número 3 de Thread
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaFilaThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	private JLabel descricaoNome = new JLabel("Nome:");
	private JTextField campoNome = new JTextField();
	
	private JLabel descricaoEmail = new JLabel("E-mail: ");
	private JTextField campoEmail = new JTextField();
	
	private JButton bInserir = new JButton("Inserir");
	private JButton bParar = new JButton("Parar");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	
	
	public TelaFilaThread() {
		
		setTitle("Tela Fila Thread");
		setSize(new Dimension(250,250));
		setLocationRelativeTo(null);
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = gridBagConstraints.WEST;
		
		descricaoNome.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricaoNome, gridBagConstraints);
		gridBagConstraints.gridy ++;
		
		campoNome.setPreferredSize(new Dimension(200,25));
		jPanel.add(campoNome, gridBagConstraints);
		gridBagConstraints.gridy ++;
		
		descricaoEmail.setPreferredSize(new Dimension(200,25));
		jPanel.add(descricaoEmail, gridBagConstraints);
		gridBagConstraints.gridy ++;
		
		campoEmail.setPreferredSize(new Dimension(200, 25));
		jPanel.add(campoEmail, gridBagConstraints);
		gridBagConstraints.gridy ++;
		//Botões
		gridBagConstraints.gridwidth = 1;
		
		bInserir.setPreferredSize(new Dimension(92, 25));
		jPanel.add(bInserir, gridBagConstraints);
		gridBagConstraints.gridx ++;
		
		bParar.setPreferredSize(new Dimension(92, 25));
		jPanel.add(bParar, gridBagConstraints);
		gridBagConstraints.gridy ++;
		
		bInserir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) { //Função para executar o clique do botão
				
				for(int i =0; i <10; i++) {
				ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(campoNome.getText());
				filaThread.setEmail(campoEmail.getText());
				
				fila.add(filaThread);
				}
			}
		});
		
		bParar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				fila.stop();
			}
		});
		
		fila.start();
		add(jPanel, BorderLayout.WEST);
		setVisible(true);
			
	}

}
