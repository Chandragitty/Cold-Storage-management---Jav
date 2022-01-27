package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class cold_storage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textField_4;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cold_storage window = new cold_storage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public cold_storage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Chandra's Cold Storage");
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 10));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(103, 10, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Slip No.");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setBounds(10, 13, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Type of Item");
		lblNewLabel_1.setBounds(227, 11, 80, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(317, 10, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"    Slip No.", "Quantity(in qntl)", " Farmer Name", " Type of Item", "      Date", " Signature"},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"   Slip No.", "", "Farmer Name", "Type of Item", "      ", "Signature"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(115);
		table.getColumnModel().getColumn(1).setMinWidth(17);
		table.getColumnModel().getColumn(2).setPreferredWidth(111);
		table.getColumnModel().getColumn(3).setPreferredWidth(99);
		table.getColumnModel().getColumn(4).setPreferredWidth(82);
		table.setBounds(10, 112, 416, 80);
		frame.getContentPane().add(table);
		
		lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setBounds(10, 42, 71, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(103, 39, 96, 19);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(317, 36, 96, 19);
		frame.getContentPane().add(textField_3);
		
		lblNewLabel_3 = new JLabel("Date");
		lblNewLabel_3.setBounds(249, 39, 45, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Farmer's Name");
		lblNewLabel_4.setBounds(10, 68, 93, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(103, 65, 96, 19);
		frame.getContentPane().add(textField_4);
		
		JButton btnNewButton = new JButton("Generate Slip");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String t =textField.getText();// t now has the slip no.
		        table.setValueAt(t, 1, 0); //slip no.
		        
		        String t1 =textField_2.getText();//Quantity
		        table.setValueAt(t1, 1, 1);
		        
		        String t2 =textField_1.getText();//type of item
		        table.setValueAt(t2, 1, 3);
		        
		        String t3 =textField_4.getText();//farmer
		        table.setValueAt(t3, 1, 2);
		        
		        String t4 =textField_3.getText();// date
		        table.setValueAt(t4, 1, 4);
		        
				
				
				
				
			}
		});
		btnNewButton.setBounds(28, 217, 119, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				table.setValueAt(null, 1, 0);
				table.setValueAt(null, 1, 1);
				table.setValueAt(null, 1, 2);
				table.setValueAt(null, 1, 3);
				table.setValueAt(null, 1, 4);
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				
				
				
				
						
			}
		});
		btnNewButton_1.setBounds(295, 217, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
	}
}
