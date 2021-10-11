public class B3 {
    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        for(int i=1000;i<=2000;i++){
            int check = 0;
            for(int j=2;j<i;j++){
                if ( i%j == 0 ) {
                    check=1;
                    break;
                }
            }
            if ( check == 0 ) {
                System.out.print(i+" ");
            }
        }
    }
}