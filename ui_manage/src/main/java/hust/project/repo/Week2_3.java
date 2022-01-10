package hust.project.repo;

import java.util.Scanner;

public class Week2_3 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        System.out.print("Nhap N: ");
        int n = Integer.valueOf(args);
        int h=1,k=0;
        double s=0;
        for(int i=1;i<=n;i++){
            h*=i;
            k+=h;
            s+=(double)1/k;
        }
        System.out.println(String.format("%.6f",s));
        output.append(String.format("%.6f",s));
        return output.toString();
    }
}