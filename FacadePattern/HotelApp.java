package FacadePattern;
import java.util.*;

public class HotelApp{
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continueServices = true;

            System.out.println("Welcome to the Hotel Management System.");

            while (continueServices) {
                System.out.println("\nPlease choose a service:\n1. Valet Parking\n2. Housekeeping\n3. Luggage Cart Request\n4. Exit");
                System.out.print("Enter your choice (1-4): ");

                String input = scanner.nextLine().trim();
                int choice;
                try {
                    choice = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number between 1 and 4.");
                    continue;
                }

                switch (choice) {
                    case 1:
                        System.out.print("Enter vehicle plate number for valet pick-up: ");
                        String plateNumber = scanner.nextLine().trim();
                        if (plateNumber.isEmpty()) {
                            System.out.println("Plate number cannot be empty.");
                            continue;
                        }
                        frontDesk.pickUpVehicle(plateNumber);
                        break;
                    case 2:
                        System.out.print("Enter room number for cleaning: ");
                        String roomNumber = scanner.nextLine().trim();
                        if (roomNumber.isEmpty()) {
                            System.out.println("Room number cannot be empty.");
                            continue;
                        }
                        frontDesk.cleanRoom(roomNumber);
                        break;
                    case 3:
                        System.out.print("Enter number of luggage carts needed: ");
                        String cartInput = scanner.nextLine().trim();
                        int numberOfCarts;
                        try {
                            numberOfCarts = Integer.parseInt(cartInput);
                            if (numberOfCarts <= 0) {
                                System.out.println("Please enter a positive number of carts.");
                                continue;
                            }
                            frontDesk.requestCart(numberOfCarts);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid number.");
                            continue;
                        }
                        break;
                    case 4:
                        continueServices = false;
                        System.out.println("Thank you for using the Hotel Management System.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a number between 1 and 4.");
                }
            }
        }
    }
}