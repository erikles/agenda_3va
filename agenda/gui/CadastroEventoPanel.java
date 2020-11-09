package agenda.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import agenda.io.AgendaIO;
import agenda.utils.AgendaUtils;
import agenda.utils.PeriodicidadeEnum;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class CadastroEventoPanel extends JPanel {
	private JTextField tdDescEvento;
	private JTextField tfEncaminharEmail;
	private JTextField tdDataEvento;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Object listaEventos;

	/**
	 * Create the panel.
	 * @param listaEventosPanel 
	 */
	private boolean selecaoum;
	
	public CadastroEventoPanel(ListaEventosPanel listaEventosPanel) {
		setLayout(null);
		this.listaEventos = listaEventos;
		
		JLabel lblDescEvento = new JLabel("DESCRI\u00C7\u00C3O DO SERVI\u00C7O");
		lblDescEvento.setFont(new Font("Product Sans", Font.BOLD, 11));
		lblDescEvento.setBounds(10, 11, 130, 14);
		add(lblDescEvento);
		
		tdDescEvento = new JTextField();
		tdDescEvento.setFont(new Font("Product Sans", Font.PLAIN, 11));
		tdDescEvento.setBounds(10, 36, 414, 20);
		add(tdDescEvento);
		tdDescEvento.setColumns(10);
		
		JLabel lblEncaminharEmail = new JLabel("ENCAMINHAR EMAIL");
		lblEncaminharEmail.setFont(new Font("Product Sans", Font.BOLD, 11));
		lblEncaminharEmail.setBounds(10, 104, 130, 14);
		add(lblEncaminharEmail);
		
		tfEncaminharEmail = new JTextField();
		tfEncaminharEmail.setBounds(143, 101, 281, 20);
		add(tfEncaminharEmail);
		tfEncaminharEmail.setColumns(10);
		
		JLabel lblDataEvento = new JLabel("DATA DO SERVI\u00C7O");
		lblDataEvento.setFont(new Font("Product Sans", Font.BOLD, 11));
		lblDataEvento.setBounds(10, 67, 110, 14);
		add(lblDataEvento);
		
		tdDataEvento = new JTextField();
		tdDataEvento.setBounds(143, 64, 104, 20);
		add(tdDataEvento);
		tdDataEvento.setColumns(10);
		
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
		
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
				@Override
				 public void actionPerformed(ActionEvent arg0) {
				  chamaCadastroEvento();
				}
		});
		
		
		btnSalvar.setFont(new Font("Product Sans", Font.BOLD, 11));
		btnSalvar.setBounds(121, 182, 89, 23);
		add(btnSalvar);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			 @Override
			 public void actionPerformed(ActionEvent arg0) {
			  limparCampos();
			 }
		});
		btnLimpar.setFont(new Font("Product Sans", Font.BOLD, 11));
		btnLimpar.setBounds(262, 182, 89, 23);
		add(btnLimpar);
		
		

	}
	public void chamaCadastroEvento(){
		AgendaIO io = new AgendaIO();
		Evento evento = new Evento();
		Object[] novaLinha = new Object[4];
		evento.setDataEvento(AgendaUtils.getDateFromString(tdDataEvento.getText()));
		evento.setDescEvento(tdDescEvento.getText());
		evento.setEmailEncaminhar(tfEncaminharEmail.getText());
		
		
		novaLinha[0] = tdDataEvento.getText();
		novaLinha[1] = tdDescEvento.getText();
		novaLinha[3] = tfEncaminharEmail.getText();
	}
	private void limparCampos(){
		  tdDataEvento.setText("");
		  tdDescEvento.setText("");
		  tfEncaminharEmail.setText("");
		}
		  
}
