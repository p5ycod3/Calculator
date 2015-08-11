import javax.swing.*;
import java.awt.*;

public class CalcFrame extends JFrame {
    CalcFrame() {

        JTextArea display = new JTextArea();
        JPanel buttonPanel = new JPanel(new GridLayout(3,5));
        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonPlus = new JButton("+");
        JButton buttonC = new JButton("c");
        JButton buttonDivide = new JButton("/");
        JButton buttonMinus = new JButton("-");
        JButton buttonMul = new JButton("*");
        JButton buttonStart = new JButton("=");

        setBounds(300, 300, 300, 300);
        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(buttonStart, BorderLayout.SOUTH);
        buttonPanel.add(button0);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonPlus);
        buttonPanel.add(buttonC);
        buttonPanel.add(buttonDivide);
        buttonPanel.add(buttonMinus);
        buttonPanel.add(buttonMul);
        buttonPanel.add(buttonStart);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalcFrame();



    }


}

