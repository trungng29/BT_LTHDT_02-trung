import javax.swing.*;

public class BT_LTHDT_02 {
    public static void main(String[] args) {
        Object[] options = {"Register", "Login"};
        int choice = JOptionPane.showOptionDialog(null, 
                                                  "Register or Login", 
                                                  "Choose option", 
                                                  JOptionPane.YES_NO_OPTION, 
                                                  JOptionPane.QUESTION_MESSAGE, 
                                                  null, 
                                                  options, 
                                                  options[0]);
        switch (choice) {
            case JOptionPane.YES_OPTION -> {
                RegisterFrame rf = new RegisterFrame();
                rf.setVisible(true);
            }
            case JOptionPane.NO_OPTION -> {
                LoginFrame lf = new LoginFrame();
                lf.setVisible(true);
            }
            default -> System.exit(0); 
        }
    }
}
