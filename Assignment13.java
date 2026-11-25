public class Assignment13 {
    static void main() {
        int [][] array = new int[5][6];

        for (int row =0; row < 5; row++){
            for (int col=0; col < 6;col++){
                array[1][4]=4;
                System.out.print(array[row][col]);

            }
            System.out.println();
        }
    }
}
