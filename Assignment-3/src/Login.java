import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;

public class Login {

	protected JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1156, 738);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(221, 160, 221)));
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(10, 11, 1142, 678);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblshopName = new JLabel("Grocery Store");
		lblshopName.setBackground(Color.BLACK);
		lblshopName.setHorizontalAlignment(SwingConstants.CENTER);
		lblshopName.setForeground(new Color(0, 0, 0));
		lblshopName.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblshopName.setBounds(399, 11, 323, 111);
		panel.add(lblshopName);
		
		JLabel UserType = new JLabel("Select User Type");
		UserType.setBackground(Color.BLACK);
		UserType.setHorizontalAlignment(SwingConstants.CENTER);
		UserType.setForeground(new Color(0, 0, 0));
		UserType.setFont(new Font("Rockwell", Font.BOLD, 40));
		UserType.setBounds(362, 132, 394, 111);
		panel.add(UserType);
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin().Admin.setVisible(true);
				frame.dispose();
			}
		});
		btnAdmin.setForeground(new Color(0, 0, 0));
		btnAdmin.setFont(new Font("Roboto", Font.BOLD, 24));
		btnAdmin.setBackground(new Color(187, 134, 252));
		btnAdmin.setBounds(462, 399, 193, 60);
		panel.add(btnAdmin);
		
		JButton btnCustomer = new JButton("CUSTOMER");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Customer().Customer.setVisible(true);
				frame.dispose();
			}
		});
		btnCustomer.setBackground(new Color(187, 134, 252));
		btnCustomer.setForeground(new Color(0, 0, 0));
		btnCustomer.setFont(new Font("Roboto", Font.BOLD, 24));
		btnCustomer.setBounds(462, 279, 193, 60);
		panel.add(btnCustomer);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Image/Login.jpg")));
		lblNewLabel.setBounds(0, 0, 1132, 678);
		panel.add(lblNewLabel);
	}

}
