import javax.swing.JOptionPane;

public class P1_15 {
  public static void main (String[] args) {
    String name = JOptionPane.showInputDialog("What is your name");
    System.out.printf("Hello, %s!", name);
    System.exit(0);
  }
}
