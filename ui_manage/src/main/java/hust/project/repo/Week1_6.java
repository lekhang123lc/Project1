package hust.project.repo;

public class Week1_6 {
    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        int n=0,m=1;
        while(n<5){
            int check=m;
            for(int i=1;i<=m/2;i++){
                if ( m%i == 0 ) check-=i;
            }
            if ( check == 0 ) {
                n++;
                System.out.print(m+" ");
                output.append(m+" ");
            }
            m++;
        }
        return output.toString();
    }
}