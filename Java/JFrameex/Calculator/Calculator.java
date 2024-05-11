package JFrameex.Calculator;

import JFrameex.JavaGamingHub.MainHub;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[11];
	JButton addButton, subButton, mulButton, divButton, factorialButton, powButton;
	JButton decButton, equButton, delButton, clrButton, negButton;
	JTextField q = new JTextField();
	JPanel panel;
	JMenuBar menuBar;
	JMenu GoBack;
	JMenuItem clickme;
	JScrollPane scrollBar = new JScrollPane(textfield, JScrollPane.VERTICAL_SCROLLBAR_NEVER,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	Font myFont = new Font("Verdana", Font.BOLD, 30);

	double num1 = 0, num2 = 0, result = 0;
	char operator;
	boolean isPressedOperator;
	boolean doEqu;

	public Calculator() {

		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 550);
		frame.setLayout(null);

		textfield = new JTextField();
		textfield.setBounds(50, 30, 300, 50);
		textfield.setFont(myFont);
		textfield.setEditable(false);

		scrollBar.setBounds(50, 30, 300, 50);
		scrollBar.setFont(myFont);

		q.setBounds(0, 0, 100, 30);
		q.setBackground(Color.GRAY);
		q.setFont(new Font("Ink Free", Font.BOLD, 16));
		q.setEditable(false);

		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		GoBack = new JMenu("Go Back");
		menuBar.add(GoBack);

		clickme = new JMenuItem("Ok so click me");
		clickme.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				MainHub.dot();
			}
		});
		GoBack.add(clickme);

		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("<-");
		clrButton = new JButton("AC");
		negButton = new JButton("(-)");
		factorialButton = new JButton("!");
		powButton = new JButton("^");

		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		functionButtons[8] = negButton;
		functionButtons[9] = factorialButton;
        functionButtons[10] = powButton;

		for (int i = 0; i < 11; i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
		}

		for (int i = 0; i < 10; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
			numberButtons[i].setBackground(new Color(250, 250, 250));
		}

		negButton.setBounds(50, 430, 100, 50);
		delButton.setBounds(150, 430, 100, 50);
		clrButton.setBounds(250, 430, 100, 50);

		panel = new JPanel();
		panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(5, 4, 10, 10));

		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		panel.add(factorialButton);
		panel.add(decButton);
		panel.add(numberButtons[0]);
		panel.add(equButton);
		panel.add(divButton);

		frame.add(scrollBar);
		frame.add(panel);
		frame.add(negButton);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(textfield);
		frame.add(q);
		frame.setVisible(true);
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		Calculator calc = new Calculator();
	}

	public void doEqu(ActionEvent e) {
		if (e.getSource() == equButton) {
			num2 = Double.parseDouble(textfield.getText());

			switch (operator) {
				case '+':
					q.setText(num1 + " " + operator + " " + num2);
					result = num1 + num2;
					break;
				case '-':
					q.setText(num1 + " " + operator + " " + num2);
					result = num1 - num2;
					break;
				case '*':
					q.setText(num1 + " " + operator + " " + num2);
					result = num1 * num2;
					break;
				case '/':
					q.setText(num1 + " " + operator + " " + num2);
					result = num1 / num2;
					break;
				case '!':
					q.setText(num1 + "!");
					for (int i = 0; i <= num1; i++) {
						result += i;
					}
					break;
                case '^':
                    q.setText(num1 + "^");
                    result = Math.pow(num1, num2);
			}
			textfield.setText(String.valueOf(result));
			num1 = result;
			doEqu = false;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < 10; i++) {
			if (e.getSource() == numberButtons[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
		}
		if (e.getSource() == decButton) {
			textfield.setText(textfield.getText().concat("."));
		}
		if (e.getSource() == addButton) {

			q.setText(textfield.getText());
			num1 = Double.parseDouble(textfield.getText());
			operator = '+';
			textfield.setText("");
			isPressedOperator = true;
		}
		if (e.getSource() == subButton) {
			if (isPressedOperator) {
				doEqu(e);
			}
			q.setText(textfield.getText());
			num1 = Double.parseDouble(textfield.getText());
			operator = '-';
			textfield.setText("");
		}
		if (e.getSource() == mulButton) {
			if (isPressedOperator) {
				doEqu(e);
			}
			q.setText(textfield.getText());
			num1 = Double.parseDouble(textfield.getText());
			operator = '*';
			textfield.setText("");
		}
		if (e.getSource() == divButton) {
			q.setText(textfield.getText());
			num1 = Double.parseDouble(textfield.getText());
			operator = '/';
			textfield.setText("");
		}
		if (e.getSource() == factorialButton) {
			q.setText(textfield.getText());
			num1 = Double.parseDouble(textfield.getText());
			operator = '!';
			textfield.setText("");
		}
		doEqu(e);
		if (e.getSource() == clrButton) {
			textfield.setText("");
		}
		if (e.getSource() == delButton) {
			String string = textfield.getText();
			textfield.setText("");
			for (int i = 0; i < string.length() - 1; i++) {
				textfield.setText(textfield.getText() + string.charAt(i));
			}
		}
		if (e.getSource() == negButton) {
			double temp = Double.parseDouble(textfield.getText());
			temp *= -1;
			textfield.setText(String.valueOf(temp));
		}
        if (e.getSource() == powButton) {
            q.setText(textfield.getText());
            num1 = Double.parseDouble(textfield.getText());
            operator = '^';
            textfield.setText("");
        }
	}
}