package hust.project.repo;

import java.util.Scanner;

public class Week2_4 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        System.out.print("Nhap N: ");
        int n = Integer.valueOf(args);
        int f1=1,f2=2,fn=0;
        for(int i=3;i<=n;i++){
            fn=f1+f2;
            f1=f2;
            f2=fn;
        }
        if ( n == 1 ) fn=f1;
        if ( n == 2 ) fn=f2;
        System.out.println(fn);
        output.append(fn);
        return output.toString();
    }
}