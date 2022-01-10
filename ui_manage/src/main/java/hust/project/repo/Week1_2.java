package hust.project.repo;

public class Week1_2 {
    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
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
                output.append(m+" ");
            }
            m++;
        }
        return output.toString();
    }
}