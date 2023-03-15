package conversor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EscolhaTemperatura extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private ConversorTemperatura telaConversorTemperatura = new ConversorTemperatura();
	
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
					EscolhaTemperatura frame = new EscolhaTemperatura();
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
	public EscolhaTemperatura() {
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
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Fahrenheit", "Kelvin"}));
		comboBox.setBounds(10, 40, 212, 29);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (comboBox.getSelectedItem().toString().equals("Fahrenheit")) {
					// (0 °C × 9/5) + 32 = 32 °F
					double conversaoFahrenheit= (telaConversorTemperatura.getValorDigitado() * 9/5) + 32;
					String valorConversaoDolar = String.format("%.1f °F", conversaoFahrenheit);
					textField.setText(valorConversaoDolar);
					return;
				}
				
				if (comboBox.getSelectedItem().toString().equals("Kelvin")) {
					// 0 °C + 273,15 = 273,15 K
					double conversaoKelvin = telaConversorTemperatura.getValorDigitado() + 273.15 ;
					String valorConversaoDolar = String.format("%.1f K", conversaoKelvin);
					textField.setText(valorConversaoDolar);
					return;
				}
			}
		});
		btnNewButton.setBounds(227, 40, 47, 29);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 80, 193, 29);
		contentPane.add(textField);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConversorTemperatura telaConversorTemperatura = new ConversorTemperatura();
				telaConversorTemperatura.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(213, 80, 61, 29);
		contentPane.add(btnNewButton_1);
	}
}
