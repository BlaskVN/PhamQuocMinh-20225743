import javax.swing.JOptionPane;

public class answer {
    public static void main(String[] args) {
        Object[] options = {"I do","I don't","Cancel"};
        
        int option = JOptionPane.showOptionDialog(null, "Do you want to change to the first class ticket?",
            "Choose an option", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        JOptionPane.showMessageDialog(null, "You've chosen: " + (option==0 ? options[option] : "I don't"));
        
        System.exit(0);
    }
}
