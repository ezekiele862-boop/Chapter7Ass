import java.util.Arrays;

public class Assignment16 {
    static void main() {
        int [] array ={-5,-4,-3,-2,-1,0,1,2,3,4,5};
//        int [] value = new int[11];

//        for (int num : array){
//
//        }
        AbsoluteValue(array);

    }
    public static void AbsoluteValue(int [] array1){
        int [] value = new int[11];
        for (int i= 0; i < array1.length;i++){

            if (Math.abs(array1[i])==array1[i]){

                value[i]=array1[i];
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}
