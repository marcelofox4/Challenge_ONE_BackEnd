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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ConversorMoedas extends JFrame {

	private JPanel contentPane;
	private JTextField txtValorDigitado;
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
					ConversorMoedas frame = new ConversorMoedas();
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
	public ConversorMoedas() {
		setTitle("Conversor de Moedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 300, 172);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite o valor em Real (BRL) para conversão");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 274, 18);
		contentPane.add(lblNewLabel);
		
		txtValorDigitado = new JTextField();
		txtValorDigitado.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtValorDigitado.setToolTipText("Digite o valor desejado!");
		txtValorDigitado.setBounds(10, 40, 264, 36);
		contentPane.add(txtValorDigitado);
		txtValorDigitado.setColumns(10);
		
		JButton btnNewButton = new JButton("Selecionar");
		btnNewButton.setToolTipText("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					valordigitado = Double.parseDouble(txtValorDigitado.getText());
					EscolhaMoeda telaEscolhaMoeda = new EscolhaMoeda();
					telaEscolhaMoeda.setVisible(true);
					dispose();
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(btnNewButton, 
							"Só é possível utilizar números\n"
							+ "Utilize ponto(.) para números com casas decimais");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 87, 120, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversor telaPrincipal = new Conversor();
				telaPrincipal.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(154, 87, 120, 35);
		contentPane.add(btnNewButton_1);
	}

	public double getValorDigitado() {
		return ConversorMoedas.valordigitado;
	}
}
