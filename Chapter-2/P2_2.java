import java.util.Scanner;

public class P2_2 {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Welcome to your own personal statatian!, Please enter");
      System.out.println("First number: ");
      int first = in.nextInt();
      System.out.println("Second number: ");
      int second = in.nextInt();
      System.out.printf("first: %d, Second: %d\n", first,second);
      int big = Math.max(first, second);
      int small = Math.min(first, second);
      System.out.printf("The Sum       : %10d\nThe Differince: %10d\nThe Product   : %10d\nThe Average   :    %10.2f\nThe Distance  : %10d\nThe Maximum   : %10d\nThe Minimum   : %10d", (big + small), first - second, big * small, big * small / 2.0, big - small, big, small);
  }
}
