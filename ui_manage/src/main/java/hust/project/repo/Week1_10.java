package hust.project.repo;

public class Week1_10 {
    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        int n = 100;
        System.out.println(n);
        for(int i=2;i<=n;i++){
            if ( n%i == 0 ){
                System.out.print(i+" ");
                output.append(i+" ");
            }
            while( n%i == 0 ){
                n/=i;
            }
        }
        return output.toString();
    }
}