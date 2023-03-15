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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConversorTemperatura extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private static double valordigitado;

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
					ConversorTemperatura frame = new ConversorTemperatura();
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
	public ConversorTemperatura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 307, 172);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite o valor em Celsius (°C) para conversão");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 274, 20);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setToolTipText("Digite o valor desejado!");
		textField.setFont(new Font("Calibri", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(10, 42, 274, 36);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Selecionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					valordigitado = Double.parseDouble(textField.getText());
					EscolhaTemperatura telaEscolhaTemperatura = new EscolhaTemperatura();
					telaEscolhaTemperatura.setVisible(true);
					dispose();
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(btnNewButton, 
							"Só é possível utilizar números\n"
							+ "Utilize ponto(.) para números com casas decimais");
				}
			}
		});
		btnNewButton.setToolTipText("");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 87, 120, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversor telaPrincipal = new Conversor();
				telaPrincipal.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(164, 89, 120, 35);
		contentPane.add(btnNewButton_1);
	}
	
	public double getValorDigitado() {
		return ConversorTemperatura.valordigitado;
	}
}
