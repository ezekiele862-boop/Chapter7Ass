import java.util.Arrays;
import java.util.Scanner;
public class AirlineBookingSystem {
    static Scanner scanner = new Scanner(System.in);
    static boolean[] booking = new boolean[10];
    private static int findAvailableSeat(int start, int end) {
        for (int i=start;i<end;i++){
            if (!booking[i]){
                return i;
            }
        }
        return -1;
    }

    public static int  bookingSystem(boolean economyClass, boolean firstClass, String type) {
        int seat =   findAvailableSeat(0,5);
        if (type.equals("FirstClass")&&seat!=-1){
            booking[seat]=true;
            System.out.println("Your sit number is: "+ seat);
            System.out.println(Arrays.toString(booking));
            return seat+1;
        }
        if (economyClass){
            seat = findAvailableSeat(5,10);
            if (type.equals("Economy")&&seat!=-1){
                booking[seat]=true;
                System.out.println("Your sit number is: "+ seat);
                System.out.println(Arrays.toString(booking));
                return seat+1;
            }
        }
        int value = findAvailableSeat(5,10);
        if (type.equals("Economy")&&value!=-1){

            booking[value]=true;
            System.out.println("Your sit number is: "+ value);
            System.out.println(Arrays.toString(booking));
            return value+1;
        }
        if (firstClass){
            value = findAvailableSeat(0,4);
            if (type.equals("FirstClass")&&value!=-1){
                booking[value]=true;
                System.out.println("Your sit number is: "+ value);
                System.out.println(Arrays.toString(booking));
                return value+1;
            }
        }
       return -1;
    }

}
