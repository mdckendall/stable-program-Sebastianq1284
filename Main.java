import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Stable stable = new Stable();
    // Ask the user for the address of the stable
    System.out.println("What is the address of the stable?");
    String address = scanner.nextLine();
    stable.setAddress(address);    
    // Enter infinite loop
    while (true) {
      System.out.println("Do you wish to add a horse to the stable? (y/n)");
      char input = scanner.next().charAt(0);
      scanner.nextLine();
      if (input == 'y') {
        System.out.println("What is the name of the horse?");
        String name = scanner.nextLine();
        System.out.println("What is the weight of the horse?");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter true if the horse is tame or false if it is not.");
        boolean isTamed = scanner.nextBoolean();
        scanner.nextLine();
        // array
        Horse horse = new Horse(name, weight, isTamed);
        stable.addHorse(horse);
      } else {
        break; //"n" breaks the loop
      }
    } 
    // Display the address of the stable and the details of each horse in the stable
    System.out.println("\nStable address: " + stable.getAddress());
    
    for (Horse horse : stable.getHorses()) {
      System.out.println("Horse name: " + horse.getName());
      System.out.println("Horse weight: " + horse.getWeight());
      System.out.println("Horse is tamed: " + horse.isTamed());
      System.out.println("");
    }
  }
}

