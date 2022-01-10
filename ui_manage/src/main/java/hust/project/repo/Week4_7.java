package hust.project.repo;

import java.util.Scanner;

public class Week4_7 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        System.out.println("Nhap xau: ");
        String s = lines[0];
        StringBuilder r = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            int x = (int)s.charAt(i);
            if ( (int)'0' <= x && x <= (int)'9' ) r.append('$');
            else r.append((char)x);
        }
        System.out.println("Xau bien doi:\n"+r.toString());
        output.append("Xau bien doi:\n"+r.toString());
        return output.toString();
    }
}