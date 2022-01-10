package hust.project.repo;

import java.util.Scanner;

public class Week4_1 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        System.out.print("Nhap ten: ");
        StringBuilder ten = new StringBuilder(lines[0]);
        for(int i=0;i<ten.length()-1;i++){
            if ( ten.charAt(i) == ' ' && ten.charAt(i+1) == ' ' ) {
                ten.deleteCharAt(i);
                i--;
            }
        }
        if ( ten.charAt(0) == ' ' ) ten.deleteCharAt(0);
        if ( ten.charAt(ten.length()-1) == ' ' ) ten.deleteCharAt(ten.length()-1);

        System.out.print("Ten sau khi chinh sua: "+ten.toString());
        output.append("Ten sau khi chinh sua: "+ten.toString());
        return output.toString();
    }
}