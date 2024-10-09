package gym;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class LoginScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen frame = new LoginScreen();
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
	public LoginScreen() {
		setTitle("Gym managin system");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 319);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(3, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(249, 141, 45));
		panel.setBounds(0, 0, 195, 282);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnGymManagingSystem = new JTextPane();
		txtpnGymManagingSystem.setEditable(false);
		txtpnGymManagingSystem.setForeground(new Color(255, 255, 255));
		txtpnGymManagingSystem.setBackground(new Color(249, 141, 45));
		txtpnGymManagingSystem.setFont(new Font("Arial Black", Font.BOLD, 30));
		txtpnGymManagingSystem.setText("GYM MANAGING SYSTEM");
		txtpnGymManagingSystem.setBounds(10, 122, 169, 135);
		panel.add(txtpnGymManagingSystem);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(LoginScreen.class.getResource("/image/weights.png")));
		lblNewLabel.setBounds(10, 31, 73, 81);
		panel.add(lblNewLabel);
		
		JPanel login_panel = new JPanel();
		login_panel.setBounds(217, 135, 309, 72);
		contentPane.add(login_panel);
		login_panel.setLayout(new GridLayout(2, 2, 5, 5));
		
		lblNewLabel_1 = new JLabel("UserName:");
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		login_panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		login_panel.add(textField);
		textField.setColumns(20);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		login_panel.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setColumns(20);
		passwordField.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		login_panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 128, 0));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
		btnNewButton.setBounds(309, 231, 116, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Fitness corner");
		lblNewLabel_3.setForeground(new Color(255, 128, 0));
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 35));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(232, 58, 250, 51);
		contentPane.add(lblNewLabel_3);
	}
}
