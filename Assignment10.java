public class Assignment10 {
    static void main() {
        int [] pixel = {5,39,59,89,109,127,150,179,179,200};

        for (int i=0; i< pixel.length;i++){
            if (pixel[i]>0 && pixel[i]<=20){
                pixel[i]=10;
            } else if (pixel[i]<=40 && pixel[i]>=21) {
                pixel[i]=30;
            } else if (pixel[i]<=60 && pixel[i]>=41) {
                pixel[i]=50;
            } else if (pixel[i]<=80 && pixel[i]>=61) {
                pixel[i]=70;
            } else if (pixel[i]<=100 && pixel[i]>=81) {
                pixel[i]=90;
            } else if (pixel[i]<120 && pixel[i]>=101) {
                pixel[i]= 101;
            } else if (pixel[i]<=140 && pixel[i]>=121) {
                pixel[i]=130;
            } else if (pixel[i]<=160 && pixel[i]>= 141) {
                pixel[i]=150;
            } else if (pixel[i]<=180 && pixel[i]>= 161) {
                pixel[i]= 170;
            }
            else {
                pixel[i]=190;
            }
        }
        for (int value : pixel){
            System.out.println(value + " ");
        }
    }
}
