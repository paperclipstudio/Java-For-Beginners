import java.util.Scanner;

class P2_3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter a Distance in meters ->");
    int length = in.nextInt();
    System.out.printf("You entered %dm\n", length);
    System.out.printf("Which is %f miles\n", length / 1609.0);
    System.out.printf("Which is %f feet\n", length / 0.3048);
    System.out.printf("Which is %f inches\n", length / 0.0254);
  }
}
