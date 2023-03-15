package conversor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversor extends JFrame {

	private JPanel contentPane;

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
					Conversor frame = new Conversor();
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
	public Conversor() {
		setFont(new Font("Calibri", Font.BOLD, 14));
		setTitle("Conversor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 300, 172);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha uma opção");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 138, 18);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Conversor Moedas", "Conversor de Temperaturas"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(10, 40, 263, 31);
		contentPane.add(comboBox);
		
		JButton btnSelecionarConversor = new JButton("Selecionar");
		btnSelecionarConversor.setToolTipText("");
		btnSelecionarConversor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversor telaPrincipal = new Conversor();
				ConversorMoedas telaMoeda = new ConversorMoedas();
				ConversorTemperatura telaTemperatura = new ConversorTemperatura();
				if (comboBox.getSelectedItem().toString() == "Conversor Moedas") {
					telaMoeda.setVisible(true);
					dispose();
				}
				
				if (comboBox.getSelectedItem().toString() == "Conversor de Temperaturas") {
					telaTemperatura.setVisible(true);
					dispose();
				}
			}
		});
		btnSelecionarConversor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSelecionarConversor.setBounds(75, 82, 138, 40);
		contentPane.add(btnSelecionarConversor);
	}
}
