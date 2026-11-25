public class Assignment14 {
   static int sum =0;
   static int average;
    static void main() {
        int [] number ={34,5,43,45,2,45,56,66,70};

        average(number);
    }
    public static void average(int[] array2){
        for (int counter : array2){
            sum +=counter;
            average=sum/array2.length;
        }
        System.out.println(sum);
        System.out.println(average);
    }
}
