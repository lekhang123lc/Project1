package hust.project.repo;

import java.util.Scanner;

public class Week3_6 {

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
        System.out.println("Cac so la uoc cua mot so khac trong day: ");
        output.append("Cac so la uoc cua mot so khac trong day: \n");
        for(int i=0;i<n;i++){
            int check = 0;
            for(int j=0;j<n;j++){
                if ( i != j && a[j]%a[i] == 0 ) check=1;
            }
            if ( check == 1 ){
                System.out.print(a[i]+" ");
                output.append(a[i]+" ");
            }
        }
        return output.toString();
    }
}