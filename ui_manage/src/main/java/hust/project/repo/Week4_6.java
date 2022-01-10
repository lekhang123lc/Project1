package hust.project.repo;

import java.util.Scanner;

public class Week4_6 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        System.out.println("Nhap xau: ");
        String s = lines[0];
        StringBuilder r = new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            r.append(s.charAt(i));
        }
        System.out.println("Xau bien doi:\n"+r.toString());
        output.append("Xau bien doi:\n"+r.toString());
        return output.toString();
    }
}