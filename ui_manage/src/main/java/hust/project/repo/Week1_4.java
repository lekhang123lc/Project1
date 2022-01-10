package hust.project.repo;

public class Week1_4 {
    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        for(int i=1;i<=100;i++){
            if ( i%3 ==0 && i%7 == 0 ) {
                System.out.print(i+" ");
                output.append(i+" ");
            }
        }
        return output.toString();
    }
}