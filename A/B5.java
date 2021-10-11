public class B5 {
    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        for(int i=1000;i<=2000;i++){
            if ( i%3 == 0 && i%5 == 0 && i%7 == 0 ) {
                System.out.print(i+" ");
            }
        }
    }
}