package advanced_calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Advanced_Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	double firstnum;
	double secondnum;
	double result;
	String operations;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advanced_Calculator window = new Advanced_Calculator();
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
	public Advanced_Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 388, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtDisplay.setBounds(10, 11, 349, 41);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);

		//================== Row 1 ===================================

		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if(txtDisplay.getText().length()>0)
				{
					String backspace=null;
					StringBuilder strB=new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace=strB.toString();
					txtDisplay.setText(backspace);;
				}
			}
		});
		btnBackspace.setFont(new Font("Wingding", Font.BOLD, 25));
		btnBackspace.setBounds(10, 63, 80, 80);
		frame.getContentPane().add(btnBackspace);

		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				  txtDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClear.setBounds(100, 63, 80, 80);
		frame.getContentPane().add(btnClear);

		JButton btnModulus = new JButton("%");
		btnModulus.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
			    firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";

			}
		});
		btnModulus.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnModulus.setBounds(190, 63, 80, 80);
		frame.getContentPane().add(btnModulus);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 firstnum = Double.parseDouble(txtDisplay.getText());
					txtDisplay.setText("");
					operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPlus.setBounds(283, 63, 80, 80);
		frame.getContentPane().add(btnPlus);

		//================== Row 2 ===================================

				JButton btn7 = new JButton("7");
				btn7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterValue= txtDisplay.getText()+btn7.getText();
						txtDisplay.setText(EnterValue);
					}
				});
				btn7.setFont(new Font("Tahoma", Font.BOLD, 25));
				btn7.setBounds(10, 154, 80, 80);
				frame.getContentPane().add(btn7);

				JButton btn8 = new JButton("8");
				btn8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterValue= txtDisplay.getText()+btn8.getText();
						txtDisplay.setText(EnterValue);
					}
				});
				btn8.setFont(new Font("Tahoma", Font.BOLD, 25));
				btn8.setBounds(100, 154, 80, 80);
				frame.getContentPane().add(btn8);

				JButton btn9 = new JButton("9");
				btn9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterValue= txtDisplay.getText()+btn9.getText();
						txtDisplay.setText(EnterValue);
					}
				});
				btn9.setFont(new Font("Tahoma", Font.BOLD, 25));
				btn9.setBounds(190, 154, 80, 80);
				frame.getContentPane().add(btn9);

				JButton btnMinus = new JButton("-");
				btnMinus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						 firstnum = Double.parseDouble(txtDisplay.getText());
							txtDisplay.setText("");
							operations = "-";
					}
				});
				btnMinus.setFont(new Font("Tahoma", Font.BOLD, 25));
				btnMinus.setBounds(283, 154, 80, 80);
				frame.getContentPane().add(btnMinus);

				//================== Row 3 ===================================

				JButton btn4 = new JButton("4");
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterValue= txtDisplay.getText()+btn4.getText();
						txtDisplay.setText(EnterValue);
					}
				});
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
				btn4.setBounds(10, 246, 80, 80);
				frame.getContentPane().add(btn4);

				JButton btn5 = new JButton("5");
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterValue= txtDisplay.getText()+btn5.getText();
						txtDisplay.setText(EnterValue);
					}
				});
				btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
				btn5.setBounds(100,246, 80, 81);
				frame.getContentPane().add(btn5);

				JButton btn6 = new JButton("6");
				btn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterValue= txtDisplay.getText()+btn6.getText();
						txtDisplay.setText(EnterValue);
					}
				});
				btn6.setFont(new Font("Tahoma", Font.BOLD, 25));
				btn6.setBounds(190, 245, 80, 80);
				frame.getContentPane().add(btn6);

				JButton btnMultiply = new JButton("*");
				btnMultiply.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						 firstnum = Double.parseDouble(txtDisplay.getText());
							txtDisplay.setText("");
							operations = "*";
					}
				});
				btnMultiply .setFont(new Font("Tahoma", Font.BOLD, 25));
				btnMultiply .setBounds(283, 245, 80, 80);
				frame.getContentPane().add(btnMultiply );

				//================== Row 4 ===================================

				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterValue= txtDisplay.getText()+btn1.getText();
						txtDisplay.setText(EnterValue);
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
				btn1.setBounds(10, 337, 80, 80);
				frame.getContentPane().add(btn1);

				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterValue= txtDisplay.getText()+btn2.getText();
						txtDisplay.setText(EnterValue);
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 25));
				btn2.setBounds(100, 338, 80, 80);
				frame.getContentPane().add(btn2);

				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterValue= txtDisplay.getText()+btn3.getText();
						txtDisplay.setText(EnterValue);
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
				btn3.setBounds(190, 336, 80, 80);
				frame.getContentPane().add(btn3);

				JButton btnDivide = new JButton("/");
				btnDivide.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						 firstnum = Double.parseDouble(txtDisplay.getText());
							txtDisplay.setText("");
							operations = "/";
					}
				});
				btnDivide.setFont(new Font("Tahoma", Font.BOLD, 25));
				btnDivide.setBounds(283, 336, 80, 80);
				frame.getContentPane().add(btnDivide);

                //================== Row 5 ===================================

				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterValue= txtDisplay.getText()+btn0.getText();
						txtDisplay.setText(EnterValue);
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 25));
				btn0.setBounds(10, 428, 80, 80);
				frame.getContentPane().add(btn0);

				JButton btnDot = new JButton(".");
				btnDot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterValue= txtDisplay.getText()+btnDot.getText();
						txtDisplay.setText(EnterValue);
					}
				});
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 25));
				btnDot.setBounds(100, 429, 80, 80);
				frame.getContentPane().add(btnDot);

				JButton btnPM = new JButton("\u00B1");
				btnPM.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						double plusminus=Double.parseDouble(String.valueOf(txtDisplay.getText()));
						plusminus=plusminus*(-1);
						txtDisplay.setText(String.valueOf(plusminus));

					}
				});
				btnPM.setFont(new Font("Tahoma", Font.BOLD, 25));
				btnPM.setBounds(190, 427, 80, 81);
				frame.getContentPane().add(btnPM);

				JButton btnEqual = new JButton("=");
				btnEqual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String answer;
						secondnum=Double.parseDouble(txtDisplay.getText());

						if(operations=="+")
						{
							result=firstnum+secondnum;
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);

						}
						else if(operations=="-")
						{
							result=firstnum-secondnum;
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);

						}
						else if(operations=="*")
						{
							result=firstnum*secondnum;
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);

						}
						else if(operations=="/")
						{
							result=firstnum/secondnum;
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);

						}
						else if(operations=="%")
						{
							result=firstnum%secondnum;
							answer=String.format("%.2f",result);
							txtDisplay.setText(answer);

						}

					}
				});
				btnEqual.setFont(new Font("Tahoma", Font.BOLD, 25));
				btnEqual.setBounds(283, 427, 80, 81);
				frame.getContentPane().add(btnEqual);
	}
}
