import javax.swing.JOptionPane;
public class CalculateTwoDoubleNumber{
    public static void main(String[] args){
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", 
                "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ", 
                "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double diff = Math.abs(num1 - num2);
        double product = num1 * num2;
        if(num2 == 0){
            JOptionPane.showMessageDialog(null, "Cannot devide by 0");
        } else {
            JOptionPane.showMessageDialog(null, "Sum : " + sum + "\n" +
                                                "Difference : " + diff + "\n" +
                                                "Product : " + product + "\n" +
                                                "Quotient : " + (num1/num2) );
        }
    }
}
