public class B10 {
    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        int n = 100;
        System.out.println(n);
        for(int i=2;i<=n;i++){
            if ( n%i == 0 ){
                System.out.print(i+" ");
            }
            while( n%i == 0 ){
                n/=i;
            }
        }
    }
}