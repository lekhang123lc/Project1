import java.util.Scanner;

public class B5 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String s = input.nextLine();
        StringBuilder r = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            int x = (int)'1'-(int)s.charAt(i);
            char c = (char)('0'+x);
            r.append(c);
        }
        System.out.println("Xau bien doi:\n"+r.toString());
    }
}