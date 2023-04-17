import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class CalcGUI {

	private JFrame frame;
	private JTextField textField;
	private long prevValue = 0; // 기존 계산값
	private String operator = null; // 연산자

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					CalcGUI window = new CalcGUI();
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
	public CalcGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("계산기");
		frame.setBounds(100, 100, 617, 604);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setText("0");
		textField.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		textField.setBounds(12, 10, 581, 104);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		ActionListener numberActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				String numberText = ((JButton) e.getSource()).getText();
				text = text + numberText; // 0 + 1 = 01
				long value = 0;
				try {
					value = Long.parseLong(text);
				} catch (Exception e2) {
				}
				textField.setText("" + value);
			}
		};

		ActionListener operatorActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				try {
					prevValue = Long.parseLong(text);
				} catch (Exception e2) {
					prevValue = 0;
				}
				operator = ((JButton) e.getSource()).getText();
				textField.setText("0");
				System.out.println("operator : " + operator);
				System.out.println("prevValue : " + prevValue);
			}
		};

		ActionListener equalsActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String text = textField.getText();
					long currentValue = Long.parseLong(text);
					long result = 0;
					switch (operator) {
					case "+":
						result = prevValue + currentValue;
						break;
					case "-":
						result = prevValue - currentValue;
						break;
					case "x":
						result = prevValue * currentValue;
						break;
					case "/":
						result = prevValue / currentValue;
						break;
					}
					textField.setText("" + result);
				} catch (Exception e2) {
					textField.setText("0");
				} finally {
					prevValue = 0;
					operator = null;
				}
			}
		};

		ActionListener clearActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
			}
		};

		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnPlus.setBounds(456, 131, 137, 98);
		btnPlus.addActionListener(operatorActionListener);
		frame.getContentPane().add(btnPlus);

		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnMinus.setBounds(456, 239, 137, 98);
		btnMinus.addActionListener(operatorActionListener);
		frame.getContentPane().add(btnMinus);

		JButton btnMulti = new JButton("x");
		btnMulti.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnMulti.setBounds(456, 347, 137, 98);
		btnMulti.addActionListener(operatorActionListener);
		frame.getContentPane().add(btnMulti);

		JButton btnDivide = new JButton("/");
		btnDivide.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnDivide.setBounds(456, 455, 137, 98);
		btnDivide.addActionListener(operatorActionListener);
		frame.getContentPane().add(btnDivide);

		JButton btnEquals = new JButton("=");
		btnEquals.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnEquals.setBounds(297, 455, 130, 98);
		btnEquals.addActionListener(equalsActionListener);
		frame.getContentPane().add(btnEquals);

		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnClear.setBounds(12, 455, 130, 98);
		btnClear.addActionListener(clearActionListener);
		frame.getContentPane().add(btnClear);

		JButton btnNumber1 = new JButton("1");
		btnNumber1.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnNumber1.setBounds(12, 131, 130, 98);
		btnNumber1.addActionListener(numberActionListener);
		frame.getContentPane().add(btnNumber1);

		JButton btnNumber2 = new JButton("2");
		btnNumber2.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnNumber2.setBounds(155, 131, 130, 98);
		frame.getContentPane().add(btnNumber2);
		btnNumber2.addActionListener(numberActionListener);

		JButton btnNumber3 = new JButton("3");
		btnNumber3.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnNumber3.setBounds(297, 131, 130, 98);
		frame.getContentPane().add(btnNumber3);
		btnNumber3.addActionListener(numberActionListener);

		JButton btnNumber4 = new JButton("4");
		btnNumber4.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnNumber4.setBounds(12, 239, 130, 98);
		frame.getContentPane().add(btnNumber4);
		btnNumber4.addActionListener(numberActionListener);

		JButton btnNumber5 = new JButton("5");
		btnNumber5.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnNumber5.setBounds(155, 239, 130, 98);
		btnNumber5.addActionListener(numberActionListener);
		frame.getContentPane().add(btnNumber5);

		JButton btnNumber6 = new JButton("6");
		btnNumber6.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnNumber6.setBounds(297, 239, 130, 98);
		btnNumber6.addActionListener(numberActionListener);
		frame.getContentPane().add(btnNumber6);

		JButton btnNumber7 = new JButton("7");
		btnNumber7.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnNumber7.setBounds(12, 347, 130, 98);
		btnNumber7.addActionListener(numberActionListener);
		frame.getContentPane().add(btnNumber7);

		JButton btnNumber8 = new JButton("8");
		btnNumber8.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnNumber8.setBounds(155, 347, 130, 98);
		btnNumber8.addActionListener(numberActionListener);
		frame.getContentPane().add(btnNumber8);

		JButton btnNumber9 = new JButton("9");
		btnNumber9.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnNumber9.setBounds(297, 347, 130, 98);
		btnNumber9.addActionListener(numberActionListener);
		frame.getContentPane().add(btnNumber9);

		JButton btnNumber0 = new JButton("0");
		btnNumber0.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		btnNumber0.setBounds(155, 455, 130, 98);
		btnNumber0.addActionListener(numberActionListener);
		frame.getContentPane().add(btnNumber0);

	}
}
