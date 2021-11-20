import java.util.Scanner;

public class B3 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String s = input.nextLine();
        String ten="";
        for(int i=s.length()-1;i>0;i--){
            if ( s.charAt(i) == ' ' ) {
                ten = s.substring(i+1,s.length());
                break;
            }
        }
        System.out.println("Ten: "+ten);
    }
}