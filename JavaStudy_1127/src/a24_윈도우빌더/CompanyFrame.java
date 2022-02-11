package a24_윈도우빌더;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import a24_윈도우빌더.Dao.UserDao;
import a24_윈도우빌더.Dto.User;
import a24_윈도우빌더.Service.UserService;
import a24_윈도우빌더.Service.UserServiceImpl;
import db.DBConnectionMgr;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Map;

public class CompanyFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private UserService userService;
	
	private JPanel mainCard;
	private CardLayout cardLayout;
	private JTextField usernameText;
	private JPasswordField passwordText;

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
		DBConnectionMgr pool = DBConnectionMgr.getInstance();
		UserDao userDao = new UserDao(pool);
		userService = new UserServiceImpl(userDao);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 446);
		mainCard = new JPanel();
		mainCard.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainCard);
		cardLayout = new CardLayout(0, 0);
		mainCard.setLayout(cardLayout);
		
		JPanel loginPanel = new JPanel();
		mainCard.add(loginPanel, "loginPanel");
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
		
		usernameText = new JTextField();
		usernameText.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		usernameText.setBounds(273, 120, 270, 30);
		loginPanel.add(usernameText);
		usernameText.setColumns(10);
		
		passwordText = new JPasswordField();
		passwordText.setFont(new Font("굴림", Font.PLAIN, 16));
		passwordText.setBounds(273, 173, 270, 30);
		loginPanel.add(passwordText);
		
		JLabel welcomeMessage = new JLabel("");
		
		JButton loginButton = new JButton("\uB85C\uADF8\uC778");
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Map<String, String> resultMap = userService.authLogin(usernameText.getText(), passwordText.getText());
			/*	int result = JOptionPane.showConfirmDialog(null, "test", "타이틀1", JOptionPane.YES_NO_CANCEL_OPTION);
				System.out.println(result); //yes = 0 / no = 1
				String text = JOptionPane.showInputDialog(null, "입력해주세요.", "타이틀2", JOptionPane.PLAIN_MESSAGE);
				System.out.println(text); */
				JOptionPane.showMessageDialog(null, resultMap.get("content"), resultMap.get("title"), JOptionPane.PLAIN_MESSAGE);
				if(resultMap.get("flag").equals("2")) {
					User user = userService.getUser(usernameText.getText());
					usernameText.setText(""); //아이디비번 입력한게 그대로 남아있어서 지워줌
					passwordText.setText("");
					welcomeMessage.setText(user.getName() + "님 환영합니다.");
					cardLayout.show(mainCard, "indexPanel"); //2(아이디 비번 일치)일경우 mainCard 안의 "indexPanel"을 제일 위로 올려라
				}
			}
		});
		loginButton.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		loginButton.setBounds(204, 239, 338, 30);
		loginPanel.add(loginButton);
		
		JPanel indexPanel = new JPanel();
		mainCard.add(indexPanel, "indexPanel");
		indexPanel.setLayout(null);
		
	
		welcomeMessage.setBounds(27, 21, 262, 36);
		indexPanel.add(welcomeMessage);
	}
}
