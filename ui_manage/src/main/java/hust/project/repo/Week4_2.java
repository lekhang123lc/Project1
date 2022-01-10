package hust.project.repo;

import java.util.Scanner;

public class Week4_2 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        System.out.print("Nhap xau: ");
        String s = lines[0];
        int dem=0;
        for(int i=0;i<s.length()-2;i++){
            if ( s.charAt(i) == 'a' && s.charAt(i+1) == 'b' && s.charAt(i+2) == 'c' ) dem++;
        }
        System.out.print("So lan xuat hien xau abc: "+dem);
        output.append("So lan xuat hien xau abc: "+dem);
        return output.toString();
    }
}