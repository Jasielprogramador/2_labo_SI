package lana;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Hasiera extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panelGridLayout;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	
	private static Hasiera frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Hasiera();
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
	public Hasiera() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		contentPane.add(getPanelGridLayout(), BorderLayout.CENTER);
	}

	private JPanel getPanelGridLayout() {
		if(panelGridLayout==null) {
			panelGridLayout=new JPanel();
			panelGridLayout.setLayout(new GridLayout(3,3,0,0));
			
			JLabel lblNewLabel = new JLabel("Izena");
			panelGridLayout.add(lblNewLabel);
			
			textField_1 = new JTextField();
			panelGridLayout.add(textField_1);
			textField_1.setColumns(10);
			
			lblNewLabel_1 = new JLabel("Pasahitza");
			panelGridLayout.add(lblNewLabel_1);
			
			passwordField = new JPasswordField();
			panelGridLayout.add(passwordField);
			
			btnNewButton = new JButton("OK");
			btnNewButton.addActionListener(this);
			panelGridLayout.add(btnNewButton);
			
			btnNewButton_1 = new JButton("Cancel");
			btnNewButton_1.addActionListener(this);
			panelGridLayout.add(btnNewButton_1);

		}
		return panelGridLayout;
	}
	
	public void actionPerformed(ActionEvent e) { 
        JButton btn = (JButton) e.getSource();
      

		if(btn.equals(btnNewButton)) {
			if(textField_1.getText().equals("asier") && passwordField.getText().equals("1234")) {
				frame.setVisible(false);
				Tabla f = new Tabla();
				f.setVisible(true);
			}
			else {
				JOptionPane.showMessageDialog(null, "pasahitza txarto dago");
				passwordField.setText("");
				passwordField.requestFocus();
			}
		}
		else {
			textField_1.setText("");
			passwordField.setText("");
		}
	}
	

	
	
}