import java.util.Scanner;

public class B8 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap xau s1: ");
        String s1 = input.nextLine();
        System.out.print("Nhap xau s2: ");
        String s2 = input.nextLine();
        int dem=0;
        for(int i=0;i<=s2.length()-s1.length();i++){
            int check=1;
            for(int j=0;j<s1.length();j++){
                if ( s1.charAt(j) != s2.charAt(i+j) ){
                    check=0;
                    break;
                }
            }
            dem+=check;
        }
        System.out.println("So lan s1 xuat hien trong s2: "+dem);
    }
}