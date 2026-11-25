public class Assignment15 {
    static void main() {
        int [] array = {34,56,3,78,12,67,99};

        int max=array[0];
        int min=array[0];
        for (int count =0; count < array.length;count++){
            if (array[count]> max){
                max = array[count];
            }
            if (array[count] < min){
                min = array[count];
            }
        }

        System.out.println(max);
        System.out.println(min);

    }


}
