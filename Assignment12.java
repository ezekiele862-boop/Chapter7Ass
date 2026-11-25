import java.util.Arrays;
import java.util.Scanner;
public class Assignment12 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[10];
        int [] savedArray = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

//        for (int i=0; i<array.length; i++){
//            array[i]=-1;
//        }
        for (int i = 0; i<array.length; i++){
            int value=0;
            while (value < 10 || value > 100) {
                System.out.println("Enter numbers between 10 to 100: ");
                value = scanner.nextInt();
                if (value < 10 || value > 100) {
                    System.out.println("Invalid number");
                }
            }
            savedArray[i]=value;
        }
        System.out.println(Arrays.toString(savedArray));

    }


}
