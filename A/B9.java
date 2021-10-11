public class B9 {
    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        int n = 100;
        System.out.print(n+"=");
        int first=1;
        for(int i=2;i<=n;i++){
            while( n%i == 0 ){
                n/=i;
                if ( first == 1 ){
                    System.out.print(i);    
                    first=0;
                }
                else{
                    System.out.print("."+i);
                }
            }
        }
    }
}