import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class BasicGUI {

	private JFrame frame;
	private JTextField textFieldID;
	private JTextField textFieldPW;
	private JButton btnNewButton;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasicGUI window = new BasicGUI();
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
	public BasicGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("로그인 데모");
		frame.setBounds(100, 100, 787, 616);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("로그인 데모");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		lblTitle.setBounds(225, 23, 323, 62);
		frame.getContentPane().add(lblTitle);
		
		JPanel panel = new JPanel();
		panel.setBounds(131, 101, 528, 116);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(0, 6, 55, 41);
		panel.add(lblID);
		lblID.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		lblID.setHorizontalAlignment(SwingConstants.TRAILING);
		
		JLabel lblPW = new JLabel("PW");
		lblPW.setBounds(0, 69, 55, 41);
		panel.add(lblPW);
		lblPW.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPW.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		
		textFieldID = new JTextField();
		textFieldID.setBounds(84, 0, 283, 53);
		panel.add(textFieldID);
		textFieldID.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldID.setFont(new Font("맑은 고딕", Font.BOLD, 28));
		textFieldID.setColumns(10);
		
		textFieldPW = new JTextField();
		textFieldPW.setBounds(84, 63, 283, 53);
		panel.add(textFieldPW);
		textFieldPW.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPW.setFont(new Font("맑은 고딕", Font.BOLD, 28));
		textFieldPW.setColumns(10);
		
		btnNewButton = new JButton("로그인");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				System.out.println("클릭 시간 : " + sdf.format(e.getWhen()));
				// 로그인 기능
				// 입력된 ID와 PW가 test1/1212이면 로그인 성공 아니면 실패
				
				String id = textFieldID.getText();
				String pw= textFieldPW.getText();
				
				System.out.println("ID : " + id + ", PW : " + pw);
				
				if(id.equals("test1") && pw.equals("1212")) {
					// 로그인 성공
					textArea.append("로그인에 성공하였습니다. time : " + sdf.format(e.getWhen())+"\n");
					JOptionPane.showMessageDialog(frame, "로그인 성공");
				}else {
					// 로그인 실패
					textArea.append("로그인 실패하였습니다!! time : " + sdf.format(e.getWhen())+"\n" );
					JOptionPane.showMessageDialog(frame, "로그인 실패!");
				}
			}
		});
		
		btnNewButton.setBounds(389, 2, 139, 114);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 244, 695, 313);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
	}
}