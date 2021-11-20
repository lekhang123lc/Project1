import java.util.Scanner;

public class B14 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        StringBuilder s = new StringBuilder("1111100000");
        for(int i=1;i<n;i++){
            s.insert(0, s.charAt(9));
            s.deleteCharAt(9);
        }
        System.out.println("Xau thu n la: "+s.toString());
    }
}