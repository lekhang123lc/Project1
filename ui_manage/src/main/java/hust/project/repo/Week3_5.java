package hust.project.repo;

import java.util.Scanner;

public class Week3_5 {

    public static int checkPrimary(int x){
        for(int i=2;i<=x/2;i++){
            if ( x%i == 0 ) return 0;
        }
        return 1;
    }

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        int n = Integer.valueOf(lines[0]);
        String input[] = lines[1].split("\\s+");
        int a[] = new int[n];
        System.out.println("Nhap mang: ");
        for(int i=0;i<n;i++){
            a[i]=Integer.valueOf(input[i]);
        }
        int num_primary=0;
        for(int i=0;i<n;i++)
            num_primary+=checkPrimary(a[i]);
        System.out.println("So cac so nguyen to: "+num_primary);
        System.out.println("So cac so hop to: "+(n-num_primary));
        output.append("So cac so nguyen to: "+num_primary+"\n");
        output.append("So cac so hop to: "+(n-num_primary)+"\n");
        
        return output.toString();
    }
}