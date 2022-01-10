package hust.project.repo;

public class Week1_7 {
    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        int d0=0,d1=0,d2=0,d3=0;
        for(int i=1;i<=100;i++){
            if( i%5 == 0 ) d0++;
            if( i%5 == 1 ) d1++;
            if( i%5 == 2 ) d2++;
            if( i%5 == 3 ) d3++;
        }
        System.out.println("So cac so chia het cho 5 "+d0);
        System.out.println("So cac so chia 5 du 1 "+d1);
        System.out.println("So cac so chia 5 du 2 "+d2);
        System.out.println("So cac so chia 5 du 3 "+d3);


        output.append("So cac so chia het cho 5 "+d0+"\n");
        output.append("So cac so chia 5 du 1 "+d1+"\n");
        output.append("So cac so chia 5 du 2 "+d2+"\n");
        output.append("So cac so chia 5 du 3 "+d3+"\n");
        return output.toString();
    }
}