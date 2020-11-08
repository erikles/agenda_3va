package AgendaServico.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class CadastroServicoPanel extends JPanel {
	private JTextField tdDescServico;
	private JTextField lblEndereco;
	private JTextField tdDataServico;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public CadastroServicoPanel() {
		setLayout(null);
		
		JLabel lblDescServico = new JLabel("DESCRI\u00C7\u00C3O DO SERVI\u00C7O");
		lblDescServico.setFont(new Font("Product Sans", Font.BOLD, 11));
		lblDescServico.setBounds(10, 11, 130, 14);
		add(lblDescServico);
		
		tdDescServico = new JTextField();
		tdDescServico.setFont(new Font("Product Sans", Font.PLAIN, 11));
		tdDescServico.setBounds(10, 36, 414, 20);
		add(tdDescServico);
		tdDescServico.setColumns(10);
		
		JLabel lblEnderecoServico = new JLabel("ENDERE\u00C7O DO SERVI\u00C7O");
		lblEnderecoServico.setFont(new Font("Product Sans", Font.BOLD, 11));
		lblEnderecoServico.setBounds(10, 104, 130, 14);
		add(lblEnderecoServico);
		
		lblEndereco = new JTextField();
		lblEndereco.setBounds(143, 101, 281, 20);
		add(lblEndereco);
		lblEndereco.setColumns(10);
		
		JLabel lblDataServico = new JLabel("DATA DO SERVI\u00C7O");
		lblDataServico.setFont(new Font("Product Sans", Font.BOLD, 11));
		lblDataServico.setBounds(10, 67, 110, 14);
		add(lblDataServico);
		
		tdDataServico = new JTextField();
		tdDataServico.setBounds(143, 64, 104, 20);
		add(tdDataServico);
		tdDataServico.setColumns(10);
		
		JLabel lblPeriodicidadeServico = new JLabel("PERIOCIDADE DO SERVI\u00C7O");
		lblPeriodicidadeServico.setFont(new Font("Product Sans", Font.BOLD, 11));
		lblPeriodicidadeServico.setBounds(10, 143, 156, 14);
		add(lblPeriodicidadeServico);
		
		JRadioButton rdbUmavez = new JRadioButton("UMA VEZ");
		buttonGroup.add(rdbUmavez);
		rdbUmavez.setBounds(153, 139, 69, 23);
		add(rdbUmavez);
		
		JRadioButton rdbSemanal = new JRadioButton("SEMANAL");
		buttonGroup.add(rdbSemanal);
		rdbSemanal.setBounds(225, 139, 75, 23);
		add(rdbSemanal);
		
		JRadioButton rdbMensal = new JRadioButton("MENSAL");
		buttonGroup.add(rdbMensal);
		rdbMensal.setBounds(302, 139, 109, 23);
		add(rdbMensal);
		
		JCheckBox ckbAlarme = new JCheckBox("ALARME");
		ckbAlarme.setFont(new Font("Product Sans", Font.BOLD, 11));
		ckbAlarme.setBounds(10, 182, 97, 23);
		add(ckbAlarme);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setFont(new Font("Product Sans", Font.BOLD, 11));
		btnSalvar.setBounds(121, 182, 89, 23);
		add(btnSalvar);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.setFont(new Font("Product Sans", Font.BOLD, 11));
		btnLimpar.setBounds(262, 182, 89, 23);
		add(btnLimpar);

	}
}
