package AgendaServico.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class CadastroServicoPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public CadastroServicoPanel() {
		setLayout(null);
		
		JLabel lblDescServico = new JLabel("Descri\u00E7\u00E3o do Servi\u00E7o");
		lblDescServico.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDescServico.setBounds(10, 11, 117, 14);
		add(lblDescServico);

	}
}
