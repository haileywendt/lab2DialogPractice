import javax.swing.JOptionPane;

/**
 * Description of Swing's JOptionPane's showInputDialog method.
 *
 * @author Hailey M. Wendt
 * @version 1.0 - 1 February 2022
 */
public class InputDialog
{
   public static void main(String[] args){
       String prompt1 = "Enter an integer.";
       String prompt2 = "Enter a floating-point value.";
       String intValue = JOptionPane.showInputDialog(null, prompt1);
       String numValue = JOptionPane.showInputDialog(null, prompt2);
       int addend = Integer.parseInt(intValue);
       double augend = Double.parseDouble(numValue);
       double sum = addend + augend;
       JOptionPane.showMessageDialog(null, "" + sum);
   }
}
