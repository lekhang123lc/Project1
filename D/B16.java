import java.util.Scanner;

public class B16 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap xau s1: ");
        String s1 = input.nextLine();
        System.out.print("Nhap xau s2: ");
        String s2 = input.nextLine();
        int n = s1.length(),m = s2.length();
        
        int j=0;
        for(int i=0;i<m;i++){
            if ( j < n ){
                if ( s2.charAt(i) == s1.charAt(j) ) j++;
            }
        }
        if ( j == n ){
            System.out.println("s1 la xau con cua s2 ");
        }
        else{
            System.out.println("s1 khong la xau con cua s2 ");
        }
    }
}
