package hust.project.repo;

public class Week1_1 {
    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        for(int i=2;i<100;i++){
            int check = 0;
            for(int j=2;j<i;j++){
                if ( i%j == 0 ) {
                    check=1;
                    break;
                }
            }
            if ( check == 1 ) {
                System.out.print(i+" ");
                output.append(i+" ");
            }
        }
        return output.toString();
    }
}