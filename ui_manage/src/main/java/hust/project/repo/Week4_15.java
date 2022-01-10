package hust.project.repo;

import java.util.Scanner;

public class Week4_15 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        String s,s1,s2;
        System.out.print("Nhap xau s: ");
        s = lines[0];
        System.out.print("Nhap xau s2: ");
        s2 = lines[1];
        System.out.print("Nhap xau s1: ");
        s1 = lines[2];
        String s3 = s + s1 + s2;
        
        System.out.println("Ket qua chen xau s1 giua s2 va s3 la: "+s3);
        output.append("Ket qua chen xau s1 giua s2 va s3 la: "+s3);
        return output.toString();
    }
}