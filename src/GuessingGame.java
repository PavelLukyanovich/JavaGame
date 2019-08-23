import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame {
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	private JButton btnPlayAgane;
	int count1 = 7;
	int count2 = 1;

	public void checkGuess() {
		String guessText = txtGuess.getText();
		String message = "";
		try {
			int guess = Integer.parseInt(guessText);
			if (count1 == 0) {
				message = "You lose... Number is: " + theNumber;
				btnPlayAgane.setVisible(true);
				count1 = 7;
			} else if (guess < theNumber)
				message = guess + " is to low, try agane";
			else if (guess > theNumber)
				message = guess + " is to hight, try agane";
			else {
				message = guess + " is correct! YOU WIN!!! You make " + count2 + " attempt. Let's play agane?";
				btnPlayAgane.setVisible(true);
			}
		} catch (Exception e) {
			message = "Enter a whole number between 1 - 100!";
		} finally {
			lblOutput.setToolTipText(message);
			txtGuess.requestFocus();
			txtGuess.selectAll();
		}
		lblOutput.setText(message);
		txtGuess.requestFocus();
		txtGuess.selectAll();
	}

	public void newGame() {
		theNumber = (int) (Math.random() * 100 + 1);
	}

	public GuessingGame() {
		getContentPane().setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hi-Lo Guessing Game");
		getContentPane().setLayout(null);

		JLabel lblHiloGuessGame = new JLabel("Pavel Lukyanovich Hi-Lo Guess Game");
		lblHiloGuessGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblHiloGuessGame.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHiloGuessGame.setBounds(10, 38, 414, 19);
		getContentPane().add(lblHiloGuessGame);

		JLabel lblGuessANumber = new JLabel("Guess a number between 1 and 100:");
		lblGuessANumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGuessANumber.setBounds(95, 95, 213, 16);
		getContentPane().add(lblGuessANumber);

		txtGuess = new JTextField();
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
				count1--;
				count2++;
			}
		});
		txtGuess.setHorizontalAlignment(SwingConstants.RIGHT);
		txtGuess.setBounds(308, 94, 36, 20);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);

		lblOutput = new JLabel("Enter a number above and click Guess");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(10, 210, 414, 14);
		getContentPane().add(lblOutput);

		JButton btnGuess = new JButton("Guess!");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnGuess.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnGuess.setBounds(172, 149, 89, 23);
		getContentPane().add(btnGuess);

		btnPlayAgane = new JButton("Play agane!");
		btnPlayAgane.setEnabled(true);
		btnPlayAgane.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newGame();
				btnPlayAgane.setVisible(false);
			}
		});
		btnPlayAgane.setBounds(335, 229, 89, 23);
		getContentPane().add(btnPlayAgane);
	}

	public static void main(String[] args) {
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(450, 300));
		theGame.setVisible(true);

	}
}