import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Write a description of class GuessingGame here.
 *
 * @author Hailey M. Wendt
 * @version 1.0 - 1 February 2022
 */
public class GuessingGame
{
    public static void main(String[] args){
        Random rnd = new Random();
        int answer = rnd.nextInt(100) + 1;
        boolean win = false;
        
        String title = "Guess #1";
        String initialPrompt = "<HTML>I'm thinking of an integer between 1 and 100, inclusive. <br> What is your initial guess?";
        String userInput = JOptionPane.showInputDialog(null, initialPrompt, title, JOptionPane.PLAIN_MESSAGE);
        
        int input = Integer.parseInt(userInput);
        int roll = 2;
        
        while(win == false){
            title = "Guess #" + roll;
            if (input > answer){
                String highPrompt = "<HTML>Your guess is too high. <br>What is your next guess?";
                userInput = JOptionPane.showInputDialog(null, highPrompt, title, JOptionPane.PLAIN_MESSAGE);
                input = Integer.parseInt(userInput);
                roll++;
            }
            else if(input < answer){
                String lowPrompt = "<HTML>Your guess is too low. <br>What is your next guess?";
                userInput = JOptionPane.showInputDialog(null, lowPrompt, title, JOptionPane.PLAIN_MESSAGE);
                input = Integer.parseInt(userInput);
                roll++;
            }
            else{
                title = "You Won!";
                String endPrompt = "<HTML>Correct - the hidden value was " + answer + "! <br>You got it in " + roll + " guesses!";
                JOptionPane.showMessageDialog(null, endPrompt, title, JOptionPane.PLAIN_MESSAGE);
                win = true;
            }
        }
    }
}
