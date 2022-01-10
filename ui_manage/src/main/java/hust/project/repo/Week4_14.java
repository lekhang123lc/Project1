package hust.project.repo;

import java.util.Scanner;

public class Week4_14 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        System.out.print("Nhap n: ");
        int n = Integer.valueOf(lines[0]);
        StringBuilder s = new StringBuilder("1111100000");
        for(int i=1;i<n;i++){
            s.insert(0, s.charAt(9));
            s.deleteCharAt(9);
        }
        System.out.println("Xau thu n la: "+s.toString());
        return output.toString();
    }
}