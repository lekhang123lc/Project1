import java.util.Scanner;

public class B6 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String s = input.nextLine();
        StringBuilder r = new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            r.append(s.charAt(i));
        }
        System.out.println("Xau bien doi:\n"+r.toString());
    }
}