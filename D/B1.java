import java.util.Scanner;

public class B1 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        StringBuilder ten = new StringBuilder(input.nextLine());
        for(int i=0;i<ten.length()-1;i++){
            if ( ten.charAt(i) == ' ' && ten.charAt(i+1) == ' ' ) {
                ten.deleteCharAt(i);
                i--;
            }
        }
        if ( ten.charAt(0) == ' ' ) ten.deleteCharAt(0);
        if ( ten.charAt(ten.length()-1) == ' ' ) ten.deleteCharAt(ten.length()-1);

        System.out.print("Ten sau khi chinh sua: "+ten.toString());
    }
}