package hust.project.repo;

public class Week1_9 {
    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        int n = 100;
        System.out.print(n+"=");
        int first=1;
        for(int i=2;i<=n;i++){
            while( n%i == 0 ){
                n/=i;
                if ( first == 1 ){
                    System.out.print(i);
                    output.append(i);    
                    first=0;
                }
                else{
                    output.append("."+i);
                    System.out.print("."+i);
                }
            }
        }
        return output.toString();
    }
}