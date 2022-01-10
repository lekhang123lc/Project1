package hust.project.repo;

import java.util.Scanner;

public class Week4_11 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        System.out.print("Nhap so hoc sinh: ");
        int n = Integer.valueOf(lines[0]);
        System.out.println("Nhap danh sach ten: ");
        
        int x=0;
        for(int j=0;j<n;j++){
            String s = lines[j+1];
            String ho="",dem="",ten="";
            
            for(int i=0;i<s.length();i++){
                if ( s.charAt(i) == ' ' ) {
                    ho = s.substring(0,i);
                    break;
                }
            }
            for(int i=s.length()-1;i>0;i--){
                if ( s.charAt(i) == ' ' ) {
                    ten = s.substring(i+1,s.length());
                    break;
                }
            }
            dem = s.substring(ho.length()+1,s.length()-ten.length()-1);

            if ( ten.equals("An") ) x++;
        }
        
        System.out.println("So hoc sinh ten An la: "+x);
        output.append("So hoc sinh ten An la: "+x);
        return output.toString();
    }
}