import javax.swing.JOptionPane;

public class PopUpPractice
{
    public static void main ( String[] args )
    {
        int num1, result;
        String numStr,output;

        numStr = JOptionPane.showInputDialog("Enter an Interger: ");

        System.out.println("You enterd: " + numStr);
        num1 = Integer.parseInt(numStr);

        result = num1 / 2;

        System.out.println("Half of that is: " + result);

        output = num1 + " is a " + ((num1 %2 == 0) ? "even. " : " odd. ");
        System.out.println(output);
    }// end main method
}//end class
