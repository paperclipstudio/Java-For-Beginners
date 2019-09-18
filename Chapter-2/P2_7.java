import java.util.Scanner;

class P2_7{
  public static void main(String[] args) {
    final String bar = "-----------------------------";
    Scanner in = new Scanner(System.in);
    System.out.println(bar);
    System.out.println("should you get a hybrid car?");
    System.out.println(bar);
    System.out.println("Please enter the following details");
    System.out.println("Cost of new car: ");
    int newCarPrice = in.nextInt();
    System.out.println("Estimated petrolprice (£/L): ");
    float petrolPrice = in.nextFloat();
    System.out.println("Your average distance (Km): ");
    int mileage = in.nextInt();
    System.out.println("Fuel efficiency of petrol car (km/L): ");
    float fuelEfficiency = in.nextFloat();
    System.out.println("Estimated resale value of car in five years: ");
    int resale = in.nextInt();
    System.out.println("Cost of new electric car: ");
    int newEletricPrice = in.nextInt();
    System.out.println("Estimated resale value of the electric car in five years: ");
    int elecResale = in.nextInt();

    System.out.println(bar);
    System.out.println(bar);
    float totalPetrol = newCarPrice + petrolPrice * mileage * fuelEfficiency;
    totalPetrol -= resale;
    System.out.printf("The cost of a car will be £%3f\n", totalPetrol);
    float totalElectic = newEletricPrice - elecResale;
    System.out.printf("The cost of a electric car will be £%3.2f\n", totalElectic);

    if (totalPetrol < totalElectic) {
      System.out.print("I will save you money to get a petrol car in the long run,\n but will it save the planet?\n");
    } else {
      System.out.print("Well it looks like we are in the future now where the best thing \n also saves you money!");
    }

    };
};
