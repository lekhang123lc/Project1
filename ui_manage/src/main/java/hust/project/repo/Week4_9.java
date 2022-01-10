package hust.project.repo;

import java.util.Scanner;

public class Week4_9 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        System.out.print("Nhap xau s: ");
        String s = lines[0];
        System.out.print("Nhap 2 vi tri doi cho: ");
        String input[] = lines[1].split("\\s+");
        int u=Integer.valueOf(input[0]), v= Integer.valueOf(input[1]);;

        StringBuilder r = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            int x = (int)s.charAt(i);
            if ( i == u-1 ) r.append(s.charAt(v-1));
            else if ( i == v-1 ) r.append(s.charAt(u-1));
            else r.append(s.charAt(i));
        }
        System.out.println("Xau bien doi:\n"+r.toString());
        output.append("Xau bien doi:\n"+r.toString());
        return output.toString();
    }
}