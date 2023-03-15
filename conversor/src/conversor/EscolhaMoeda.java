package conversor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EscolhaMoeda extends JFrame {

	private JPanel contentPane;
	private JTextField txtMostraResultado;
	private ConversorMoedas telaConvesorMoeda = new ConversorMoedas();

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (UnsupportedLookAndFeelException e) {
			// handle exception
		} catch (ClassNotFoundException e) {
			// handle exception
		} catch (InstantiationException e) {
			// handle exception
		} catch (IllegalAccessException e) {
			// handle exception
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EscolhaMoeda frame = new EscolhaMoeda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EscolhaMoeda() {
		setTitle("Escolha a Moeda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 300, 172);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha uma opção para conversão");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 212, 18);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dólar americano (USD)", "Euro (EUR)", "Iene (JPY)", "Libra Esterlina (GBP)", "Franco Suíço (CHF)", "Dólar Canadense (CAD)", "Dólar Australiano (AUD/NZD)", "Rand (ZAR)", "Yuan (CNY)", "Peso Argentino (ARS)"}));
		comboBox.setBounds(10, 40, 212, 29);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (comboBox.getSelectedItem().toString().equals("Dólar americano (USD)")) {
					// Valor do Dólar Americano (USD) no dia 14/03/2023 = 5.22755
					double conversaoDolar = telaConvesorMoeda.getValorDigitado() / 5.22755;
					String valorConversaoDolar = String.format("US$ %.2f", conversaoDolar);
					txtMostraResultado.setText(valorConversaoDolar);
					return;
				}
				
				if (comboBox.getSelectedItem().toString().equals("Euro (EUR)")) {
					// Valor do Euro (EUR) no dia 14/03/2023 = 5.852
					double conversaoDolar = telaConvesorMoeda.getValorDigitado() / 5.852;
					String valorConversaoDolar = String.format("€ %.2f", conversaoDolar);
					txtMostraResultado.setText(valorConversaoDolar);
					return;
				}
				
				if (comboBox.getSelectedItem().toString().equals("Iene (JPY)")) {
					// Valor do Iene (JPY) no dia 14/03/2023 = 0.03907
					double conversaoDolar = telaConvesorMoeda.getValorDigitado() / 5.852;
					String valorConversaoDolar = String.format("¥ %.2f", conversaoDolar);
					txtMostraResultado.setText(valorConversaoDolar);
					return;
				}
				
				if (comboBox.getSelectedItem().toString().equals("Libra Esterlina (GBP)")) {
					// Valor do Libra Esterlina (GBP) no dia 14/03/2023 = 0.159966
					double conversaoDolar = telaConvesorMoeda.getValorDigitado() / 0.159966;
					String valorConversaoDolar = String.format("£ %.2f", conversaoDolar);
					txtMostraResultado.setText(valorConversaoDolar);
					return;
				}
				
				if (comboBox.getSelectedItem().toString().equals("Franco Suíço (CHF)")) {
					// Valor do Franco Suíço (CHF) no dia 14/03/2023 = 0.17407
					double conversaoDolar = telaConvesorMoeda.getValorDigitado() / 0.17407;
					String valorConversaoDolar = String.format("FR %.2f", conversaoDolar);
					txtMostraResultado.setText(valorConversaoDolar);
					return;
				}
				
				if (comboBox.getSelectedItem().toString().equals("Dólar Canadense (CAD)")) {
					// Valor do Dólar Canadense (CAD) no dia 14/03/2023 = 3.827246
					double conversaoDolar = telaConvesorMoeda.getValorDigitado() / 3.827246;
					String valorConversaoDolar = String.format("C$ %.2f", conversaoDolar);
					txtMostraResultado.setText(valorConversaoDolar);
					return;
				}
				
				if (comboBox.getSelectedItem().toString().equals("Dólar Australiano (AUD/NZD)")) {
					// Valor do Dólar Australiano (AUD/NZD) no dia 14/03/2023 = 3.512
					double conversaoDolar = telaConvesorMoeda.getValorDigitado() / 3.512;
					String valorConversaoDolar = String.format("A$ %.2f", conversaoDolar);
					txtMostraResultado.setText(valorConversaoDolar);
					return;
				}
				
				if (comboBox.getSelectedItem().toString().equals("Rand (ZAR)")) {
					// Valor do Rand (ZAR) no dia 14/03/2023 = 3.52103
					double conversaoDolar = telaConvesorMoeda.getValorDigitado() / 3.52103;
					String valorConversaoDolar = String.format("R %.2f", conversaoDolar);
					txtMostraResultado.setText(valorConversaoDolar);
					return;
				}
				
				if (comboBox.getSelectedItem().toString().equals("Yuan (CNY)")) {
					// Valor do Yuan (CNY) no dia 14/03/2023 = 0.758597
					double conversaoDolar = telaConvesorMoeda.getValorDigitado() / 0.758597;
					String valorConversaoDolar = String.format("¥ %.2f", conversaoDolar);
					txtMostraResultado.setText(valorConversaoDolar);
					return;
				}
				
				if (comboBox.getSelectedItem().toString().equals("Peso Argentino (ARS)")) {
					// Valor do Peso Argentino (ARS) no dia 14/03/2023 = 0.026
					double conversaoDolar = telaConvesorMoeda.getValorDigitado() / 0.026;
					String valorConversaoDolar = String.format("$ %.2f", conversaoDolar);
					txtMostraResultado.setText(valorConversaoDolar);
					return;
				}
			}
		});
		btnNewButton.setBounds(227, 40, 47, 29);
		contentPane.add(btnNewButton);
		
		txtMostraResultado = new JTextField();
		txtMostraResultado.setBounds(10, 80, 193, 29);
		contentPane.add(txtMostraResultado);
		txtMostraResultado.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConversorMoedas telaConversorMoedas = new ConversorMoedas();
				telaConversorMoedas.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(213, 80, 61, 29);
		contentPane.add(btnNewButton_1);
	}


}
