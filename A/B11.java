import java.util.Random;

public class B12 {

    public static void main(String[] args) {
        System.out.println("20180108 Le Tuan Khang");
        int len = 10;
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Random ran = new Random();
        int n = ran.nextInt(9)+1;
        System.out.println("Day ban dau:");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=1;i<=n;i++){
            int r1 = ran.nextInt(len);
            int r2 = ran.nextInt(len);
            int tmp = arr[r1];
            arr[r1]=arr[r2];
            arr[r2]=tmp;
        }

        System.out.println("\nDay sau khi hoan doi "+n+" lan ngau nhien:");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}