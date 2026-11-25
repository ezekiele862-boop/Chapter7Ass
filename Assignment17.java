import java.security.SecureRandom;
import java.util.Arrays;

public class Assignment17 {
    static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        int [] array = new int[6];
        int sum =0;

        for (int i =0; i < 36_000_000; i++){

            int die1 =1 + randomNumber.nextInt(6);
            int die2 =1 +  randomNumber.nextInt(6);
            sum = die1+die2;


        }



    }
}
