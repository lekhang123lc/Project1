package hust.project.repo;

import java.util.Scanner;

public class Week4_3 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        System.out.print("Nhap ten: ");
        String s = lines[0];
        String ten="";
        for(int i=s.length()-1;i>0;i--){
            if ( s.charAt(i) == ' ' ) {
                ten = s.substring(i+1,s.length());
                break;
            }
        }
        System.out.println("Ten: "+ten);
        output.append("Ten: "+ten);
        return output.toString();
    }
}