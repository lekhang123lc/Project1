package hust.project.repo;

import java.util.Scanner;

public class Week4_10 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        System.out.print("Nhap so luong cac xau n: ");
        int n = Integer.valueOf(lines[0]), max=0, j=0;
        String s[] = new String[n];
        s[0] = lines[1];
        System.out.println("Nhap mang xau: ");
        for(int i=0;i<n;i++){
            s[i] = lines[i+2];
            if ( s[i].length() > max ) {
                max=s[i].length();
                j=i;
            }
        }
        System.out.println("Xau co do dai lon nhat:\n"+s[j]);
        output.append("Xau co do dai lon nhat:\n"+s[j]);
        return output.toString();
    }
}