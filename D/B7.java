import java.util.Scanner;

public class B7 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String s = input.nextLine();
        StringBuilder r = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            int x = (int)s.charAt(i);
            if ( (int)'0' <= x && x <= (int)'9' ) r.append('$');
            else r.append((char)x);
        }
        System.out.println("Xau bien doi:\n"+r.toString());
    }
}