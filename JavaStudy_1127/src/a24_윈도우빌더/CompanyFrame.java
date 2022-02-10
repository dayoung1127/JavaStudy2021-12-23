package a24_윈도우빌더;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CompanyFrame extends JFrame {

	private JPanel mainCard;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyFrame frame = new CompanyFrame();
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
	public CompanyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 446);
		mainCard = new JPanel();
		mainCard.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainCard);
		mainCard.setLayout(new CardLayout(0, 0));
		
		JPanel loginPanel = new JPanel();
		mainCard.add(loginPanel, "name_81298044710500");
		loginPanel.setLayout(null);
		
		JLabel usernameLabel = new JLabel("\uC544\uC774\uB514");
		usernameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		usernameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		usernameLabel.setBounds(204, 124, 57, 15);
		loginPanel.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		passwordLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		passwordLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		passwordLabel.setBounds(157, 177, 105, 15);
		loginPanel.add(passwordLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		textField.setBounds(273, 120, 270, 30);
		loginPanel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("굴림", Font.PLAIN, 16));
		passwordField.setBounds(273, 173, 270, 30);
		loginPanel.add(passwordField);
		
		JButton loginButton = new JButton("\uB85C\uADF8\uC778");
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("로그인 버튼 클릭?");
			}
		});
		loginButton.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		loginButton.setBounds(204, 239, 338, 30);
		loginPanel.add(loginButton);
		
		JPanel indexPanel = new JPanel();
		mainCard.add(indexPanel, "name_81378563526800");
		indexPanel.setLayout(null);
	}
}
