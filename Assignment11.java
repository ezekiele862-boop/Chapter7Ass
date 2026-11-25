import java.util.Arrays;

public class Assignment11 {
    static void main() {
        int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int value = 0;
        int [] array2 = new int[20];
        int [] bestScore = new int[10];

        for (int counter = 10; counter < 20; counter++){
            System.out.println(array[counter]);
        }
        for (int count =0; count< array.length; count++){
            array2[value] = array[count]*2;
            value++;
        }
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < 10; i++){
            bestScore[i]=array[i];
            System.out.println(bestScore[i]);
        }
    }
}
