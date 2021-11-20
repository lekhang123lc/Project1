import java.util.Scanner;

public class B9 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap xau s: ");
        String s = input.nextLine();
        System.out.print("Nhap 2 vi tri doi cho: ");
        int u=input.nextInt(), v= input.nextInt();

        StringBuilder r = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            int x = (int)s.charAt(i);
            if ( i == u-1 ) r.append(s.charAt(v-1));
            else if ( i == v-1 ) r.append(s.charAt(u-1));
            else r.append(s.charAt(i));
        }
        System.out.println("Xau bien doi:\n"+r.toString());
    }
}