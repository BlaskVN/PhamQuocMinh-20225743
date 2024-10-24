import javax.swing.JOptionPane;
public class SecondDegreeEquation {
    public static void main(String[] args) {
        String strA, strB, strC;
        strA = JOptionPane.showInputDialog(null,
                "Please input a: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        strB = JOptionPane.showInputDialog(null,
                "Please input b: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        strC = JOptionPane.showInputDialog(null,
                "Please input b: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);
        if(a == 0){
            if(b == 0 && c!=0){
                JOptionPane.showMessageDialog(null,
                     "Equation with no solution");
            } else if (b==0 && c==0){
                JOptionPane.showMessageDialog(null, 
                    "Equation with infinite solutions");
            } else {
                double ans = -c / b;
                JOptionPane.showMessageDialog(null, 
                    "The equation has only one solution: " + ans);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if(delta < 0) {
                JOptionPane.showMessageDialog(null,
                     "Equation with no solution");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, 
                    "Equations with double roots x1 = x2 = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, 
                    "The equation has two distinct solutions x1 = " + x1 + " and x2 = " + x2);
            }
        }
    }
}
