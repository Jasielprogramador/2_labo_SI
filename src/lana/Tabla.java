package lana;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.graalvm.compiler.phases.common.NodeCounterPhase.Stage;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class Tabla extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPanel panelGridLayout;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel lblNewLabel;
	private JTextField textField_1;
	private JPanel panel_5;
	private JLabel lblNewLabel_1;
	private JTextField textField_2;
	private JPanel panel_6;
	private JButton btnNewButton;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabla frame = new Tabla();
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
	public Tabla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanelGridLayout(), BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new GridLayout(3, 0, 0, 0));
		panel.add(getPanel_1());
		panel.add(getPanel_2());
		panel.add(getPanel_7());
	}

	private JPanel getPanelGridLayout() {
		if(panelGridLayout==null) {
			panelGridLayout=new JPanel();
			panelGridLayout.setLayout(new GridLayout(3,3,0,0));
			matrizeaSortu();
		}
		return panelGridLayout;
	}
	
	private void matrizeaSortu() {
		GridBagConstraints gbc = new GridBagConstraints();  
		for(int l=0;l<3;l++) {
			for(int z=0;z<3;z++) {
				panelGridLayout.add(getPanelGB(l,z));
		
			}
		}
	}
	
	private JPanel getPanelGB(int lerroa, int zutabea) {
		JPanel panelGB = new JPanel();
		GridBagLayout gbl_panelGB = new GridBagLayout();
		gbl_panelGB.columnWidths = new int[] {0};
		gbl_panelGB.rowHeights = new int[] {0, 30, 30};
		gbl_panelGB.columnWeights = new double[]{1.0};
		gbl_panelGB.rowWeights = new double[]{0.0, 0.0, 0.0};
		panelGB.setLayout(gbl_panelGB);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridheight = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 1;
		panelGB.add(getTextField(), gbc_textField);
		GridBagConstraints gbc_labelGB = new GridBagConstraints();
		gbc_labelGB.gridx = 0;
		gbc_labelGB.gridy = 0;
		panelGB.add(getLabelGB(lerroa,zutabea), gbc_labelGB);
		panelGB.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
			}});
		
		return panelGB;
	}
	
	private JLabel getLabelGB(int lerroa, int zutabea) {
			
		JLabel labelGB = new JLabel("L"+lerroa+"Z"+zutabea);
					
		return labelGB;
		
		
	}
	private JTextField getTextField() {
		//if (textField == null) {
			JTextField textField = new JTextField();
			textField.setColumns(10);
		//}
		return textField;
	}
	
	
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(new GridLayout(1, 0, 0, 0));
			panel_2.add(getPanel_3());
		}
		return panel_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setLayout(new GridLayout(3, 1, 0, 0));
			panel_3.add(getPanel_4_1());
			panel_3.add(getPanel_5());
			panel_3.add(getPanel_6());
		}
		return panel_3;
	}
	private JPanel getPanel_4_1() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.add(getLblNewLabel());
			panel_4.add(getTextField_1());
		}
		return panel_4;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Label");
		}
		return lblNewLabel;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JPanel getPanel_5() {
		if (panel_5 == null) {
			panel_5 = new JPanel();
			panel_5.add(getLblNewLabel_1());
			panel_5.add(getTextField_2());
		}
		return panel_5;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("TField");
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JPanel getPanel_6() {
		if (panel_6 == null) {
			panel_6 = new JPanel();
			panel_6.add(getBtnNewButton());
		}
		return panel_6;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("OK");
		}
		return btnNewButton;
	}
	private JPanel getPanel_7() {
		if (panel_7 == null) {
			panel_7 = new JPanel();
			panel_7.setLayout(new GridLayout(3, 0, 0, 0));
			panel_7.add(getPanel_8());
			panel_7.add(getPanel_9());
			panel_7.add(getPanel_10());
		}
		return panel_7;
	}
	private JPanel getPanel_8() {
		if (panel_8 == null) {
			panel_8 = new JPanel();
		}
		return panel_8;
	}
	private JPanel getPanel_9() {
		if (panel_9 == null) {
			panel_9 = new JPanel();
			panel_9.add(getBtnNewButton_1());
			
		}
		return panel_9;
	}
	private JPanel getPanel_10() {
		if (panel_10 == null) {
			panel_10 = new JPanel();
		}
		return panel_10;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Exit");
			btnNewButton_1.addActionListener(this);
		}
		return btnNewButton_1;
	}
	
	public void actionPerformed(ActionEvent e) { 
        JButton btn = (JButton) e.getSource();
        if(btn.equals(btnNewButton_1)) {
            Stage stage = (Stage) btnIrten.getScene().getWindow();
            stage.close();
        }
	}
	
}