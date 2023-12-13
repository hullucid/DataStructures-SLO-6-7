import java.util.LinkedList;
import java.util.Scanner;
//Jeremy Rogers
//Course: Programming Fundamentals III
//Professor: Inetha Sheffield

public class ApartmentsLinkedList {
    public static void main(String[] args) {
        LinkedList<Apartment> apartmentsList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        //Prompt user for street address, q being used as a break
        while (true) {
            System.out.print("Enter street address (or enter 'q' to quit): ");
            String streetAddress = scanner.nextLine();
            if (streetAddress.equals("q")) {
                break;
            }

            //prompt user for apartment number
            System.out.print("Enter apartment number: ");
            int apartmentNumber = scanner.nextInt();
            //prompt user for monthly rent
            System.out.print("Enter monthly rent: ");
            double monthlyRent = scanner.nextDouble();
            //prompt user for number of bedrooms
            System.out.print("Enter number of bedrooms: ");
            int numberOfBedrooms = scanner.nextInt();

            scanner.nextLine();
            //list for users apartments and apartment information
            Apartment apartment = new Apartment(streetAddress, apartmentNumber, monthlyRent, numberOfBedrooms);
            apartmentsList.add(apartment);
        }
        //sort apartment list information
        apartmentsList.sort(null);
        //print all apartments and their info
        System.out.println("\nSorted list of apartments:");
        for (Apartment apartment : apartmentsList) {
            System.out.println(apartment.toString());
        }
    }
}

