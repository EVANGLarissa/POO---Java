/***Desenvolva um programa em Java (utilizando a IDE Eclipse) com uma Interface Gráfica com o Usuário (GUI) que permita ao usuário
tentar adivinhar um dado número escolhido randomicamente pelo programa (número entre 1 e 20):

	a. A GUI deverá ter 20 botões (JButton), cada um correspondendo a um número, e quando o usuário clicar no botão escolhido,
	o programa deverá imprimir em tela de console o número escolhido pelo usuário, e o número escolhido pelo programa, bem
	como se o usuário acertou ou não o número escolhido pelo programa;

	b. A GUI permitirá que o usuário tente 5 vezes adivinhar o número. A cada tentativa, a GUI deverá exibir, em um JTextField,
	qual é a tentativa atual do usuário;***/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q8_LarissaEvangelista extends JFrame {

    private JButton[] buttons;
    private JTextField textField;
    private int numberToGuess;
    private int attempts;

    public Q8_LarissaEvangelista() {
        setTitle("Guess Number Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        buttons = new JButton[20];
        for (int i = 0; i < 20; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            buttons[i].addActionListener(new ButtonClickListener());
            add(buttons[i]);
        }

        textField = new JTextField(10);
        add(textField);

        numberToGuess = (int) (Math.random() * 20) + 1;
        attempts = 0;
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            int userGuess = Integer.parseInt(clickedButton.getText()); //

            attempts++; 

            textField.setText("Tentativa " + attempts);

            if (userGuess == numberToGuess) {
                JOptionPane.showMessageDialog(null, "Você conseguiu! O número escolhido foi: " + numberToGuess);
            } else {
                if (attempts == 5) {
                    JOptionPane.showMessageDialog(null, "Você não acertou :(" +  "\n O número escolhido foi: " + numberToGuess);
                }
            }
        }
    }

    public static void main(String[] args) {
        Q8_LarissaEvangelista game = new Q8_LarissaEvangelista();
        game.setSize(400, 100);
        game.setVisible(true);
    }
}
