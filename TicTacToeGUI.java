import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToeGUI extends JFrame implements ActionListener {

    private JButton[] buttons = new JButton[9];
    private String currentPlayer = "X";
    private boolean gameEnded = false;

    public TicTacToeGUI() {
        setTitle("Tic Tac Toe - Java Swing");
        setSize(400, 400);
        setLayout(new GridLayout(3, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Initialize buttons
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.BOLD, 60));
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if (!clicked.getText().equals("") || gameEnded) {
            return;
        }

        clicked.setText(currentPlayer);

        if (checkWinner()) {
            JOptionPane.showMessageDialog(this, "Congratulations! " + currentPlayer + " wins!");
            gameEnded = true;
        } else if (isBoardFull()) {
            JOptionPane.showMessageDialog(this, "It's a draw!");
            gameEnded = true;
        } else {
            currentPlayer = currentPlayer.equals("X") ? "O" : "X";
        }
    }

    private boolean checkWinner() {
        int[][] winPositions = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // rows
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // cols
            {0, 4, 8}, {2, 4, 6}             // diagonals
        };

        for (int[] pos : winPositions) {
            if (
                !buttons[pos[0]].getText().equals("") &&
                buttons[pos[0]].getText().equals(buttons[pos[1]].getText()) &&
                buttons[pos[1]].getText().equals(buttons[pos[2]].getText())
            ) {
                return true;
            }
        }
        return false;
    }

    private boolean isBoardFull() {
        for (JButton b : buttons) {
            if (b.getText().equals("")) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        new TicTacToeGUI();
    }
}
