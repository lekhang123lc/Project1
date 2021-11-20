import java.util.Scanner;

public class B2 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap xau: ");
        String s = input.nextLine();
        int dem=0;
        for(int i=0;i<s.length()-2;i++){
            if ( s.charAt(i) == 'a' && s.charAt(i+1) == 'b' && s.charAt(i+2) == 'c' ) dem++;
        }
        System.out.print("So lan xuat hien xau abc: "+dem);
    }
}