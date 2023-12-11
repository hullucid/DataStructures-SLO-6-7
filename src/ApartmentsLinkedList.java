import java.util.LinkedList;
import java.util.Scanner;


public class ApartmentsLinkedList {
    public static void main(String[] args) {
        LinkedList<Apartment> apartmentsList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter street address (or enter 'q' to quit): ");
            String streetAddress = scanner.nextLine();
            if (streetAddress.equals("q")) {
                break;
            }

            System.out.print("Enter apartment number: ");
            int apartmentNumber = scanner.nextInt();

            System.out.print("Enter monthly rent: ");
            double monthlyRent = scanner.nextDouble();

            System.out.print("Enter number of bedrooms: ");
            int numberOfBedrooms = scanner.nextInt();

            scanner.nextLine();

            Apartment apartment = new Apartment(streetAddress, apartmentNumber, monthlyRent, numberOfBedrooms);
            apartmentsList.add(apartment);
        }

        apartmentsList.sort(null);

        System.out.println("\nSorted list of apartments:");
        for (Apartment apartment : apartmentsList) {
            System.out.println(apartment.toString());
        }
    }
}

