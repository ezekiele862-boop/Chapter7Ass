import java.util.Scanner;
public class Assignment21 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 3){
            System.out.println("Airline Reservations System");
            System.out.println("1: First Class Section.");
            System.out.println("2: Economy Section.");
            System.out.println("3: Exit ");

            System.out.println("Enter one option: ");
            choice=scanner.nextInt();

            switch (choice){

                case 1:
                    int seat =-1;
                    seat= AirlineBookingSystem.bookingSystem(false,false,"FirstClass");
                    if (seat==-1){
                        System.out.println("first class is full.");
                        System.out.println("would you accept Economy? (1 = Yes, 2 = No): ");
                        int answer = scanner.nextInt();

                        if (answer == 1) {
                            seat = AirlineBookingSystem.bookingSystem(true,true,"Economy");
                            System.out.println("First class");

                        }
                    }
                   break;
                case 2:
                    seat= AirlineBookingSystem.bookingSystem(false,false,"Economy");
                    if (seat==-1){
                        System.out.println("Economy is ful.");
                        System.out.println("would you accept First Class? (1 = Yes, 2 = No): ");
                        int answer = scanner.nextInt();

                        if (answer == 1) {
                            seat = AirlineBookingSystem.bookingSystem(true,true,"FirstClass");
                            System.out.println("Economy class");

                        }
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("invalid option");

            }



        }
    }
}
