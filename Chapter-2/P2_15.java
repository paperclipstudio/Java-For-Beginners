import java.util.Scanner;

class P2_15 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please input a number: ");
    if (in.hasNextLine()) {
      String number = in.nextLine();
      int letterCount = 0;
      while (letterCount < number.length()) {
        if (number.charAt(letterCount) == ',') {
          number = number.substring(0,letterCount-1) + number.substring(letterCount+1);
          letterCount--;
        }
      letterCount++;
      }
      System.out.printf("Your new number %s", number);
    } else {
      System.out.println("Sorry please enter a number as a string");
    }
  }
}
