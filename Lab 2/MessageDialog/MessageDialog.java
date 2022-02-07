
import javax.swing.JOptionPane;

/**
 * Description of Swing's JOptionPane's showMessageDialog method.
 *
 * @author Hailey M. Wendt
 * @version 1.0 - 1 February 2022
 */
public class MessageDialog
{
   public static void main(String[] args){
        String text = "<HTML><i>This</i> is a <br><font color=\"red\">two-line message.";
        String title = "Attention!";
        int type = JOptionPane.ERROR_MESSAGE;
        JOptionPane.showMessageDialog(null, text, title, type);
   }
}
