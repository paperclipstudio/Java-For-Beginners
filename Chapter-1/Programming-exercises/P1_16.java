import javax.swing.JOptionPane;

public class P1_16 {
  public static void main (String[] args) {
    String name = JOptionPane.showInputDialog("What is your name");
    JOptionPane.showInputDialog("Hello, my name is Hal!, What would you like me to do?");
    System.out.printf("I'm sorry %s, I can't let you do that...", name);
    System.exit(0);
  }
}
