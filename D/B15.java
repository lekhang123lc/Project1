import java.util.Scanner;

public class B15 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        String s,s1,s2;
        System.out.print("Nhap xau s: ");
        s = input.nextLine();
        System.out.print("Nhap xau s2: ");
        s2 = input.nextLine();
        System.out.print("Nhap xau s1: ");
        s1 = input.nextLine();
        String s3 = s + s1 + s2;
        
        System.out.println("Ket qua chen xau s1 giua s2 va s3 la: "+s3);
    }
}