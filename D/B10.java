import java.util.Scanner;

public class B10 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong cac xau n: ");
        int n = input.nextInt(), max=0, j=0;
        String s[] = new String[n];
        s[0] = input.nextLine();
        System.out.println("Nhap mang xau: ");
        for(int i=0;i<n;i++){
            s[i] = input.nextLine();
            if ( s[i].length() > max ) {
                max=s[i].length();
                j=i;
            }
        }
        System.out.println("Xau co do dai lon nhat:\n"+s[j]);
    }
}