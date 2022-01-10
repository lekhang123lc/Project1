package hust.project.repo;

import java.util.Scanner;

public class Week2_1 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        
        System.out.print("Nhap N: ");
        int n = Integer.valueOf(args);
        int h=0;
        double s=0;
        for(int i=1;i<=n;i++){
            h+=i;
            s+=(double)1/h;
        }
        System.out.println(String.format("%.6f",s));
        output.append(String.format("%.6f",s));
        return output.toString();
    }
}