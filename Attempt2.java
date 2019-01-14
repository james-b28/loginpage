import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class Attempt2 {

	private JFrame frame;
	private String userName;
	private String userPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Attempt2 window = new Attempt2();
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
	public Attempt2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 432, 202);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToLogin = new JLabel("Welcome to Login Page");
		lblWelcomeToLogin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblWelcomeToLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToLogin.setBounds(24, 11, 352, 35);
		frame.getContentPane().add(lblWelcomeToLogin);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				String pass = null;
				String usr = JOptionPane.showInputDialog(null, "Enter Username");
				boolean confirm = false;
				if (usr.contentEquals(userName))
				{
					pass = JOptionPane.showInputDialog(null, "Enter Password for " + usr );
					confirm = true;
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please try again");
				}
				
				if (confirm = true && pass.equals(userPass))
				{
					JOptionPane.showMessageDialog(null, "Logged in");
				}
				
				
				
				
			}
		});
		btnLogin.setBounds(56, 57, 140, 100);
		frame.getContentPane().add(btnLogin);
		
		JButton btnSignup = new JButton("Sign-up");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
			
				userName = JOptionPane.showInputDialog(null, "Enter username");
				userPass = JOptionPane.showInputDialog(null, "Enter password");
				
				
				
			}
		});
		btnSignup.setBounds(221, 57, 129, 100);
		frame.getContentPane().add(btnSignup);
	}
}
