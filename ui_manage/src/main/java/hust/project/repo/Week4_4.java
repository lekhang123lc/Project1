package hust.project.repo;

import java.util.Scanner;

public class Week4_4 {

    public static String run(String args) {
        StringBuilder output = new StringBuilder("");
        System.out.println("20180108 Le Tuan Khang");
        String lines[] = args.split("\\r?\\n");
        System.out.print("Nhap ten: ");
        String s = lines[0];
        String ho="", dem="", ten="";
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
        System.out.println("Ho: "+ho+" "+dem);
        output.append("Ho: "+ho+" "+dem);
        return output.toString();
    }
}