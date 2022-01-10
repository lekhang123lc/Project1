package hust.project.repo;

import java.util.Scanner;

public class Week4_8 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        System.out.print("Nhap xau s1: ");
        String s1 = lines[0];
        System.out.print("Nhap xau s2: ");
        String s2 = lines[1];
        int dem=0;
        for(int i=0;i<=s2.length()-s1.length();i++){
            int check=1;
            for(int j=0;j<s1.length();j++){
                if ( s1.charAt(j) != s2.charAt(i+j) ){
                    check=0;
                    break;
                }
            }
            dem+=check;
        }
        System.out.println("So lan s1 xuat hien trong s2: "+dem);
        output.append("So lan s1 xuat hien trong s2: "+dem);
        return output.toString();
    }
}