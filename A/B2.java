public class B2 {
    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        int n=0,m=2;
        while(n<20){
            int check=1;
            for(int i=2;i<m/2;i++){
                if ( m%i == 0 ) check=0;
            }
            if ( check == 1 ) {
                n++;
                System.out.print(m+" ");
            }
            m++;
        }
    }
}