import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Example of using the Random class from the java.util package for integer generation.
 *
 * @author Hailey M. Wendt
 * @version 1.0 - 1 February 2022
 */
public class RandomDemo
{
    public static void main(String[] args){
        Random rnd = new Random();
        int die1;
        int die2;
        
        for(int roll = 1; roll <= 5; roll++){
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            
            String title = "Roll #" + roll + " of 5";
            String result = "<HTML>You have rolled a " + die1 + " and a " + die2 + "<br>Total is " + (die1 + die2);
            
            JOptionPane.showMessageDialog(null, result, title, JOptionPane.PLAIN_MESSAGE);
        }
    }
}
