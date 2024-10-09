package gym;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class MemberScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberScreen frame = new MemberScreen();
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
	public MemberScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Managing Member");
		setBounds(100, 100, 905, 548);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(233, 233, 233));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(new Color(255, 128, 0));
		panel.setBounds(0, 0, 195, 511);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Coachs");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(255, 128, 0));
		btnNewButton.setBounds(57, 153, 114, 29);
		panel.add(btnNewButton);
		
		JButton btnPayment = new JButton("Payment");
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPayment.setForeground(new Color(255, 128, 0));
		btnPayment.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnPayment.setBackground(new Color(255, 255, 255));
		btnPayment.setBounds(57, 203, 114, 29);
		panel.add(btnPayment);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogOut.setForeground(new Color(255, 128, 0));
		btnLogOut.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnLogOut.setBackground(new Color(255, 255, 255));
		btnLogOut.setBounds(57, 255, 114, 29);
		panel.add(btnLogOut);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MemberScreen.class.getResource("/image/trainer_3676476.png")));
		lblNewLabel.setBounds(23, 153, 24, 29);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MemberScreen.class.getResource("/image/pay_1570917.png")));
		lblNewLabel_1.setBounds(23, 203, 24, 29);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(MemberScreen.class.getResource("/image/icons8-logout-48.png")));
		lblNewLabel_1_1.setBounds(23, 255, 24, 29);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MemberScreen.class.getResource("/image/weights.png")));
		lblNewLabel_2.setBounds(60, 10, 86, 116);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fitness corner");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblNewLabel_3.setBounds(10, 329, 175, 103);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Member's name");
		lblNewLabel_4.setForeground(new Color(255, 128, 0));
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(226, 61, 129, 26);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Manange Member");
		lblNewLabel_5.setForeground(new Color(255, 128, 0));
		lblNewLabel_5.setBackground(new Color(255, 128, 0));
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(384, 10, 273, 36);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("Phone number");
		lblNewLabel_4_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_4_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(462, 61, 129, 26);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Age");
		lblNewLabel_4_1_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_4_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_4_1_1.setBounds(689, 61, 129, 26);
		contentPane.add(lblNewLabel_4_1_1);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		textField.setBounds(226, 97, 158, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBounds(462, 97, 158, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		textField_2.setColumns(10);
		textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setBounds(689, 97, 70, 26);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("Amount");
		lblNewLabel_4_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_4_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_4_2.setBounds(226, 145, 129, 26);
		contentPane.add(lblNewLabel_4_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		textField_3.setColumns(10);
		textField_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_3.setBounds(226, 181, 122, 26);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("Timing");
		lblNewLabel_4_2_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_4_2_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_4_2_1.setBounds(384, 145, 83, 26);
		contentPane.add(lblNewLabel_4_2_1);
		
		JLabel lblNewLabel_4_2_1_1 = new JLabel("Coach");
		lblNewLabel_4_2_1_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_4_2_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_4_2_1_1.setBounds(537, 145, 83, 26);
		contentPane.add(lblNewLabel_4_2_1_1);
		
		JLabel lblNewLabel_4_2_1_2 = new JLabel("Gender");
		lblNewLabel_4_2_1_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_4_2_1_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_4_2_1_2.setBounds(697, 145, 83, 26);
		contentPane.add(lblNewLabel_4_2_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"7AM-9AM", "9AM-11AM", "2PM-4PM", "4PM-6PM", "6PM-8PM"}));
		comboBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		comboBox.setMaximumRowCount(10);
		comboBox.setBounds(384, 181, 108, 26);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setMaximumRowCount(10);
		comboBox_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		comboBox_1.setBounds(537, 181, 108, 26);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox_1_1.setMaximumRowCount(10);
		comboBox_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		comboBox_1_1.setBounds(695, 180, 108, 26);
		contentPane.add(comboBox_1_1);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(new Color(255, 128, 0));
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnNewButton_1.setBounds(340, 237, 85, 26);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Edit");
		btnNewButton_1_1.setForeground(new Color(255, 128, 0));
		btnNewButton_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(472, 237, 85, 26);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Delete");
		btnNewButton_1_2.setForeground(new Color(255, 128, 0));
		btnNewButton_1_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(602, 237, 97, 26);
		contentPane.add(btnNewButton_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(205, 273, 676, 228);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Name", "Phone", "Age", "Amout", "Timing", "Coach", "Gender"
			}
		));
		table.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
	}
}
